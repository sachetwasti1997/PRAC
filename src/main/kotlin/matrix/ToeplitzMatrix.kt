package matrix

class ToeplitzMatrix {
  fun isToeplitzMatrix(m: Array<IntArray>): Boolean {
    var i1 = 0
    for (i in 0 until m[0].size - 1) {
      var j = i
      i1 = 0
      var tmp = m[i1][j]
      while (i1 < m.size && j < m[0].size) {
        if (m[i1][j] != tmp) return false
        i1++
        j++
      }
    }
    for (i in 1 until m.size - 1) {
      var j = 0
      var tmp = m[i][j]
      var i1 = i
      while (i1 < m.size && j < m[0].size) {
        if (m[i1][j] != tmp) return false
        i1++
        j++
      }
    }
    return true
  }
}