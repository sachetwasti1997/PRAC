package dynamic_programming

class Max_Score_Mul_Operation {
  fun maximumScore(n: IntArray, m: IntArray): Int {
    var res = 0
    val dp = ArrayList<ArrayList<Int>>().apply{
      for (i in 0..m.size) {
        var arr = ArrayList<Int>()
        for (j in 0..m.size) {
          arr.add(Int.MIN_VALUE)
        }
        this.add(arr)
      }
    }
    fun calc(l: Int, r: Int, index: Int): Int {
      if (index >= m.size) return 0
      if (dp[index][l] != Int.MIN_VALUE) return dp[index][l]
      val left = n[l] * m[index] + calc(l+1, r, index+1)
      val right = n[r] * m[index] + calc(l, r-1, index+1)
      dp[index][l] = left.coerceAtLeast(right)
      return dp[index][l]
    }
    return calc(0, n.size-1, 0)
  }
}