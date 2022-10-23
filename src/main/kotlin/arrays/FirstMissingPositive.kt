package arrays

class FirstMissingPositive {
  fun firstMissingPositive(nums: IntArray): Int {
    nums.sort()
    var n = 1
    for (i in nums) {
      if (i == n) n++
    }
    return n
  }
  fun firstMissingPositive2(nums: IntArray): Int {
    var stt = HashSet<Int>().apply {
      for (i in nums)this.add(i)
    }
    for (i in 1 .. nums.size+1) {
      if (i !in stt) return i
    }
    return 0
  }
}