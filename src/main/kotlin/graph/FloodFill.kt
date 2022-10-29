package graph
typealias AIn = Array<IntArray>
typealias LPI = List<Pair<Int, Int>>
class FloodFill {
  /*
  typealias AIn = Array<IntArray>
  typealias LPI = List<Pair<Int>>
  fun dfs(i: Int, j: Int, im: AIn, clr: Int, dir: LPI) {
    if (i >= 0 && j >= 0 && i < im.size && j < im[0].size && im[i][j] != 0 && im[i][j] != clr) {
      im[i][j] = clr
      for (k in dir) dfs(i+k.first, j+k.second, clr, dir)
    }
  }
  fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val dir = listOf(0 to -1, -1 to 0, 1 to 0, 0 to 1)
    dfs(sr, sc, image, color, dir)
    return image
  }
   */
  fun dfs(i: Int, j: Int, im: AIn, clr: Int, dir: LPI, strCl: Int) {
    if (i >= 0 && j >= 0 && i < im.size && j < im[0].size && im[i][j] != clr && im[i][j] == strCl) {
      im[i][j] = clr
      for (k in dir) dfs(i+k.first, j+k.second, im, clr, dir, strCl)
    }
  }
  fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val dir = listOf(0 to -1, -1 to 0, 1 to 0, 0 to 1)
    val strtCl = image[sr][sc]
    dfs(sr, sc, image, color, dir, strtCl)
    return image
  }
}