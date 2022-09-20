package recursion

class combination_sm4 {
  fun combinationSum4(nums: IntArray, target: Int): Int {
    val n = nums.size
    val dp = IntArray(target+1){-1}
    fun create(sm: Int): Int {
      if (sm == target) return 1
      if (sm > target) return 0
      if (dp[sm] != -1) return dp[sm]
      var tar = 0
      for (i in nums) tar += create(sm+i);
      dp[sm] = tar
      return dp[sm]
    }
    return create(0);
  }
}