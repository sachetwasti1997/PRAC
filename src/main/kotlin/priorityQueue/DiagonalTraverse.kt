package priorityQueue

class DiagonalTraverse {
  fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
    val mp = HashMap<Int, ArrayList<Int>>()
    var maxk = 0
    for (i in nums.size - 1 downTo 0) {
      for (j in nums[i].indices) {
        mp.getOrPut(i+j){ArrayList()}.add(nums[i][j])
        maxk = maxk.coerceAtLeast(i+j)
      }
    }
    val res = ArrayList<Int>()
    for (i in 0 .. maxk) {
      mp[i]?.let { res.addAll(it) }
    }
    return res.toIntArray()
  }
}