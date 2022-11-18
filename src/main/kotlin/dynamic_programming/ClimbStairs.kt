package dynamic_programming

class ClimbStairs {
  /*
  fun climb (n: Int, stps: Int) {
    if (stps == n) return 1
    if (stps > n) return 0
    return climb(n, stps+1) + climb(n, stps+2)
  }
  fun climbStairs(n: Int): Int {
    return climb(n, 0)
  }
   */
  fun climb (n: Int, stps: Int, dp: IntArray):Int {
    if (stps == n) return 1
    if (stps > n) return 0
    if (dp[stps] != -1) return dp[stps]
    dp[stps] = climb(n, stps+1, dp) + climb(n, stps+2, dp)
    return dp[stps]
  }
  fun climbStairs(n: Int): Int {
    val dp = IntArray(n){-1}
    return climb(n, 0, dp)
  }
}

fun main() {
  val c = ClimbStairs()
  println(c.climbStairs(5))
}