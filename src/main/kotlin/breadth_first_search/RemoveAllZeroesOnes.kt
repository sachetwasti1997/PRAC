package breadth_first_search

class RemoveAllZeroesOnes {
  fun removeOnes(g: Array<IntArray>): Boolean {
    var i = 0
    for (j in 0 until g[0].size) {
      if (g[i][j] == 1) {
        var iinx = i
        while (iinx < g.size) {
          if(g[iinx][j] == 1) g[iinx][j] = 0
          else g[iinx][j] = 1
          iinx++
        }
      }
    }

    for (i in 0 until g.size) {
      var sm = 0
      for (j in 0 until g[0].size) sm += g[i][j]
      if (sm != 0 && sm != g[0].size) return false
    }

    return true
  }
}