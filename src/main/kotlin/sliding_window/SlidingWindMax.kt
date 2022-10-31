package sliding_window

import java.util.LinkedList

class SlidingWindMax {
  /*
  fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    val dq =
  }
   */
  fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    val dq = LinkedList<Int>()
    var i = 0
    while (i < k) {
      if (dq.isEmpty()) dq.add(nums[i])
      else {
        while (!dq.isEmpty() && dq.last < nums[i]) dq.removeLast()
        dq.add(nums[i])
      }
      i++
    }
    val res = ArrayList<Int>()
    res.add(dq.first)
    i = 0
    var j = k
    while (j <= nums.size-1) {
      if (!dq.isEmpty() && dq.first == nums[i]) dq.removeFirst()
      i++
      if (dq.isEmpty()) dq.add(nums[j])
      else {
        while (!dq.isEmpty() && dq.last < nums[j]) dq.removeLast()
        dq.add(nums[j])
      }
      j++
      res.add(dq.first)
    }
    return res.toIntArray()
  }
}

fun main() {
  val s = SlidingWindMax()
  println(s.maxSlidingWindow(intArrayOf(1), 1).contentToString())
}