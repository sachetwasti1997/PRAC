package sliding_window

class SubstringConcatenationWords {
  /*
  Input: s = "barfoothefoobarman", words = ["foo","bar"]
  Output: [0,9]
  fun findSubstring(s: String, words: Array<String>): List<Int> {
    val k = words[0].length
    val map = HashMap<String, Int>()
    var num_wrd = 0
    for (i in words) {
      map[i] = map.getOrPut(i){0}+1
      num_wrd++
    }
    var i = 0
    val res = ArrayList<Int>()
    while (i < s.length) {
      var wrd = s.slice(i until i+k)
      var n = num_wrd
      val tmp = HashMap(map)
      var j = i
      while (wrd in map) {
        tmp[wrd]?.let {
          tmp[wrd] = it - 1
          if (tmp[wrd] == 0) tmp.remove(wrd)
        }
        j += k
        wrd = s.slice(j until j+k)
      }
      if (tmp.size == 0) res.add(i)
    }
    return res
  }
   */
  fun findSubstring(s: String, words: Array<String>): List<Int> {
    val k = words[0].length
    val map = HashMap<String, Int>()
    var num_wrd = 0
    for (i in words) {
      map[i] = map.getOrPut(i){0}+1
      num_wrd++
    }
    var i = 0
    val res = ArrayList<Int>()
    while (i+k <= s.length) {
      var wrd = s.slice(i until i+k)
      var n = num_wrd
      val tmp = HashMap(map)
      var j = i
      while (wrd in tmp) {
        tmp[wrd]?.let {
          tmp[wrd] = it - 1
          if (tmp[wrd] == 0) tmp.remove(wrd)
        }
        j += k
        wrd = if(j+k <= s.length) s.slice(j until j+k) else ""
      }
      if (tmp.size == 0) res.add(i)
      i++
    }
    return res
  }
}

fun main() {
  val s = SubstringConcatenationWords()
  val str = "a"
  val lst = arrayOf("a")
  println(s.findSubstring(str, lst))
}