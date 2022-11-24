package dynamic_programming

typealias arChAr = Array<CharArray>
typealias arrInt = Array<Pair<Int, Int>>
class WordSearch {
  /*
  fun find (wrd: String, brd: arChAr, indx: Int, i: Int, j: Int, dir: arrInt): Boolean {
    if (indx == wrd.length) return true
    if (i < brd.size && j < brd[0].size && i > 0 && j > 0 && wrd[indx] == brd[i][j]) {
      brd[i][j] = ' '
      var found = false
      for (it in dir) {
        found = found || find(wrd, brd, indx+1, i+it[0], i+it[1], dir)
      }
      return found
    }
    return false
  }
  fun exist(brd: arChAr, wrd: String): Boolean {
    val dir = arrayOf(0 to 1, 1 to 0, -1 to 0, 0 to -1)
    for (i in 0 until brd.size) {
      for (j in 0 until brd[0].size) {
        if (brd[i][j] == wrd[0] && find(wrd, brd, indx, i, j, dir)) return true
      }
    }
    return false
  }
   */
  private fun find (wrd: String, brd: arChAr, indx: Int, i: Int, j: Int, dir: arrInt): Boolean {
    if (indx == wrd.length) return true
    if (i < brd.size && j < brd[0].size && i >= 0 && j >= 0 && wrd[indx] == brd[i][j]) {
      val tmp = brd[i][j]
      brd[i][j] = ' '
      for (it in dir) {
        if (find(wrd, brd, indx+1, i+it.first, j+it.second, dir)) return true
      }
      brd[i][j] = tmp
    }
    return false
  }
  fun exist(brd: arChAr, wrd: String): Boolean {
    val dir = arrayOf(0 to 1, 1 to 0, -1 to 0, 0 to -1)
    for (i in brd.indices) {
      for (j in brd[0].indices) {
        if (brd[i][j] == wrd[0] && find(wrd, brd, 0, i, j, dir)) return true
      }
    }
    return false
  }
}

fun main () {
  val mat = arrayOf(charArrayOf('A','B','C','E'), charArrayOf('S','F','C','S'), charArrayOf('A','D','E','E'))
  val w = WordSearch()
  println(w.exist(mat, "ABCCED"))
}