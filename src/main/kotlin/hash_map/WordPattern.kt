package hash_map

class WordPattern {
  fun wordPattern(pattern: String, s: String): Boolean {
    val map = HashMap<Char, String>()
    val rmap = HashMap<String, Char>()
    val s_arr = s.split(" ")
    if (s_arr.size != pattern.length) return false
    var i = 0
    var j = 0
    while (i < pattern.length && j < s_arr.size) {
      if (pattern[i] !in map) {
        if (s_arr[j] in rmap) return false
        map[pattern[i]] = s_arr[j]
        rmap[s_arr[j]] = pattern[i]
      }else if(rmap[s_arr[j]] != pattern[i]) return false
      i++
      j++
    }
    return true
  }
}