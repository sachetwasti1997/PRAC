package matrix

class DiagonalOrder {
  /*
  fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    val mp = HashMap<Int, ArrayList<Int>>(mat.size * mat[0].size)
    for (i in mat.indices) {
      for (j in mat[0].indices) {
        map.getOrPut(i+j){ArrayList()}.add(mat[i][j])
      }
    }
    var res = ArrayList<Int>(mat.size*mat[0].size)
    for ((k, v) in map) {
      if (k%2 == 0) res.addAll(v.reversed)
      else res.addAll(v)
    }
    return res.toIntArray()
  }
   */
  fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    val mp = HashMap<Int, ArrayList<Int>>(mat.size * mat[0].size)
    for (i in mat.indices) {
      for (j in mat[0].indices) {
        mp.getOrPut(i+j){ArrayList()}.add(mat[i][j])
      }
    }
    var res = ArrayList<Int>(mat.size*mat[0].size)
    for ((k, v) in mp) {
      if (k%2 == 0) res.addAll(v.reversed())
      else res.addAll(v)
    }
    return res.toIntArray()
  }
}