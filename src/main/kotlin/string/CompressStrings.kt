package string

class CompressStrings {
  fun compress(chars: CharArray): Int {
    var i = 0
    var j = 1
    var rtr = 0
    while (i < chars.size && j < chars.size) {
      val tmp = chars[i]
      while (j < chars.size && chars[i] == chars[j]) j++
      var ln = j - i
      if (ln == 1) {
        chars[rtr++] = tmp
        i = j
      }else {
        val s = ln.toString()
        chars[rtr++] = tmp
        for (ch in s.toCharArray()) {
          chars[rtr++] = ch
        }
        i = j
      }
    }
    return if (rtr == 0) 1 else rtr
  }
}

fun main() {
  val s = CompressStrings()
  println(s.compress(charArrayOf('a','a','b','b','c','c', 'c')))
}