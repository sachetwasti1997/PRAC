package binary_search

class ArrangeCoins {
  fun arrangeCoins(n: Int): Int {
    var i = 1
    var n1 = n
    while (n1 >= i) {
      n1 -= i
      i++
    }
    return --i
  }
}