package tree

import java.util.*

class LvlWithMaxSum {
  /*
  fun maxLevelSum(root: TreeNode?): Int {
    val q = LinkedList<TreeNode?>()
    q.add(root)
    var mx = Int.MIN_VALUE
    var mxl = -1
    var lvl = 1
    while (!q.isEmpty()) {
      val sz = q.size
      var sm = 0
      for (i in 0 until sz) {
        val tmp = q.poll()
        tmp?.let{
          sm += it
          it.left?.let{ l-> q.add(l) }
          it.right?.let{ r->q.add(r) }
        }
      }
      if (mx < sm) {
        mxl = lvl
      }
      lvl++
    }
    return mxl
  }
   */
  fun maxLevelSum(root: TreeNode?): Int {
    val q = LinkedList<TreeNode?>()
    q.add(root)
    var mx = Int.MIN_VALUE
    var mxl = -1
    var lvl = 1
    while (!q.isEmpty()) {
      val sz = q.size
      var sm = 0
      for (i in 0 until sz) {
        val tmp = q.poll()
        tmp?.let{
          sm += it.`val`
          it.left?.let{ l-> q.add(l) }
          it.right?.let{ r->q.add(r) }
        }
      }
      if (mx < sm) {
        mxl = lvl
      }
      lvl++
    }
    return mxl
  }
}