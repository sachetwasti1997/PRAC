package breadth_first_search

import java.util.*
import kotlin.collections.HashSet

class MinKnightMove {
  /*
  fun minKnightMoves(x: Int, y: Int): Int {
    val dir = arrayOf(-2 to -1, -2 to 1, 2 to -1, 2 to 1
                      -1 to -2, -1 to 2, 1 to -2, 1 to 2)
    val q = LinkedList<Triple<Int, Int, Int>>()
    q.add(Triple(0, 0, 0))
    var ans = 0
    while (!q.isEmpty()) {
      val tmp = q.poll()
      ans = tmp.third
      if (tmp.first == x && tmp.second == y) break
      for (i in dir) q.add(Triple(i.first+tmp.first, i.second+tmp.second, ans + 1))
    }
    return ans
  }
   */
  fun minKnightMoves(x: Int, y: Int): Int {
    val dir = arrayListOf(-2 to -1, -2 to 1, 2 to -1, 2 to 1,
      -1 to -2, -1 to 2, 1 to -2, 1 to 2)
    val q = LinkedList<Triple<Int, Int, Int>>()
    q.add(Triple(0, 0, 0))
    var ans = 0
    val visited = HashSet<String>()
    while (!q.isEmpty()) {
      val tmp = q.poll()
      ans = tmp.third
      if (tmp.first == x && tmp.second == y) break
      for (i in dir) {
        if ("${i.first+tmp.first}, ${i.second+tmp.second}" !in visited) {
          q.add(Triple((i.first+tmp.first), (i.second+tmp.second),( ans + 1)))
          visited.add("${i.first+tmp.first}, ${i.second+tmp.second}")
        }
      }
    }
    return ans
  }
}

fun main () {
  val m = MinKnightMove()
  m.minKnightMoves(5, 5)
}