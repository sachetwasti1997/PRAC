package breadth_first_search

import java.util.*

typealias ArInt = Array<IntArray>
class PathWithMinEffort {
  fun minimumEffortPath(h: ArInt): Int {
    val q = PriorityQueue<IntArray>{a,b -> a[2] - b[2]}
    val g = Array(h.size){IntArray(h[0].size){Int.MAX_VALUE}}
    g[0][0] = 0
    q.add(intArrayOf(0, 0, 0))
    val dir = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(-1, 0))
    while (!q.isEmpty()) {
      val t = q.poll()
      for (i in dir) {
        val r = i[0] + t[0]
        val c = i[1] + t[1]
        if (r in h.indices && c in h[0].indices) {
          val d = t[2].coerceAtLeast(Math.abs(h[t[0]][t[1]] - h[r][c]))
          if (d < g[r][c]) {
            g[r][c] = d
            q.add(intArrayOf(r, c, d))
          }
        }
      }
    }
    return g[h.size-1][h[0].size-1]
  }
}