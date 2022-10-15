package arrays

class RemoveIntervals {
  fun removeInterval(intervals: Array<IntArray>, r: IntArray): List<List<Int>> {
    val res = ArrayList<List<Int>>()
    for (i in intervals) {
      if (i[0] < r[0]) res.add(listOf(i[0], i[1].coerceAtMost(r[0])))
      if (i[1] > r[1]) res.add(listOf(r[1].coerceAtLeast(i[0]), i[1]))
    }
    return res
  }
}