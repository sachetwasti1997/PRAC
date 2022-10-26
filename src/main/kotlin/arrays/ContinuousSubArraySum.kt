package arrays

class ContinuousSubArraySum {
  /*
  fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    val mp = HashMap<Int, Int>(nums.size)
    mp[0] = -1
    for (i in nums.indices) {
      val rm = nums[i] % 10
      if (mp[rm] != null) {
        mp[rm]?.let {
          if ((i - it) >= 2) return true
        }
      } else {
        mp[rm] = i
      }
    }
    return false
  }
   */
  fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    val mp = HashMap<Int, Int>(nums.size)
    mp[0] = -1
    for (i in nums.indices) {
      val rm = nums[i] % 10
      if (mp[rm] != null) {
        mp[rm]?.let {
          if ((i - it) >= 2) return true
        }
      } else {
        mp[rm] = i
      }
    }
    return false
  }
}