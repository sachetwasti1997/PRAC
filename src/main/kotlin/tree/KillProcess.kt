package tree

class KillProcess {
  /*
  fun killProcess(pid: List<Int>, ppid: List<Int>, kill: Int): List<Int> {
    val graph = HashMap<Int, ArrayList<Int>>(ppid.size).apply {
      for (i in pid) this[i] = ArrayList<Int>()
    }
    for (i in pid.indices) {
      map[ppid[i]]?.add(pid[i])
    }

    val res = ArrayList<Int>()
    val q = LinkedList<Int>()
    q.add(kill)
    while (!q.isEmpty()) {
      var tmp = q.poll()
      map[tmp]?.let{
        for (i in it) {
          q.add(i)
        }
      }
      res.add(tmp)
    }
    return res
  }
   */
  fun killProcess(pid: List<Int>, ppid: List<Int>, kill: Int): List<Int> {
    return emptyList()
  }
}