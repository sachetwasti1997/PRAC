package recursion

class permutation_with_duplicate {
  fun permuteUnique(nums: IntArray): List<List<Int>> {
    val inp = HashMap<Int, Int>(nums.size).apply {
      for (i in nums) this[i] = this.getOrPut(i){0}+1
    }
    val visit = HashSet<Int>(nums.size)
    val tmp = ArrayList<Int>(nums.size)
    val res = ArrayList<ArrayList<Int>>(nums.size)
    fun create() {
      if (tmp.size == nums.size) {
        res.add(ArrayList(tmp))
        return
      }
      for (i in inp) {
        if (i.key !in visit && i.value > 0) {
          tmp.add(i.key)
          inp[i.key] = i.value - 1
          create()
          inp[i.key] = i.value + 1
          tmp.removeAt(tmp.size-1)
        }
      }
    }
    create()
    return res
  }
}

fun main() {
  val p = permutation_with_duplicate()
  p.permuteUnique(intArrayOf(1,1,3))
}