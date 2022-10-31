package graph

import java.util.*

class ShortestPathInGridWithObstacle {
  /*
  arrayOf(intArrayOf(0,0,0,0,0,0,0,0,0,0),
  intArrayOf(0,1,1,1,1,1,1,1,1,0),
  intArrayOf(0,1,0,0,0,0,0,0,0,0),
  intArrayOf(0,1,0,1,1,1,1,1,1,1),
  intArrayOf(0,1,0,0,0,0,0,0,0,0),
  intArrayOf(0,1,1,1,1,1,1,1,1,0),
  intArrayOf(0,1,0,0,0,0,0,0,0,0),
  intArrayOf(0,1,0,1,1,1,1,1,1,1),
  intArrayOf(0,1,0,1,1,1,1,0,0,0),
  intArrayOf(0,1,0,0,0,0,0,0,1,0),
  intArrayOf(0,1,1,1,1,1,1,0,1,0),
  intArrayOf(0,0,0,0,0,0,0,0,1,0))
  fun shortestPath(grid: Array<IntArray>, k: Int): Int {
    val q = LinkedList<List<Int>>()
    q.add(listOf(0, 0, k, 0))
    val m = grid.size-1
    val n = grid[0].size-1
    val dir = listOf(-1 to 0, 0 to 1, 1 to 0, 0 to -1)
    while (!q.isEmpty()) {
      val tmp = q.poll()
      if (tmp[0] == m && tmp[1] == n) return tmp[3]
      if (grid[tmp[0]][tmp[1]] == 1) {
        if (tmp[2] - 1 == -1) continue
        tmp[2] --
      }
      for (i in dir) {
        if (tmp[0]+i[0] in (0 .. m) && tmp[1]+i[1] in (0 .. n))
          q.add(tmp[0]+i[0], tmp[1]+i[1], tmp[2], tmp[3]+1)
      }
    }
    return -1
  }
   */
  fun shortestPath(grid: Array<IntArray>, k: Int): Int {
    val q = LinkedList<List<Int>>()
    q.add(listOf(0, 0, k, 0))
    val m = grid.size-1
    val n = grid[0].size-1
    val dir = listOf(-1 to 0, 0 to 1, 1 to 0, 0 to -1)
    val ddd = Array(m+1){Array<Pair<Int, Int>>(n+1){-1 to -1} }
    while (!q.isEmpty()) {
      val tmp = q.poll()
      var d = tmp[2]
      if (tmp[0] == m && tmp[1] == n) return tmp[3]
      if (grid[tmp[0]][tmp[1]] == 1) {
        if (tmp[2] - 1 == -1) continue
        d --
      }
      ddd[tmp[0]][tmp[1]] = tmp[3] to d
      for (i in ddd) println(i.contentToString())
      for (i in dir) {
        val k = tmp[0]+i.first
        val l = tmp[1]+i.second
        if (
          k >= 0 && k <= m &&
          l >= 0 && l <= n &&
          ddd[k][l].second < d
        ) {
          q.add(listOf(k,l, d, tmp[3]+1))
          ddd[k][l] = ddd[k][l].first to d
        }
      }
      println("______________________________________________________")
    }

    return ddd[m][n].first
  }
}

fun main() {
  val s = ShortestPathInGridWithObstacle()
  val t = s.shortestPath(
    arrayOf(intArrayOf(0,0,0,0,0,0,0,0,0,0),
      intArrayOf(0,1,1,1,1,1,1,1,1,0),
      intArrayOf(0,1,0,0,0,0,0,0,0,0),
      intArrayOf(0,1,0,1,1,1,1,1,1,1),
      intArrayOf(0,1,0,0,0,0,0,0,0,0),
      intArrayOf(0,1,1,1,1,1,1,1,1,0),
      intArrayOf(0,1,0,0,0,0,0,0,0,0),
      intArrayOf(0,1,0,1,1,1,1,1,1,1),
      intArrayOf(0,1,0,1,1,1,1,0,0,0),
      intArrayOf(0,1,0,0,0,0,0,0,1,0),
      intArrayOf(0,1,1,1,1,1,1,0,1,0),
      intArrayOf(0,0,0,0,0,0,0,0,1,0)), 1
  )
  println(t)
}