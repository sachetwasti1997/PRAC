package priorityQueue

import java.util.PriorityQueue

class ConnectingSticks {
  fun connectSticks(sticks: IntArray): Int {
    if (sticks.size == 1) return 0
    val pq = PriorityQueue<Int>(sticks.size)
    for (i in sticks) pq.add(i)
    var cst = 0
    while (!pq.isEmpty()) {
      val p1 = pq.poll() ?: 0
      val p2 = pq.poll() ?: 0
      cst += p1 + p2
      if (pq.isEmpty()) return cst
      pq.add(p1+p2)
    }
    return cst
  }
}