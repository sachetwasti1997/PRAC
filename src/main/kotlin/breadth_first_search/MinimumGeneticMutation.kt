package breadth_first_search

import java.util.*
import kotlin.collections.HashSet

class MinimumGeneticMutation {
  /*
  fun minMutation(start: String, end: String, bank: Array<String>): Int {
    val q = LinkedList<Pair<String, Int>>()
    q.add(start to 0)
    val hs = HashSet<String>()
    for (i in bank) hs.add(i)
    val visited = HashSet<String>()
    visited.add(start)
    val chars = listOf('A', 'C', 'T', 'G')
    while (!q.isEmpty()) {
      val tmp = q.poll()
      if (tmp.first == end) return tmp.second
      for (i in tmp.first.indices) {
        for (j in chars) {
          tmp.first[i] = j
          if (tmp.first in hs && tmp.first !in visited) {
            q.add(tmp.first to tmp.second+1)
            visited.add(tmp.first)
          }
        }
      }
    }
    return ""
  }
   */
  fun minMutation(start: String, end: String, bank: Array<String>): Int {
    val q = LinkedList<Pair<String, Int>>()
    q.add(start to 0)
    val hs = HashSet<String>()
    for (i in bank) hs.add(i)
    val visited = HashSet<String>()
    visited.add(start)
    val chars = listOf('A', 'C', 'T', 'G')
    while (!q.isEmpty()) {
      val tmp = q.poll()
      if (tmp.first == end) return tmp.second
      for (i in tmp.first.indices) {
        val str = StringBuilder(tmp.first)
        for (j in chars) {
          str[i] = j
          if (str.toString() in hs && str.toString() !in visited) {
            q.add(str.toString() to tmp.second+1)
            visited.add(str.toString())
          }
        }
      }
    }
    return -1
  }
}

fun main () {
  val s = MinimumGeneticMutation()
  s.minMutation("AACCGGTT", "AACCGGTA", arrayOf("AACCGGTA"))
}