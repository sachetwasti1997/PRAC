package recursion

class IncreasingSub {
  fun findSubsequences(nums: IntArray): List<List<Int>> {
    val tmp = ArrayList<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create(i: Int) {
      if (tmp.size > 1) {
        res.add(ArrayList(tmp))
      }
      val lst =  if(tmp.size > 0) tmp[tmp.size-1] else -200
      var j = i

      while (j < nums.size) {
        if (nums[j] >= lst) {
          tmp.add(nums[j])
          create(j+1)
          tmp.removeAt(tmp.size-1)
          while (j < nums.size - 1 && nums[j] == nums[j+1]) j++
        }
        j++
      }
    }
    create(0)
    return res
  }
}

fun main() {
  val i = IncreasingSub()
  i.findSubsequences(intArrayOf(4,6,7,7))
}