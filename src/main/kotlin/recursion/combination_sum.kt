package recursion

class combination_sum {
  fun combinationSum(c: IntArray, target: Int): List<List<Int>> {
    val tmp = ArrayList<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create(i: Int, sm: Int) {
      if (sm == 0) {
        res.add(tmp)
        return
      }
      if (i >= c.size || sm < 0) return
      tmp.add(c[i])
      create(i+1, sm - c[i])
      tmp.removeAt(tmp.size-1)
      create(i+1, sm)
    }
    create(0, target)
    return res
  }
}