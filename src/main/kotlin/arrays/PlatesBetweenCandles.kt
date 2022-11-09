package arrays

class PlatesBetweenCandles {
  /*
  fun platesBetweenCandles(s: String, queries: Array<IntArray>): IntArray {
    val numPlates = IntArray(s.length){0}
    var nm = 0
    for (i in s.indices) {
      if (s[i] == '*'){
        nm++
        numPlates[i] = nm
      } else {
        numPlates[i] = nm
      }
    }
    val lftCndls = IntArray(s.length){-1}
    val rghtCndls = IntArray(s.length){-1}
    for (i in s.indices) {
      if (s[i] == '|') lftCndls[i] = i
      else if (i == 0 && s[i] == '*') lftCndls[i] = -1
      else lftCndls[i] = lftCndls[i-1]
    }

    for (i in s.length - 1 downTo 0) {
      if (s[i] == '|') rghtCndls[i] = i
      else if (i == s.length - 1 && s[i] == '*') rghtCndls[i] = -1
      else rghtCndls[i] = rghtCndls[i-1]
    }
    val res = IntArray(queries.size){0}
    for (i in queries.indices) {
      val strt = numPlates[rghtCndls[queries[i][0]]]
      val end = numPlates[lftCndls[queries[i][1]]]
      res[i] = end - start
    }
    return res
  }
   */
  fun platesBetweenCandles(s: String, queries: Array<IntArray>): IntArray {
    return intArrayOf()
  }
}