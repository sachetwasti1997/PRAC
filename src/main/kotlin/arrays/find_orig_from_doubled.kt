package arrays

import java.util.*
/**/
class find_orig_from_doubled {
  fun findOriginalArray(changed: IntArray): IntArray {
    if (changed.size % 2 != 0) return intArrayOf()
    changed.sort()
    val mp = HashMap<Int, Int>()
    for (i in changed) mp[i] = mp.getOrPut(i){0}+1
    val res = ArrayList<Int>()
    for (i in changed) {
      if (i in mp && 2*i in mp) {
        mp[i]?.let{ mp[i] = it-1 }
        if (mp[i] == 0) mp.remove(i)
        res.add(i)
        mp[2*i]?.let{ mp[2*i] = it - 1 }
        if (mp[2*i] == 0) mp.remove(2*i)
      }
    }
    return if (mp.size == 0) res.toIntArray() else intArrayOf()
  }
}

fun main() {
  val f = find_orig_from_doubled()
  f.findOriginalArray(intArrayOf(1,3,4,2,6,8))
}