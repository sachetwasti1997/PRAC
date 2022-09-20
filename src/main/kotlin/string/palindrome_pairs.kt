package string

class palindrome_pairs {
  fun palindromePairs(words: Array<String>): List<List<Int>> {
    fun isPalindrome(s: String): Boolean {
      if (s == "" || s.length == 1) return true
      var i = 0
      var j = s.length - 1
      while (i <= j) {
        if (s[i] != s[j]) return false
        i++
        j--
      }
      return true
    }
    val mp = HashMap<String, Int>()
    var i = 0
    for (k in words) mp[k.reversed()] = i++
    val res = ArrayList<ArrayList<Int>>()
    for (i in words.indices) {
      if (words[i] in mp && words[i].length > 1) res.add(arrayListOf(i, mp[words[i]]!!))
      else {
        var j = words[i].length
        while (j > 0 ) {
          val str = words[i].slice(j until words[i].length)
          if (isPalindrome(str)) {
            val str1 = words[i].slice(0 until j)
            mp[str1]?.let { res.add(arrayListOf(i, it)) }
          }
          j--
        }
        j = 0
        while (j < words[i].length) {
          val str = words[i].slice(0..j)
          if (isPalindrome(str)) {
            val str1 = words[i].slice(j + 1 until words[i].length)
            mp[str1]?.let { res.add(arrayListOf(it, i)) }
          }
          j++
        }
      }
    }
    return res
  }
}

fun main() {
  val wrds = arrayOf("a","")
  val p = palindrome_pairs()
  val mp = HashMap<Int, Int>()
  mp[1]?.let { println("It is here") } ?: run { println("Not here") }
  p.palindromePairs(wrds)
}