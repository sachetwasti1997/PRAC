package recursion

class all_subset_arr_dup {
  fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    val tmp = ArrayList<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create(i: Int) {
      if (i >= nums.size) {
        res.add(ArrayList(tmp))
        return
      }
      tmp.add(nums[i])
      create(i+1)
      tmp.removeAt(tmp.size - 1)

      var k = i
      while (k+1 < nums.size && nums[k] == nums[k+1]) k++
      create(k+1)
    }
    create(0)
    return res
  }
}

fun main() {
  val a = all_subset_arr_dup()
  a.subsetsWithDup(intArrayOf(1,2,2))
}