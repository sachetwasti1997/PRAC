package dynamic_programming

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

typealias AL = ArrayList<Int>
typealias HMp = HashMap<Int, Int>
class RearrangeBarCodes {
  /*
  fun rearrangeBarcodes(b: IntArray): IntArray {
    val mp = HashMap<Int, Int>(barcodes.size)
    for (i in b) mp[i] = mp.getOrPut(i){0}+1
    val pq = PriorityQueue<Pair<Int, Int>>(){a,b -> b.second - a.second}
    for ((k, v) in mp) pq.add(v to k)
    val res = IntArray(b.size){-1}
    var i = 0
    while (!pq.isEmpty()) {
      val p1 = pq.poll()
      val p2 = pq.poll()
      if (res[0] == -1 || res[i-1] == p2.first) {
        res[i++] = p1.first
        res[i++] = p2.first
      }else if (res[i-1] == p1.first) {
        res[i++] = p2.first
        res[i++] = p1.first
      }
      if (p1.second - 1 > 0) pq.add(p1.first to p1.second - 1)
      if (p2.second - 1 > 0) pq.add(p2.first to p2.second - 1)
    }
    return res
  }
   */
  fun rearrangeBarcodes(b: IntArray): IntArray {
    val mp = HashMap<Int, Int>(b.size)
    for (i in b) mp[i] = mp.getOrPut(i){0}+1
    val pq = PriorityQueue<Pair<Int, Int>>(){a,b -> b.second - a.second}
    for ((k, v) in mp) pq.add(k to v)
    val res = IntArray(b.size){-1}
    var i = 0
    while (!pq.isEmpty()) {
      val p1 = pq.poll() ?: (-1 to -1)
      val p2 = pq.poll() ?: (-1 to -1)
      if (p1.first == -1 || p2.first == -1) {
        res[i++] = if (p1.first != -1) p1.first else p2.second
        continue
      }
      res[i++] = p1.first
      res[i++] = p2.first

      if (p1.second - 1 > 0) pq.add(p1.first to p1.second - 1)
      if (p2.second - 1 > 0) pq.add(p2.first to p2.second - 1)
    }
    return res
  }
}

fun main () {
  val r = RearrangeBarCodes()
  println(r.rearrangeBarcodes(intArrayOf(1, 2)).contentToString())
}