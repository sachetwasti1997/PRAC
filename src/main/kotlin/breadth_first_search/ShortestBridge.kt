package breadth_first_search

import java.util.*
import kotlin.collections.ArrayList

typealias ArIAr = Array<IntArray>
typealias ArPr = ArrayList<Pair<Int, Int>>
class ShortestBridge {
  fun fillQ(g: ArIAr, q: LinkedList<Triple<Int,Int,Int>>, i :Int, j: Int, dir: ArPr, v: HashSet<Pair<Int, Int>>) {
    if (i in (0 until g.size) && j in (0 until g[0].size) && g[i][j] == 1) {
      q.add(Triple(i, j, 0))
      v.add(i to j)
      g[i][j] = 0
      for (it in dir) fillQ(g, q, i+it.first, j+it.second, dir, v)
    }
  }
  fun shortestBridge (g: ArIAr): Int {
    val q = LinkedList<Triple<Int,Int,Int>>()
    var fi = 0
    var fj = 0
    val visit = HashSet<Pair<Int, Int>>()
    val dir = arrayListOf(-1 to 0, 0 to -1, 1 to 0, 0 to 1)
    for (i in 0 until g.size) {
      for (j in 0 until g[0].size) {
        if (g[i][j] == 1) {
          fi = i
          fj = j
          break
        }
      }
    }
    fillQ(g, q, fi, fj, dir, visit)
    var dist = 0

    while (!q.isEmpty()) {
      var sz = q.size
      for (i in 0 until sz) {
        val tmp = q.poll()
        val d = tmp.third
        if (g[tmp.first][tmp.second] == 1) {
          dist = d - 1
          break
        }
        for (i in dir) {
          if ((tmp.first + i.first) in (0 until g.size) && (tmp.second + i.second) in (0 until g[0].size) && ((tmp.first + i.first) to (tmp.second + i.second) !in visit))
            q.add(Triple((tmp.first + i.first), (tmp.second + i.second), d + 1))
          visit.add((tmp.first + i.first) to (tmp.second + i.second))
        }
      }
      if (dist != 0) break
    }
    return dist
  }
}