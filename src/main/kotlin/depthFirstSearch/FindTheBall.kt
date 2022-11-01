package depthFirstSearch

typealias ArI = Array<IntArray>
class FindTheBall {
  /*
  [ 1, 1, 1, 1, 1, 1], \  \  \  \  \  \
  [-1,-1,-1,-1,-1,-1], /  /  /  /  /  /
  [ 1, 1, 1, 1, 1, 1], \  \  \  \  \  \
  [-1,-1,-1,-1,-1,-1]  /  /  /  /  /  /
    fun flow(i: Int, j: Int, fI: Int, fJ: Int, r: Int, c: Int, g: ArI): Int {
    if (fJ >= c || fJ < 0 || fI < 0) return -1
    if (fI >= r) return fJ
    var f1 = -1
    var f2 = -1
    if (i < fI) {
      f1 = fI
      f2 = fJ + g[fI][fJ]
      if (f1 >= 0 && f2 >= 0 && f1 < r && f2 < c && g[f1][f2] == -g[fI][fJ] && f1 == fI) return -1
    }
    else {
      f1 = fI + 1
      f2 = fJ
      if (f1 >= 0 && f2 >= 0 && f1 < r && f2 < c && g[f1][f2] == -g[fI][fJ] && f1 == fI) return -1
    }
    return flow(fI, fJ, f1, f2, r, c, g)
  }
  fun findBall(grid: ArI): IntArray {
    val r = grid.size
    val c = grid[0].size
    val res = ArrayList<Int>()
    for (i in grid[0].indices) {
      val f = flow(-1, i, 0, i, r, c, grid)
      res.add(f)
    }
    return res.toIntArray()
  }
   */
  fun flow(i: Int, j: Int, fI: Int, fJ: Int, r: Int, c: Int, g: ArI): Int {
    if (fJ >= c || fJ < 0 || fI < 0) return -1
    if (fI >= r) return fJ
    var f1 = -1
    var f2 = -1
    if (i < fI) {
      f1 = fI
      f2 = fJ + g[fI][fJ]
      if (f1 >= 0 && f2 >= 0 && f1 < r && f2 < c && g[f1][f2] == -g[fI][fJ] && f1 == fI) return -1
    }
    else {
      f1 = fI + 1
      f2 = fJ
      if (f1 >= 0 && f2 >= 0 && f1 < r && f2 < c && g[f1][f2] == -g[fI][fJ] && f1 == fI) return -1
    }
    return flow(fI, fJ, f1, f2, r, c, g)
  }
  fun findBall(grid: ArI): IntArray {
    val r = grid.size
    val c = grid[0].size
    val res = ArrayList<Int>()
    for (i in grid[0].indices) {
      val f = flow(-1, i, 0, i, r, c, grid)
      res.add(f)
    }
    return res.toIntArray()
  }
}

fun main() {
  val f = FindTheBall()
  val p = f.findBall(arrayOf(intArrayOf(1,1,1,1,1,1),intArrayOf(-1,-1,-1,-1,-1,-1),intArrayOf(1,1,1,1,1,1),intArrayOf(-1,-1,-1,-1,-1,-1)))
  println(p.contentToString())
}