package hash_map

class SortByFreq {
  /*
  fun frequencySort(s: String): String {
    val mp = HashMap<Char, Int>(s.length)
    for (i in s) mp[i] = mp.getOrPut(i){0}+1
    val arr = ArrayList<Pair<Int, Int>>(mp.size)
    for ((k, v) im mp) arr.add(v to k)
    arr.sortDescendingBy{ it.first }
    val sb = StringBuilder()
    for (i in arr) sb.append(i.second)
    return sb.toString()
  }
   */
  fun frequencySort(s: String): String {
    val mp = HashMap<Char, Int>(s.length)
    for (i in s) mp[i] = mp.getOrPut(i){0}+1
    val arr = ArrayList<Pair<Int, Char>>(mp.size)
    for ((k, v) in mp) arr.add(v to k)
    arr.sortByDescending{ it.first }
    val sb = StringBuilder()
    for (i in arr) {
      var fr = i.first
      while (fr > 0) {
        sb.append(i.second)
        fr--
      }
    }
    return sb.toString()
  }
}