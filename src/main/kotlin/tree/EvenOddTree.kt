package tree

import java.util.*
import kotlin.collections.ArrayList

class EvenOddTree {
  fun isEvenOddTree(root: TreeNode?): Boolean {
    if (root != null && root.`val` % 2 == 0) return false
    val q = LinkedList<TreeNode?>()
    q.add(root)
    var lvl = 0
    while (!q.isEmpty()) {
      val sz = q.size
      val lst = ArrayList<Int>()
      for (i in 0 until sz) {
        val t = q.poll()
        t?.let{
          if (lvl > 0)lst.add(it.`val`)
          if (lvl % 2 == 0 && it.`val` % 2 == 0) return false
          if (lvl % 2 != 0 && it.`val` % 2 != 0) return false
        }
        t?.left?.let { q.add(it) }
        t?.right?.let { q.add(it) }
      }
      if (lvl > 0) {
        for (i in 1 until lst.size) {
          if (lvl % 2 == 0 && lst[i] <= lst[i-1]) return false
          else if (lvl % 2 != 0 && lst[i] >= lst[i-1]) return false
        }
      }
      lvl ++
    }
    return true
  }
}