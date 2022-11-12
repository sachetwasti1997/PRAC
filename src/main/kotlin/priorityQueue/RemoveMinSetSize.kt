package priorityQueue

import java.util.HashMap
import java.util.PriorityQueue

class RemoveMinSetSize {
  fun minSetSize(arr: IntArray): Int {
    val mp = HashMap<Int, Int>(arr.size)
    for (i in arr) mp[i] = mp.getOrPut(i){0}+1
    val pq = PriorityQueue<Int>(){a, b -> b - a}
    for ((_, v) in mp) {
      pq.add(v)
    }
    var res = 0
    var lnt = arr.size
    while (!pq.isEmpty()) {
      res++
      if (lnt - pq.peek() <= arr.size / 2) break
      lnt -= pq.poll()
    }
    return res
  }
}