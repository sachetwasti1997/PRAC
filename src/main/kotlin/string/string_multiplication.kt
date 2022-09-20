package string

class string_multiplication {
  fun multiply(num1: String, num2: String): String {
    var res = StringBuilder()
    var i = 0
    var nm_zro = 0
    val n1 = num1.reversed()
    val n2 = num2.reversed()
    while (i < num1.length) {
      val tmp = StringBuilder()
      repeat(i) { tmp.append('0') }
      var carry = 0
      var total = 0
      for(n in n2) {
        val mul = n.digitToInt() * n1[i].digitToInt()
        total = carry + mul
        carry = total / 10
        tmp.append(total%10)
      }
      if (carry > 0) tmp.append(carry)
      if (res.isEmpty()) res = tmp
      else {
        val add = StringBuilder()
        carry = 0
        var j = 0
        var k = 0
        while (j < res.length || k < tmp.length) {
          val x = if (j < res.length) res[j].digitToInt() else 0
          val y = if (k < tmp.length) tmp[k].digitToInt() else 0
          val total = (x+y+carry)
          carry = total / 10
          add.append(total%10)
          j++
          k++
        }
        if (carry > 0) add.append(1)
        res = add
      }
      i++
    }
    return res.toString().reversed()
  }
}

fun main() {
  val s1 =   "123456789"
  val s2 = "987654321"
  val m = string_multiplication()
  m.multiply(s1,s2)
}