package dynamic_programming

class ArithmeticSlices {
  /*
  fun numberOfArithmeticSlices(nums: IntArray): Int {

  }
   */
  fun numberOfArithmeticSlices(nums: IntArray): Int {
    val dp = Array(nums.size){HashMap<Long, Int>(nums.size)}
    var ans = 0
    for (i in nums.indices) {
      for (j in 0 until i) {
        val diff = nums[i].toLong() - nums[j].toLong()
        var cnt = 0
        dp[j][diff]?.let{
          cnt = it
        }
        dp[i][diff] = (dp[i][diff] ?: 0) + cnt + 1
        ans += cnt
      }
    }
    return ans
  }
}

fun main () {
  val a = ArithmeticSlices()
  println(a.numberOfArithmeticSlices(intArrayOf(2,4,6,8,10)))
}