package priorityQueue

import java.util.*

class KPairsSmallestSm {
  fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
    val pq = PriorityQueue<List<Int>> {l1, l2 -> (l2[0]+l2[1]) - (l1[0]+l1[1])}
    for (i in 0 until minOf(nums1.size, k)) {
      for (j in 0 until minOf(nums2.size, k)) {
        if (pq.isEmpty()) pq.add(listOf(nums1[i], nums2[j]))
        else if (nums1[i] + nums2[j] < pq.peek()[0]+pq.peek()[1] && pq.size == k) {
          pq.poll()
          pq.add(listOf(nums1[i], nums2[j]))
        }else if (pq.size < k) {
          pq.add(listOf(nums1[i], nums2[j]))
        } else if (nums1[i] + nums2[j] > pq.peek()[0]+pq.peek()[1]) break
      }
    }
    return pq.toList().reversed()
  }
}

fun main() {
  val K = KPairsSmallestSm()
  K.kSmallestPairs(intArrayOf(1,7,11), intArrayOf(2,4,6), 3)
}

