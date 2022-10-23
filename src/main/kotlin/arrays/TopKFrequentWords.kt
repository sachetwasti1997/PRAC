package arrays

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class TopKFrequentWords {
  fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val pq = PriorityQueue<Pair<Int, String>>
    {p1, p2 -> if(p1.first == p2.first) p1.second.compareTo(p2.second) else p2.first-p1.first}

    val mp = HashMap<String, Int>()
    for(i in words) mp[i] = mp.getOrPut(i){0} + 1
    for ((k,v) in mp) pq.add(v to k)
    var k1 = k
    var res = ArrayList<String>()
    while (k1 > 0) {
      res.add(pq.poll().second)
      k1--
    }
    return res
  }
}