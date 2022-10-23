package binary_search

class ThreeSumClosest {
  fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var res = Int.MAX_VALUE
    for (i in nums.indices) {
      var start = i+1
      var end = nums.size-1
      var closest = Int.MAX_VALUE
      while (start < end) {
        val curr_sum = nums[i] + nums[start] + nums[end]
        if (Math.abs(target - curr_sum) < Math.abs(target - closest)) {
          closest = curr_sum
          end --
        }else {
          start ++
        }
      }
      res = res.coerceAtMost(closest)
    }
    return res
  }
}