package arrays

class MissingRanges {
  /*
  fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<String> {
    var st = lower
    val res = ArrayList<String>()
    for (i in nums) {
      if (st < i) {
        if (st == i - 1) {
          res.add(st.toString())
        }else {
          res.add(st.toString()+"->"+i-1)
        }
      }
      st = i+1
    }
    if (st <= upper) {
      if (st == upper) res.add(st.toString())
      else res.add(st.toString()+"->"+upper)
    }
    return res
  }
   */
  fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<String> {
    var st = lower
    val res = ArrayList<String>()
    for (i in nums) {
      if (st < i) {
        if (st == i - 1) {
          res.add(st.toString())
        }else {
          res.add(st.toString()+"->"+(i-1).toString())
        }
      }
      st = i+1
    }
    if (st <= upper) {
      if (st == upper) res.add(st.toString())
      else res.add(st.toString()+"->"+upper.toString())
    }
    return res
  }
}

fun main() {
  val s = MissingRanges()
  println(s.findMissingRanges(intArrayOf(-1), -1, -1))
}