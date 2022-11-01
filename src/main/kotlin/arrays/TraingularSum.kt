package arrays

class TraingularSum {
  /*
  fun triangularSum(nums: IntArray): Int {
    var res = ArrayList<Int>().apply{
      for (i in nums) this.add(i)
    }
    while (res.size > 1) {
      var i = 0
      val tmp = ArrayList<Int>(res.size-1)
      while (i < res.size-1) {
        val sm = res[i]+res[i+1]
        if (sm > 10)tmp.add(sm % 10)
        i++
      }
      res = tmp
    }
    return res[0]
  }
   */
  fun triangularSum(nums: IntArray): Int {
    var res = ArrayList<Int>().apply{
      for (i in nums) this.add(i)
    }
    while (res.size > 1) {
      var i = 0
      val tmp = ArrayList<Int>(res.size-1)
      while (i < res.size-1) {
        val sm = res[i]+res[i+1]
        if (sm >= 10)tmp.add(sm % 10)
        else tmp.add(sm)
        i++
      }
      res = tmp
    }
    return res[0]
  }
}

fun main() {
  val l = listOf(1,2,3,4,5)
  val t = TraingularSum()
  t.triangularSum(l.toIntArray())
}