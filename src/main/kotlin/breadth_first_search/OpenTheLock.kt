package breadth_first_search

import java.util.LinkedList

/*
fun children (str: String): List<String> {
  val res = ArrayList<String>()
  for (i in str.indices) {
    res.add(str[i].substring(0, i) + ((str[i].toInt() + 1) % 10) + str[i].substring(i, str.length))
    res.add(str[i].substring(0, i) + ((str[i].toInt() - 1 + 10) % 10) + str[i].substring(i, str.length))
  }
  return res
}
fun openLock (deadends: Array<String>, target: String): Int {
  val q = mutableListOf("0000" to 0)
  val strt = "0000"
  val visit = new HashSet<String>().apply{
    for (i in deadEnds) this.add(i)
  }
  while (!q.isEmpty()) {
    val tmp = q.poll()
    if (tmp.first == target) return tmp.second
    for (child in children(tmp.first)) {
      if (child !in visit) {
        visit.add(child)
        q.add(child to tmp.second + 1)
      }
    }
  }
  return -1
}
 */
fun children (str: String): List<String> {
  val res = ArrayList<String>()
  for (i in str.indices) {
    res.add(str.substring(0, i) + ((str[i] - '0' + 1) % 10) + str.substring(i+1, str.length))
    res.add(str.substring(0, i) + ((str[i] - '0' - 1 + 10) % 10) + str.substring(i+1, str.length))
  }
  return res
}
fun openLock (deadends: Array<String>, target: String): Int {
  val q = mutableListOf("0000" to 0)
  val strt = "0000"
  val visit = HashSet<String>().apply{
    for (i in deadends) this.add(i)
  }
  if (visit.contains("0000")) return -1
  while (q.isNotEmpty()) {
    val tmp = q.removeAt(0)
    if (tmp.first == target) return tmp.second
    val chlds = children(tmp.first)
    for (child in chlds) {
      if (child !in visit) {
        visit.add(child)
        q.add(child to tmp.second + 1)
      }
    }
  }
  return -1
}

fun main() {
  println(openLock(arrayOf("0201","0101","0102","1212","2002"), "0202"))
}