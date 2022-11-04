package arrays

class PartitionArrayMaxDiffK {
  /*
  fun partitionArray(nums: IntArray, k: Int): Int {
    nums.sort()
    var num_par = 0
    var min = nums[0]
    var i = 0
    while (i < nums.size) {
      if (nums[i] - min > k) {
        min = nums[i]
        num_par++
      }
      i++
    }
    return num_par
  }
   */
  fun partitionArray(nums: IntArray, k: Int): Int {
    nums.sort()
    var num_par = 0
    var min = nums[0]
    var i = 0
    while (i < nums.size) {
      if (nums[i] - min > k) {
        min = nums[i]
        num_par++
        i--
      }
      i++
    }
    return num_par
  }
}

fun main () {
  val p = PartitionArrayMaxDiffK()
  p.partitionArray(intArrayOf(3,6,1,2,5), 2)
}