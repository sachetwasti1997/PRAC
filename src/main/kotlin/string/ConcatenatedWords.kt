package string

typealias HS = HashSet<String>
class ConcatenatedWords {
  /*
  fun dfs(wrd: String, hs: HS): Boolean {
    val len = wrd.length
    for (i in 1 until len) {
      val sfx = wrd.slice(i+1 until wrd.size)
      if ((wrd.slice(0 .. i) in hs)&& (hs.contains(sfx) || dfs(suffix, hs))) return true
    }
    return false
  }
  fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
    val res = ArrayList<String>()
    if(words.length == 0) return res
    val st = HashSet<String>()
    val res = ArrayList<String>()
    for (i in words) st.add(i)
    for (i in words) {
      if (dfs(i))res.add(i)
    }
    return res
  }
   */
  fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
    return emptyList()
  }
}