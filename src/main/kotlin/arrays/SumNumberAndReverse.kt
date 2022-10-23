package arrays

class SumNumberAndReverse {
  fun rev(n: Int): Int {
    var t = n
    var rev = 0
    while (t > 0) {
      rev = rev * 10 + t % 10
      t /= 10
    }
    return rev
  }
  fun sumOfNumberAndReverse(num: Int): Boolean {
    for (i in (num / 2) .. num) {
      if (i + rev(i) == num) return true
    }
    return false
  }
}