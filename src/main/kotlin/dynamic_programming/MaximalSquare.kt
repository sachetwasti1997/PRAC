package dynamic_programming

class MaximalSquare {
  fun maximalSquare(m: Array<CharArray>): Int {
    val ROWS = m.size
    val COLS = m[0].size
    val dp = Array(ROWS){IntArray(COLS)}
    var answer = 0
    for (i in 0 until ROWS) {
      for (j in 0 until COLS) {
        if (m[i][j] == '1') {
          dp[i][j] = 1
          if (i > 0 && j > 0) {
            dp[i][j] = minOf(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])
          }
          answer = maxOf(answer, dp[i][j])
        }
      }
    }
    return answer
  }
}