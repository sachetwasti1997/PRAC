package arrays

class RemoveDuplicates2 {
  fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    for (n in nums) {
      if (i < 2 || n > nums[i-2]) nums[i++] = n
    }
    return i
  }
}