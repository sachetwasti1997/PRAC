package string

import java.util.*
import kotlin.collections.HashMap

class ReorganiseString {
  /*
  fun reorganizeString(s: String): String {
    val mp = HashMap<Char, Int>().apply{
      for (i in s) this[i] = this.getOrPut(i){0}+1
    }
    val pq = PriorityQueue<Char>{a,b -> (mp[b] ?: 0) - (mp[a] ?: 0) }
    pq.addAll(mp.keys)
    val res = StringBuilder()
    while (pq.size > 1) {
      val f = pq.poll()
      val s = pq.poll()
      res.append(f)
      res.append(s)
      mp[f]?.let{
        if (it - 1 > 0) {
          mp[f] = it-1
          pq.add(f)
        }
      }
      mp[s]?.let{
        if (it - 1 > 0) {
          mp[s] = it-1
          pq.add(s)
        }
      }
    }
    if (!pq.isEmpty()) {
      val l = pq.poll()
      mp[l] ?. let{
        if (it > 1) return ""
      }
      res.append(l)
    }
    return res.toString()
  }
   */
  fun reorganizeString(s: String): String {
    val mp = HashMap<Char, Int>().apply{
      for (i in s) this[i] = this.getOrPut(i){0}+1
    }
    val pq = PriorityQueue<Char>{a,b -> (mp[b] ?: 0) - (mp[a] ?: 0) }
    pq.addAll(mp.keys)
    val res = StringBuilder()
    while (pq.size > 1) {
      val f = pq.poll()
      val s = pq.poll()
      res.append(f)
      res.append(s)
      mp[f]?.let{
        if (it - 1 > 0) {
          mp[f] = it-1
          pq.add(f)
        }
      }
      mp[s]?.let{
        if (it - 1 > 0) {
          mp[s] = it-1
          pq.add(s)
        }
      }
    }
    if (!pq.isEmpty()) {
      val l = pq.poll()
      mp[l] ?. let{
        if (it > 1) return ""
      }
      res.append(l)
    }
    return res.toString()
  }
}