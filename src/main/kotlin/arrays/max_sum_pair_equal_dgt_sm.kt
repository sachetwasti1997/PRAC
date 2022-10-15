package arrays

class max_sum_pair_equal_dgt_sm {
  fun maximumSum(nums: IntArray): Int {
    val mp = HashMap<Int, Int>(nums.size)
    var res = -1
    for (i in nums) {
      var tmp = i
      var d = 0
      while (tmp > 0) {
        d += tmp % 10
        tmp /= 10
      }
      mp[d]?.let{
        res = res.coerceAtLeast(i+it)
      }
      if (compareValues(i, mp[d]) > 0) mp[d] = i
    }
    return res
  }
}