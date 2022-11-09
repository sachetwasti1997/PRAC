package string

class MakeGood {
  /*
  fun makeGood(s: String): String {
    val sb = StringBuilder()
    var i = 0
    while (i < s.length) {
      sb.append(i)
      while (!sb.isEmpty() && (sb[sb.length - 1] == s[i+1] + 32 || sb[sb.length-1] == s[i+1]-32)) {
        sb.deleteCharAt(sb.length-1)
        i++
      }
      i++
    }
    return sb
  }
   */
  fun makeGood(s: String): String {
    if (s.length == 1) return s
    val sb = StringBuilder()
    var i = 0
    while (i < s.length-1) {
      sb.append(s[i])
      while (!sb.isEmpty() && i+1 < s.length && (sb[sb.length - 1] == s[i+1] + 32 || sb[sb.length-1] == s[i+1]-32)) {
        sb.deleteCharAt(sb.length-1)
        i++
      }
      i++
    }
    if(!sb.isEmpty() && i+1 < s.length && (sb[sb.length - 1] == s[i] + 32 || sb[sb.length-1] == s[i]-32)) {
      sb.deleteCharAt(sb.length-1)
    }else if(i < s.length) {
      sb.append(s[i])
    }
    return sb.toString()
  }
}