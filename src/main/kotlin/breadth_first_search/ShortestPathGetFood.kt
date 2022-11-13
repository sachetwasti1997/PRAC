package breadth_first_search

import java.util.*

class ShortestPathGetFood {
  fun getFood(g: Array<CharArray>): Int {
    val q = LinkedList<IntArray>()
    for (i in 0 until g.size) {
      for (j in 0 until g[0].size) {
        if (g[i][j] == '*') {
          q.add(intArrayOf(i, j, 0))
          g[i][j] = 'X'
          break
        }
      }
    }
    val dir = arrayOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)
    while (!q.isEmpty()) {
      val t = q.poll()

      for (i in dir) {
        val r = i.first + t[0]
        val c = i.second + t[1]
        if (r in (g.indices) && c in (g[0].indices) && g[r][c] != 'X') {
          if (g[r][c] == '#') return t[2] + 1
          q.add(intArrayOf(r,c,t[2]+1))
          g[r][c] = 'X'
        }
      }
    }
    return -1
  }
}