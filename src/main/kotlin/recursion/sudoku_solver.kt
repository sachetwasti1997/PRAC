package recursion

class sudoku_solver {
  fun solveSudoku(board: Array<CharArray>): Unit {
    fun isValid(row: Int, col: Int, c: Char): Boolean {
      for (i in 0..9) {
        if (board[row][i] == c) return false
        if (board[i][col] == c) return false
        if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + i % 3] == c) return false
      }
      return true
    }

    fun solve(): Boolean {
      for (i in board.indices) {
        for (j in 0 until board[0].size) {
          if (board[i][j] == '.') {
            for (c in '1'..'9') {
              if (isValid(i, j, c)) {
                board[i][j] = c
                if (solve()) return true
                else board[i][j] = '.'
              }
            }
            return false
          }
        }
      }
      return true
    }
    solve()
  }
}