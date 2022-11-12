package hash_map

class split_possible {
  /*
  fun isPossible(nums: IntArray): Boolean {
    val freq = HashMap<Int, Int>(nums.size)
    for (i in nums) freq[i] = freq.getOrPut(i){0}+1
    val nd = HashMap<Int, Int>(nums.size)
    for (i in nums) {
      if (freq[i] == 0) continue
      if (nd[i] != null) {
        freq[i]?.let{freq[i] = it-1}
        nd[i]?.let{
          if (it-1 == 0) nd.remove(i)
          else nd[i] = it - 1
        }
      }else if (compareValues(freq[i+1], 1) >= 0 && compareValues(freq[i+2], 1) >= 0) {
        freq[i+1]?.let{ freq[i+1] = it - 1 }
        freq[i+2]?.let{ freq[i+2] = it - 1 }
        nd[i+2] = nd.getOrPut(i+2){0}+1
      }else return false
    }
    var sm = 0
    for ((_, v) in freq) sm += v
    return sm == 0
  }
   */
  fun isPossible(nums: IntArray): Boolean {
    val freq = HashMap<Int, Int>(nums.size)
    for (i in nums) freq[i] = freq.getOrPut(i){0}+1
    val nd = HashMap<Int, Int>(nums.size)
    for (i in nums) {
      if (freq[i] == 0) continue
      if (nd[i] != null) {
        freq[i]?.let{freq[i] = it-1}
        nd[i]?.let{
          if (it-1 == 0) nd.remove(i)
          else nd[i] = it - 1
        }
        nd[i+1] = nd.getOrPut(i+1){0}+1
      }else if (compareValues(freq[i+1], 1) >= 0 && compareValues(freq[i+2], 1) >= 0) {
        freq[i]?.let{ freq[i] = it - 1 }
        freq[i+1]?.let{ freq[i+1] = it - 1 }
        freq[i+2]?.let{ freq[i+2] = it - 1 }
        nd[i+3] = nd.getOrPut(i+3){0}+1
      }else return false
    }
    var sm = 0
    for ((_, v) in freq) sm += v
    return sm == 0
  }
}

fun main() {
  val s = split_possible()
  s.isPossible(intArrayOf(1,2,3,3,4,4,5,5))
}