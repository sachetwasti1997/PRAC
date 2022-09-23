package breadth_first_search

import java.util.*

class ZrOneMatrix {
  fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val dir = arrayOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)
    val q = LinkedList<Pair<Int, Int>>()
    val res = Array(mat.size){ IntArray(mat[0].size){Int.MAX_VALUE} }
    for (i in mat.indices) {
      for (j in mat[0].indices) {
        if (mat[i][j] == 0) {
          q.add(Pair(i, j))
          res[i][j] = 0
        }
      }
    }
    res.forEach{ println(it.contentToString()) }
    while (!q.isEmpty()) {
      val tmp = q.poll()
      for (d in dir) {
        val x = d.first + tmp.first
        val y = d.second + tmp.second
        if (x < mat.size && x >= 0 && y < mat[0].size && y >= 0
          && res[tmp.first][tmp.second] + 1 < res[x][y]) {
          q.add(Pair(x, y))
          res[x][y] = res[tmp.first][tmp.second] + 1
        }
      }
    }
    return res
  }
}

fun main () {
  val z = ZrOneMatrix()
  z.updateMatrix(arrayOf(intArrayOf(0,0,0), intArrayOf(0,1,0), intArrayOf(1,1,1)))
}
