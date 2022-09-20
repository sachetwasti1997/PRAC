package recursion

/**
 * Not a big deal
 * 3 directions needs to be traversed upperleft, left, lowerleft
 * n-1+col-row
 * col+row
 * row
 * when you reach the n after filling last column n-1 then you have found arrangement
 * store the result
 * and while backtraking remove all the places previously filled places
 * and now while backtracking fill the results
 */
class n_queen {
  fun solveNQueens(n: Int): List<List<String>> {
    val lwrD = IntArray(2*n-1){-1}
    val upprD = IntArray(2*n-1){-1}
    val lft = IntArray(n){-1}
    val board = ArrayList<CharArray>(n).apply {
      for (i in 0 until n) this.add(CharArray(n){'.'})
    }
    val res = ArrayList<ArrayList<String>>()
    fun dfs(col: Int) {
      if (col == n) {
        val rres = ArrayList<String>()
        for (i in board) {
          rres.add(i.joinToString (""))
        }
        res.add(rres)
        return
      }
      for (row in 0 until n) {
        if (lft[row] == -1 && lwrD[row+col] == -1 && upprD[n-1+col-row] == -1) {
          lft[row] = 0
          lwrD[row+col] = 0
          upprD[n-1+col-row] = 0
          board[row][col] = 'Q'
          dfs(col+1)
          board[row][col] = '.'
          lft[row] = -1
          lwrD[row+col] = -1
          upprD[n-1+col-row] = -1
        }
      }
    }
    dfs(0)
    return res
  }
}

fun main() {
  val nq = n_queen()
  nq.solveNQueens(4);
}