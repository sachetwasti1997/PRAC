package recursion

class print_permut {
  fun permute(nums: IntArray): List<List<Int>> {
    val tmp = ArrayList<Int>()
    val visit = HashSet<Int>()
    val res = ArrayList<ArrayList<Int>>()
    fun create() {
      if (tmp.size == nums.size) {
        res.add(ArrayList(tmp))
        return
      }
      for (k in nums) {
        if (k !in visit) {
          visit.add(k)
          tmp.add(k)
          create()
          tmp.removeAt(tmp.size - 1)
          visit.remove(k)
        }
      }
    }
    create()
    return res
  }
}

fun main() {
  val p = print_permut()
  p.permute(intArrayOf(1,2,3))
}