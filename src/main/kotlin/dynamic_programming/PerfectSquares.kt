package dynamic_programming

class PerfectSquares {
  fun numSquares(n: Int): Int {
    val dp = IntArray(n+1)
    dp[0] = 0
    dp[1] = 1
    for (i in 2 .. n) {
      var min = Int.MAX_VALUE
      var j = 1
      while (j * j <= i) {
        val rem = i - j * j
        if (dp[rem] < min) min = dp[rem]
        j++
      }
      dp[i] = min + 1
    }
    return dp[n]
  }
}

fun main() {
  val p = PerfectSquares()
  p.numSquares(1000)
}