package breadth_first_search

import java.util.*

class NearestRightNode {
  /*
  fun findNearestRightNode(root: TreeNode?, u: TreeNode?): TreeNode? {
    val q = LinkedList<TreeNode?>()
    q.add(root)
    while (!q.isEmpty()) {
      val sz = q.size
      for (i in 0 until sz) {
        val t = q.poll()
        if (t == u) {
          return q.peek() ?: null
        }
        t?.left?.let{q.add(it)}
        t?.right?.let{q.add(it)}
      }
    }
    return null
  }
   */
  fun findNearestRightNode(root: TreeNode?, u: TreeNode?): TreeNode? {
    val q = LinkedList<TreeNode?>()
    q.add(root)
    while (!q.isEmpty()) {
      val sz = q.size
      for (i in 0 until sz) {
        val t = q.poll()
        if (t == u) {
          return q.peek()
        }
        t?.left?.let{q.add(it)}
        t?.right?.let{q.add(it)}
      }
    }
    return null
  }
}