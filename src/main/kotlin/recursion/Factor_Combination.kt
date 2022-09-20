package recursion

class Factor_Combination {
    fun getFactors(n: Int): List<List<Int>> {
      if (n == 1) return emptyList()
      val tmp = ArrayList<Int>()
      val res = ArrayList<ArrayList<Int>>()
      fun create(prd: Int, index: Int) {
        if (prd > n) return
        if (prd == n) {
          res.add(ArrayList(tmp))
          return
        }
        for (i in index .. (n / prd)) {
          if (n % i == 0 && i != n) {
            tmp.add(i)
            create(prd * i, i)
            tmp.removeAt(tmp.size - 1)
          }
        }
      }
      create(1, 2)
      return res
    }
}

fun main() {
  val f = Factor_Combination()
  f.getFactors(37)
}