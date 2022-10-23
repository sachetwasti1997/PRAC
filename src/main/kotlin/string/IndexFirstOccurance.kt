package string

class IndexFirstOccurance {
  fun strStr(h: String, n: String): Int {
    var i = 0
    var j = 0
    val indicesLst = ArrayList<Int>()
    for (i in h.indices) {
      if (h[i] == n[0]) indicesLst.add(i)
    }
    if (indicesLst.size == 0) return -1
    for (it in indicesLst) {
      var i = it
      j = 0
      while (i < h.length && j < n.length && h[i] == n[j]) {
        i++
        j++
      }
      if (j == n.length) return it
    }
    return -1
  }
}