package math

class DivideTwoInteger {
  /*
  fun divide(dividend: Int, divisor: Int): Int {
    if (divisor == -1 && dividend == Int.MIN_VALUE) return Int.MAX_VALUE
    else if (divisor == -1) return -dividend
    val flag = if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) true
               else false
    val d1 = Math.abs(dividend)
    val d2 = Math.abs(divisor)
    var res = 0
    while (d1 >= d2) {
      d1 -= d2
      res++
    }
    return if(!flag) -res else res
  }
   */
  fun divide(dividend: Int, divisor: Int): Int {
    return 4
  }
}

fun main() {
  println(Math.abs(Int.MIN_VALUE))
}