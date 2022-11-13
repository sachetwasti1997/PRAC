package breadth_first_search

import java.util.*
import kotlin.collections.HashSet

class NearestExit {
  /*
  fun nearestExit(mz: Array<CharArray>, en: IntArray): Int {
    val visit = HashSet<String>()
    visit.add("${en[0]}${en[1]}")
    val q = LinkedList<IntArray>
    val dir = arrayOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)
    q.add(intArrayOf(en[0],en[1],0))
    var i = 0
    while (!q.isEmpty()) {
      val t = q.poll()
      if (i > 0 && (t[0] == 0 || t[0] == mz.size - 1 || t[1] == mz[0].size - 1 || t[1] == 0)) {
        return t[2]
      }
      for (i in dir) {
        val r = i.first + t[0]
        val c = i.second + t[1]
        if (r in (0 until mz.size) && c in (0 until mz[0].size)
            &&mz[r][c] != '+' && ("${r}${c}" !in visit)) q.add(intArrayOf(r, c, t[2]+1))
      }
    }
    return -1
  }
   */
  fun nearestExit(mz: Array<CharArray>, en: IntArray): Int {
    mz[en[0]][en[1]] = '+'
    val q = LinkedList<IntArray>()
    val dir = arrayOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)
    q.add(intArrayOf(en[0],en[1],0))
    var i = 0
    while (!q.isEmpty()) {
      val t = q.poll()
      if ("${t[0]}${t[1]}" != "${en[0]}${en[1]}"
        &&(t[0] == 0 || (t[0] == mz.size-1) || t[1] == 0 || t[1] == mz[0].size-1)) {
        return t[2]
      }
      for (i in dir) {
        val r = i.first + t[0]
        val c = i.second + t[1]
        if (r in (0 until mz.size) && c in (0 until mz[0].size)
          &&mz[r][c] != '+') {
          q.add(intArrayOf(r, c, t[2]+1))
          mz[r][c] = '+'
        }
      }
    }
    return -1
  }
}

