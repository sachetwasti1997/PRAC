package recursion

class gray_code {
  fun grayCode(n: Int): List<Int> {
    if (n == 1) return listOf(0,1)
    fun create(i: Int): List<String> {
      if (i == 1) return listOf("0","1")
      val tmp = create(i-1)
      val ans = ArrayList<String>()
      for (j in tmp.indices) {
        ans.add("0${tmp[j]}")
      }
      for (j in tmp.size-1 downTo 0) {
        ans.add("1${tmp[j]}")
      }
      return ans
    }
    val res = create(n)
    val ret_ans = ArrayList<Int>()
    for (i in res) ret_ans.add(i.toInt(2))
    return ret_ans
  }
}

fun main() {
  println("101".toInt(2))
}