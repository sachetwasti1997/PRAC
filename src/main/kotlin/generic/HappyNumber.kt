package generic

class HappyNumber {
  /*
  fun isHappy(n: Int): Boolean {
    if (n == 1) return true
    val visited = HashSet<Int>()
    var n1 = n
    var ans = -1
    while (true) {
      var tmp = 0
      while (n1 > 0) {
        val r = n1 % 10
        tmp += r * r
        n1 /= 10
      }
      if (tmp == 1) return true
      if (tmp in visited) return false
      if (tmp < 10) return false
      visited.add(tmp)
      n1 = tmp
    }
    return false
  }
   */
  fun isHappy(n: Int): Boolean {
    if (n == 1) return true
    val visited = HashSet<Int>()
    var n1 = n
    var ans = -1
    while (true) {
      var tmp = 0
      while (n1 > 0) {
        val r = n1 % 10
        tmp += r * r
        n1 /= 10
      }
      if (tmp == 1) return true
      if (tmp in visited) return false
      if (tmp < 10) return false
      visited.add(tmp)
      n1 = tmp
    }
    return false
  }
}