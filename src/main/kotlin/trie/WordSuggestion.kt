package trie

class WordSuggestion {
  /*
  fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    val resLst = ArrayList<ArrayList<String>>()
    for (i in searchWord) {
      val res = StringBuilder()
      res.append(i)
      val r = ArrayList<String>()
      for (j in products) {
        val n = res.length
        if (res.toString().equals(j.slice(0 until n))) r.add(j)
      }
      resLst.add(r)
    }
    return resLst
  }
   */
  fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    return emptyList()
  }
}