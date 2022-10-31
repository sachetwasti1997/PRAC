package arrays

class MaxUnitsOnTruck {
  /*
  The Idea is simple sort by capacity of box and then

  fun maximumUnits(bT: Array<IntArray>, tS: Int): Int {
    bT.sortBy{it[1]}
    var trS = tS
    var ans = 0
    for (box in bT) {
      ans += trS.coerceAtMost(box[0]) * box[1]
      trS -= trS.coerceAtMost(box[0])
    }
    return ans
  }
   */
  fun maximumUnits(bT: Array<IntArray>, tS: Int): Int {
    bT.sortByDescending{it[1]}
    var trS = tS
    var ans = 0
    for (box in bT) {
      ans += trS.coerceAtMost(box[0]) * box[1]
      trS -= trS.coerceAtMost(box[0])
    }
    return ans
  }
}