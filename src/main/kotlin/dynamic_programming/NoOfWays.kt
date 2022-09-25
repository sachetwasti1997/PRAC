package dynamic_programming

class NoOfWays {
  fun numberOfWays(s: String): Long {
    val dp = Array(s.length+1) { Array(4) { LongArray(3){-1} } }
    fun find(i: Int, prevB: Int, selection: Int): Long {
      if (selection == 0) return 1
      if (i >= s.length) return 0
      if (dp[i][selection][prevB+1] != -1L) return dp[i][selection][prevB+1];
      if (s[i].digitToInt() != prevB) {
        dp[i][selection][prevB + 1] = find(i+1, s[i].digitToInt(), selection-1) + find(i+1, prevB, selection)
      }else {
        dp[i][selection][prevB + 1] = find(i+1, prevB, selection)
      }
      return dp[i][selection][prevB + 1]
    }
    return find(0, -1, 3)
  }
}

fun main() {
  var s = "001101"
  val N = NoOfWays()
  println(N.numberOfWays(s))
}