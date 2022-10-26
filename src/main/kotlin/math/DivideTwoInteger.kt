package math

class DivideTwoInteger {
  /*
  fun divide(dividend: Int, divisor: Int): Int {
    if (dividend < divisor) return 0
    var res = 0
    var d1 = Math.abs(dividend)
    var d2 = Math.abs(divisor)
    if (d2 == 1) {
      if (divisor == -1) {
        if (dividend == Int.MIN_VALUE) return Int.MAX_VALUE
        else if (dividend < 0) return d1
        else return dividend
      }
      return dividend
    }
    while (d1 >= 0) {
      d1 -= d2
      res++
    }
    return if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) res else -1 * res
  }
   */
  fun divide(dividend: Int, divisor: Int): Int {
    return 4
  }
}

fun main() {
  println(Math.abs(Int.MIN_VALUE))
}