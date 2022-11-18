package math

class UglyNumber {
  fun isUgly(n: Int): Boolean {
    if (n == 0) return false
    var n1 = n
    while (n1 % 2 == 0) {
      n1 /= 2
      if (n1 == 1) return true
    }
    while (n1 % 3 == 0) {
      n1 /= 3
      if (n1 == 1) return true
    }
    while (n1 % 5 == 0) {
      n1 /= 5
      if (n1 == 1) return true
    }
    return n1 == 1
  }
}