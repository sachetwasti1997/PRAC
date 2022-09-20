package recursion

class combination_sm_2 {
  fun combinationSum2(c: IntArray, target: Int): List<List<Int>> {
    c.sort()
    val tmp = ArrayList<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create(i: Int, sm: Int) {
      if (sm == 0) {
        res.add(ArrayList(tmp))
        return
      }
      if (i >= c.size || sm < 0) return
      tmp.add(c[i])
      create(i+1, sm-c[i])
      tmp.removeAt(tmp.size-1)
      var k = i
      while (k+1 < c.size && c[k] == c[k+1]) k++
      create(k+1, sm)
    }
    create(0, target)
    return res
  }
}

fun main() {
  val n = intArrayOf(10,1,2,7,6,1,5)
  val t = 8
  val c = combination_sm_2()
  c.combinationSum2(n, t)
}