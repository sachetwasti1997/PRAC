package arrays

class UserWebSiteVisitPattern {
  /*
  fun mostVisitedPattern(usrnm: Array<String>, tmstmp: IntArray, wbst: Array<String>): List<String> {
    val resLst = ArrayList<Triple<Int, String, String>>()
    for (i in usrnm.indices) {
      resLst.add(Triple(tmstmp[i], usrnm[i], wbst[i]))
    }
    val mp = HashMap<String, ArrayList<String>>()
    for ((t, u, w) in resLst) {
      mp[u] =
    }
  }
   */
  fun mostVisitedPattern(usrnm: Array<String>, tmstmp: IntArray, wbst: Array<String>): List<String> {
    val resLst = ArrayList<Triple<Int, String, String>>()
    for (i in usrnm.indices) {
      resLst.add(Triple(tmstmp[i], usrnm[i], wbst[i]))
    }
    val mp = HashMap<String, ArrayList<String>>()
    for ((_, u, w) in resLst) {
      mp.getOrPut(u){ArrayList()}.add(w)
    }
    val resMap = HashMap<List<String>, Int>()
    for ((_, v) in mp) {
      v.chunked(3).forEach{
        resMap[it] = resMap.getOrPut(it){0} + 1
      }
    }
    var max = Int.MIN_VALUE
    for ((_, v) in resMap) max = max.coerceAtLeast(v)
    val res = ArrayList<List<String>>()
    for ((k, v) in resMap) if (max == v) res.add(k)
    var resR = res[0]
    for (i in 1 until res.size) {
      val tmp = res[i]
      for (j in resR.indices) {
        if (tmp[j] < resR[j]) {
          resR = tmp
          break
        }
      }
    }
    return resR
  }
}

fun main () {
  val u = UserWebSiteVisitPattern()
  var v = u.mostVisitedPattern(arrayOf("joe","joe","joe","james","james","james","james","mary","mary","mary"),
  intArrayOf(1,2,3,4,5,6,7,8,9,10),
    arrayOf("home","about","career","home","cart","maps","home","home","about","career")
  )
  println(v)
  v = u.mostVisitedPattern(arrayOf("ua","ua","ua","ub","ub","ub"),
    intArrayOf(1,2,3,4,5,6),
    arrayOf("a","b","a","a","b","c")
  )
  println(v)
}