package recursion

class comb_sum_3 {
  fun combinationSum3(k: Int, n: Int): List<List<Int>> {
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9)
    val tmp = ArrayList<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create(i: Int, sm: Int) {
      if (tmp.size > k) return
      if (sm == 0 && tmp.size == k) {
        res.add(ArrayList(tmp))
        return
      }
      if (sm < 0 || i >= arr.size) return
      tmp.add(arr[i])
      create(i+1, sm-arr[i])
      tmp.removeAt(tmp.size-1)
      create(i+1, sm)
    }
    create(0, n)
    return res
  }
}

fun main() {
  val c = comb_sum_3()
  c.combinationSum3(4, 1)
}