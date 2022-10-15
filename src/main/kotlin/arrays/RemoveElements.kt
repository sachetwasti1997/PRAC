package arrays

class RemoveElements {
  fun removeElement(nums: IntArray, `val`: Int): Int {
    var s = 0
    var end = nums.size - 1
    var res = -1
    while (s < end) {
      while (end >= 0 && nums[end] == `val`) end --
      while (s < nums.size && nums[s] != `val`) s++
      if (s < end) {
        with(nums[s]) {
          nums[s] = nums[end]
          nums[end] = this
        }
        s++
        end--
      }
    }
    for (i in nums.indices) {
      if (nums[i] == `val`) {
        res = i
        break
      }
    }
    return if (res == -1) nums.size else res
  }
}