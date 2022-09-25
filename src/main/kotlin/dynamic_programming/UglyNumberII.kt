package dynamic_programming

class UglyNumberII {
  fun nthUglyNumber(n: Int): Int {
    val map = HashMap<Int, ArrayList<Int>>()
    map[2] = arrayListOf(2)
    map[3] = arrayListOf(3)
    map[5] = arrayListOf(5)
    var p1 = 1
    var p2 = 0
    var p3 = 0
    var val2 = 2
    var val3 = 3
    var val5 = 5
    var mini = 2
    val res = arrayListOf(1, 2)
    while (res.size <= n) {
      val2 *= mini
      val3 *= mini
      val5 *= mini
      map[2]?.add(val2)
      map[3]?.add(val3)
      map[5]?.add(val5)
      val m1 = map[2]?.get(p1) ?: Int.MAX_VALUE
      val m2 = map[3]?.get(p2) ?: Int.MAX_VALUE
      val m3 = map[5]?.get(p3) ?: Int.MAX_VALUE
      println("$m1 $m2 $m3")
      mini = minOf(m1, m2, m3)
      if (mini == map[2]?.get(p1)) p1++
      if (mini == map[3]?.get(p2)) p2++
      if (mini == map[5]?.get(p3)) p3++
      println("-- $p1 $p2 $p3")
      res.add(mini)
      val2 = 2
      val3 = 3
      val5 = 5
    }
    println(res)
    return res[res.size-1]
  }
}

fun main() {
  val u = UglyNumberII()
  u.nthUglyNumber(8)
}