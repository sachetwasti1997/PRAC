package hash_map

class UniqueNoOfOccurances {
  /*
  fun uniqueOccurrences(arr: IntArray): Boolean {
    val mp = HashMap<Int, Int>(arr.size)
    for (i in arr) mp[i] = mp.getOrDefault(i){0} + 1
    val st = HashSet<Int>()
    for ((_, v) in mp) {
      if (v in st) return false
    }
    return true
  }
   */
  fun uniqueOccurrences(arr: IntArray): Boolean {
    val mp = HashMap<Int, Int>(arr.size)
    for (i in arr) mp[i] = mp.getOrPut(i){0} + 1
    val st = HashSet<Int>()
    for ((_, v) in mp) {
      if (v in st) return false
      st.add(v)
    }
    return true
  }
}

/**
 * 1. Observe your actions & emotions with kindness. Don't judge. Just tell yourSelf this is no longer who you are.
2. Give yourSelf love & understanding in everything you do & have done.
3. Imagine & Believe it's fulfilled & move on.
4. Your inner dialogue should match what you want. Match your speech & thoughts, as if it is already done.
Think from the end.... Example, "I love my new house", "I love the money I make in my new job"...
5. Make it a habit, do it repetitively, daily.
6.
 */