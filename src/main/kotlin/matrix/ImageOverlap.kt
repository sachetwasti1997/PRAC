package matrix

class ImageOverlap {
  /*
  typealias Array<IntArray> ArrI;
  fun shifts(a1: ArrI, a2: ArrI, x_shift: Int, y_shift: Int): Int {
    val N = a1.size
    var num = 0
    for (r in 0 until N) {
      for (c in 0 until N) {
        if (c+x_shift >= 0 && r+y_shift>=0 && c+x_shift < N && r+y_shift < N
        && a1[r+y_shift][c+x_shift] == 1 && a2[r][c] == 1) num++
      }
    }
    return num
  }
  fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
    val N = a1.size
    var nm = 0
    for (i in -1 * N until N) {
      for (j in -1 * N until N) {
        nm = nm.coerceAtLeast(shifts(img1, img2, i, j))
      }
    }
    return nm
  }
   */
  fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
    return 1
  }
}