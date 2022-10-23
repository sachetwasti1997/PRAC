package arrays

class SetZeroesMatrix {
  fun setZeroes(m: Array<IntArray>): Unit {
    var arr = ArrayList<Pair<Int, Int>>()
    for (i in m.indices) {
      for (j in m[0].indices) {
        if (m[i][j] == 0) arr.add(i to j)
      }
    }
    println(arr)
    val cpy = m.copyOf()
    for (i in arr) {
      var k = i.first
      var l = i.second
      var i1 = 0
      while (i1 < m.size) {
        println("$i1 $l ---")
        cpy[i1++][l] = 0
      }
      var j1 = 0
      while (j1 < m[0].size) {
        println("$k $j1")
        cpy[k][j1++] = 0
      }
    }
    for (i in m.indices) {
      for (j in m[0].indices) {
        m[i][j] = cpy[i][j]
      }
    }
    for (i in m) println(i.contentToString())
  }
}

fun main() {
  val s = SetZeroesMatrix()
  s.setZeroes(arrayOf(intArrayOf(0,1,2,0), intArrayOf(3,4,5,2), intArrayOf(1,3,1,5)))
}