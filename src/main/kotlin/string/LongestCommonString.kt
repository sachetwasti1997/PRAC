package string

class LongestCommonString {
  fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) return strs[0]
    var ans = Int.MAX_VALUE
    for (i in strs.indices) {
      var j = 0
      while (j < strs[0].length && j < strs[i].length && strs[i][j] == strs[0][j])j++
      ans = ans.coerceAtMost(j)
    }
    return strs[0].slice(0 until ans)
  }
}