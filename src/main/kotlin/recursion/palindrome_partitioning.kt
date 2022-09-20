package recursion

class palindrome_partitioning {
  fun partition(s: String): List<List<String>> {
    fun isPalindrome(i: Int, j: Int): Boolean {
      var i1 = i
      var j1 = j
      while (i1 <= j1) {
        if (s[i1] != s[j1]) return false
        i1++
        j1--
      }
      return true
    }
    val tmp = ArrayList<String>()
    val res = ArrayList<ArrayList<String>>()
    fun partition(indx: Int) {
      if (indx == s.length) {
        res.add(ArrayList(tmp))
        return
      }
      for (j in indx until s.length) {
        if (isPalindrome(indx, j)) {
          tmp.add(s.slice(indx .. j))
          partition(j+1)
          tmp.removeAt(tmp.size - 1)
        }
      }
    }
    partition(0)
    return res
  }
}

fun main() {
  val p = palindrome_partitioning()
  p.partition("aab")
}