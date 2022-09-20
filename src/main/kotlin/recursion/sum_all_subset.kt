package recursion

class sum_all_subset {
  fun getSum(arr: IntArray): List<Int> {
    var res = ArrayList<Int>()
    fun create(i: Int, sm: Int) {
      if (i >= arr.size) {
        res.add(sm)
        return
      }
      create(i+1, sm+arr[i])
      create(i+1, sm)
    }
    create(0, 0)
    return res
  }
}

fun main() {
  val arr = intArrayOf(2, 3, 4)
  val ss = sum_all_subset()
  ss.getSum(arr)
}