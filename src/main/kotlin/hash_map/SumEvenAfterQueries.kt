package hash_map

class SumEvenAfterQueries {
  fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
    val even = HashMap<Int, Int>(nums.size)
    var evnSm = 0
    for (i in nums.indices) {
      if (nums[i] % 2 == 0) {
        even[i] = nums[i]
        evnSm += nums[i]
      }
    }
    val res = IntArray(nums.size)
    for ((k, i) in queries.withIndex()) {
      if ((nums[i[1]] + i[0]) % 2 == 0) {
        if (i[1] !in even) {
          nums[i[1]] += i[0]
          evnSm += nums[i[1]]
        }else {
          evnSm += i[0]
          nums[i[1]] += i[0]
        }
        even[i[1]] = nums[i[1]]
      }else if ((nums[i[1]] + i[0]) % 2 != 0) {
        if (i[1] in even) {
          even.remove(i[1])
          evnSm -= nums[i[1]]
        }
        nums[i[1]] += i[0]
      }
      res[k] = evnSm
    }
    return res
  }
}