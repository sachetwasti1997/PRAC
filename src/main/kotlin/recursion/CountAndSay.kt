package recursion

class CountAndSay {
  fun cs(n: Int, prev: String): String {
    if (n == 1) return prev
    var i = 0
    var s = StringBuilder()
    while (i < prev.length) {
      val j = i
      while (i < prev.length && prev[i] == prev[j]){
        i++
      }
      s.append(i-j)
      s.append(prev[j])
    }
    return cs(n-1, s.toString())
  }

  fun countAndSay(n: Int): String {
    val res = cs(n, "1")
    return res
  }
}