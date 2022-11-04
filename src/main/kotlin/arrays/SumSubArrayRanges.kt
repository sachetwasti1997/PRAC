package arrays

import kotlin.reflect.typeOf

class SumSubArrayRanges {
  /*
  fun subArrayRanges(nums: IntArray): Long {
    var res = 0L
    for (i in 0 until nums.size - 1) {
      var max = nums[i]
      var min = nums[i]
      for (j in i+1 until nums.size) {
        max = Math.max(max, nums[j])
        min = Math.min(min, nums[j])
        res += (max - min).toLong()
      }
    }
    return res
  }
   */
  fun subArrayRanges(nums: IntArray): Long {
    var res = 0L
    for (i in 0 until nums.size - 1) {
      var max = nums[i]
      var min = nums[i]
      for (j in i+1 until nums.size) {
        max = Math.max(max, nums[j])
        min = Math.min(min, nums[j])
        res += (max - min).toLong()
      }
    }
    return res
  }
}

fun main() {
  val s = SumSubArrayRanges()
  s.subArrayRanges(intArrayOf())
}