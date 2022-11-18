package dynamic_programming

class MinCostClimbingStairs {
  /*
  fun findCost(cst: IntArray, n: Int, indx: Int, currCst: Int) {
    if (indx == n) return cst
    if (indx > n) return 0
    return Math.min(findCost(cst, n, indx + 1, currCst + cst[indx]),
      findCost(cst, n, indx + 2, currCst + cst[indx]))
  }
  fun minCostClimbingStairs(cost: IntArray): Int {
    return Math.min(findCost(cost, cost.size - 1, 0, 0), findCost(cost, cost.size - 1, 1, 0))
  }
   */
  fun findCost(cst: IntArray, n: Int, indx: Int, currCst: Int, dp: IntArray): Int {
    if (indx == n) return currCst
    if (indx > n) return Int.MAX_VALUE
    if (dp[indx] != -1) return dp[indx]
    dp[indx] = Math.min(findCost(cst, n, indx + 1, currCst + cst[indx], dp),
      findCost(cst, n, indx + 2, currCst + cst[indx], dp))
    return dp[indx]
  }
  fun minCostClimbingStairs(cost: IntArray): Int {
    var dp = IntArray(cost.size){-1}
    val ans1 = findCost(cost, cost.size, 0, 0, dp)
    println(dp.contentToString())
    dp = IntArray(cost.size){-1}
    val ans2 = findCost(cost, cost.size, 1, 0, dp)
    println(dp.contentToString())
    return ans1.coerceAtMost(ans2)
  }
}

fun main () {
  val m = MinCostClimbingStairs()
  println(m.minCostClimbingStairs(intArrayOf(10,15,20)))
}