package breadth_first_search

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class TimeNeededToInform {
  fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
    if (n == 1) return 0
    val mp = HashMap<Int, ArrayList<Int>>()
    for (i in 0 until n)
      mp.getOrPut(manager[i]){ ArrayList() }.add(i)
    val q = LinkedList<IntArray>()
    q.add(intArrayOf(headID, 0))
    var tim = 0
    while (!q.isEmpty()) {
      val t = q.poll()
      tim = tim.coerceAtLeast(t[1])
      for (i in mp[t[0]].orEmpty()) {
        q.add(intArrayOf(i, t[1]+informTime[t[0]]))
      }
    }
    return tim
  }
}

fun main () {
  val t = TimeNeededToInform()
  t.numOfMinutes(4, 2, intArrayOf(3,3,-1,2), intArrayOf(0,0,162,914))
}