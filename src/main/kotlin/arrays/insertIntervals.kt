package arrays

class InsertIntervals {
  fun insert(intr: Array<IntArray>, nintr: IntArray): Array<IntArray> {
    var res = intr.plusElement(nintr)
    res.sortBy{ it[0] }
    var r = ArrayList<IntArray>(res.size)
    r.add(res[0])
    var sz = 0
    for (i in res.indices) {
      if (res[i][0] <= r[sz][1]) {
        r[sz][1] = r[sz][1].coerceAtLeast(res[i][1])
      }else {
        sz++
        r.add(res[i])
      }
    }
    return r.toTypedArray()
  }
}

fun main() {
  val i = InsertIntervals()
  i.insert(arrayOf(intArrayOf(1,2), intArrayOf(3,5), intArrayOf(6,7), intArrayOf(8,10), intArrayOf(12, 16)), intArrayOf(4,8))
}