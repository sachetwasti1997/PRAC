package arrays

import java.util.*
import kotlin.Comparator

class MaxEvents {
  fun maxEvents (events: Array<IntArray>): Int {
    events.sortWith(
      Comparator {
          o1, o2 ->
            if (o1[1] != o2[1]) return@Comparator o1[1] - o2[1]
            else return@Comparator o1[0] - o2[0]
      }
    )
    val min = events[0][0]
    val max = events[events.size-1][1]
    val avlTimes = LinkedList<Int>()
    for (i in min .. max) {
      avlTimes.add(i)
    }
    var days = 0
    for (i in events) {
      if (!avlTimes.isEmpty() && avlTimes.peek() in i[0] .. i[1]) {
        days++
        avlTimes.pop()
      }else if (avlTimes.isEmpty()) return days
    }
    return days
  }

}