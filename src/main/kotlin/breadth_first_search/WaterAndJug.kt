package breadth_first_search

import java.util.*
import kotlin.collections.HashSet

class WaterAndJug {
  fun canMeasureWater(j1: Int, j2: Int, tC: Int): Boolean {
    val q = LinkedList<Int>()
    q.add(0)
    val visit = HashSet<Int>()
    visit.add(0)
    val dir = intArrayOf(j1, -j1, j2, -j2)
    while(!q.isEmpty()) {
      val cur = q.poll();
      for (d in dir) {
        val total = cur + d
        if (total < 0 || total > j1 + j2) continue
        if (total == tC) return true
        if (!visit.contains(total)) {
          q.add(total)
          visit.add(total)
        }
      }
    }
    return false
  }
}