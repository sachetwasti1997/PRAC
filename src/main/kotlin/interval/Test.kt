package interval

import java.util.PriorityQueue

class Test {
  fun minGroups(v: Array<IntArray>): Int {
    v.sortBy{ it[0] }
    val pq = PriorityQueue<Int>()
    for ((i,k) in v) {
      if (!pq.isEmpty() && pq.peek() < i) pq.poll()
      pq.add(k)
    }
    return pq.size
  }
}