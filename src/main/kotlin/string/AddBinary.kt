package string

class AddBinary {
  /*
  fun addBinary(a: String, b: String): String {
    var carry = 0
    var i = a.length - 1
    var j = b.length - 1
    val res = StringBuilder()
    while (i > 0 && j > 0) {
      var ch1 = a[i]
      var ch2 = b[j]
      if (ch1 == '1' && ch2 == '1') {
        var res1 = 0
        if (carry == 1) res1 = 1
        else res1 = 1
        res.append(res1)
        carry = 1
      } else if (ch1 == '1' && ch2 == '0' || ch1 == '0' && ch2 == '1') {
        var res1 = 0
        if (carry == 1) { res1 = 0 }
        else res1 = 1
        res.append(res1)
      }
      i--
      j--
    }
    if (carry != 0) res.append(carry)
    return res.reverse().toString()
  }
   */
  fun addBinary(a: String, b: String): String {
    var carry = 0
    var i = a.length - 1
    var j = b.length - 1
    val res = StringBuilder()
    while (i >= 0 || j >= 0) {
      var ch1 = if(i >= 0)a[i]else '0'
      var ch2 = if(j >= 0)b[j]else '0'
      if (ch1 == '1' && ch2 == '1') {
        var res1 = 0
        if (carry == 1) res1 = 1
        res.append(res1)
        carry = 1
      }else if (ch1 == '0' && ch2 == '0') {
        var res1 = 0
        if (carry == 1) res1 = 1
        res.append(res1)
        carry = 0
      } else if (ch1 == '1' && ch2 == '0' || ch1 == '0' && ch2 == '1') {
        var res1 = 0
        if (carry == 0) res1 = 1
        res.append(res1)
      }
      i--
      j--
    }
    if (carry != 0) res.append(carry)
    return res.reverse().toString()
  }
}

fun main() {
  val s = AddBinary()
  val v = s.addBinary("1010", "1011")
  println(v)
}