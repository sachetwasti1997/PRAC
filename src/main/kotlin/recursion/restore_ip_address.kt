package recursion

class restore_ip_address {
  fun restoreIpAddresses(s: String): List<String> {
      val res = ArrayList<String>()
      fun restore(i: Int, dots: Int, currIP: String) {
        if (i >= s.length && dots == 4) {
          res.add(currIP.slice(0 .. currIP.length-2))
          return
        }
        if (dots > 4) return
        for (j in i until (s.length.coerceAtMost(i+3))) {
          val num = s.slice(i until j+1).toInt()
          if (num <= 255 && (i == j || s[i] != '0')) {
            restore(j+1, dots+1, currIP+num.toString()+".")
          }
        }
      }
      restore(0, 0, "")
      return res
    }
}

fun main() {
  val r = restore_ip_address()
  println(r.restoreIpAddresses("0000"))
}