package dynamic_programming

typealias LLS = ArrayList<List<String>>
typealias HS = HashSet<String>
typealias ALS = ArrayList<String>
class WordBreak2 {
  /*
  fun dfs(res: LLS, s: String, d: HS, lst:ALS) {
    if (s in d) {
      lst.add(s)
      res.add(ArrayList(lst))
      return
    }
    val str = 0
    for (i in 1 until s.length) {
      if (s.slice(str .. i) in d) {
        lst.add(s.slice(str .. i))
        dfs(res, s.slice(i until s.length), d, lst)
        lst.removeAt(lst.size - 1)
      }
    }
  }
  fun wordBreak(s: String, wordDict: List<String>): List<String> {
    val st = HS(wordDict.size)
    for (i in wordDict) st.add(i)
    val res = LLS()
    val lst = ALS()
    dfs(res, s, st, lst)
    return res
  }
   */
  fun wordBreak(s: String, wordDict: List<String>): List<String> {
    return emptyList()
  }
}