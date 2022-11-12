package priorityQueue

import java.util.PriorityQueue

class KthSmallestFraction {
  fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
    if (k == 1 && arr.size == 2) return arr
    val pq = PriorityQueue<Pair<Pair<Int, Int>, Double>>{a,b -> if (a.second < b.second) 1 else -1}
    for (i in 0 until arr.size - 1) {
      for (j in i+1 until arr.size) {
        pq.add(((arr[i] to arr[j]) to (arr[i]/arr[j]).toDouble()))
      }
    }
    var i = 0
    var ans = (0 to 0)
    while (i < k) {
      ans = pq.poll()?.first ?: (0 to 0)
      i++
    }
    return intArrayOf(ans.first, ans.second)
  }
}