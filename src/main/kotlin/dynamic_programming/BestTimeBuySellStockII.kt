package dynamic_programming

class BestTimeBuySellStockII {
  fun maxProfit(p: IntArray): Int {
    var total = 0
    for (i in 1 until p.size) {
      if (p[i] > p[i-1]) total += p[i] - p[i-1]
    }
    return total
  }
}