package dynamic_programming

class PaintHouse {
  fun minCost(costs: Array<IntArray>): Int {
    val dp = Array(costs.size){IntArray(3)}
    val map = HashMap<Int, Int>(3)
    for (i in costs.indices) {
      for (j in 0 until 3) {
        if (i == 0) {
          dp[i][j] = costs[i][j]
          map[j] = dp[i][j]
        }
        else{
          var cost = Int.MAX_VALUE
          for (k in 0 until 3) {
            if (k != j) cost = minOf(cost, dp[i-1][k])
          }
          dp[i][j] = cost + costs[i][j]
        }
      }
    }
    var ans = Int.MAX_VALUE
    var i = costs.size - 1
    for (j in 0 until 3) ans = minOf(ans, dp[i][j])
    return ans
  }
}

fun main() {
  val arr = arrayOf(intArrayOf(17,2,17), intArrayOf(16,16,5), intArrayOf(14,3,19))
  val p = PaintHouse()
  println(p.minCost(arr))
}