package tree

import java.util.*
import kotlin.collections.ArrayList

class CR_Lst {
  fun reverseOddLevels(root: TreeNode?): TreeNode? {
    if (root?.left == null && root?.right == null) return root
    val newNode = TreeNode(root.`val`)
    val q = LinkedList<TreeNode?>()
    q.add(root)
    val q1 = LinkedList<TreeNode?>()
    q1.add(newNode)
    var sz1 = q.size
    var sz2 = q1.size
    var lvl = 1
    while (!q.isEmpty()) {
      var lvl_lst = ArrayList<Int>()
      for (i in 0 until sz1) {
        val r = q.poll()
        r?.left?.let{
          lvl_lst.add(it.`val`)
          q.add(it)
        }
        r?.right?.let{
          lvl_lst.add(it.`val`)
          q.add(it)
        }
      }
      sz1 = q.size
      if(lvl % 2 != 0)lvl_lst.reverse()
      var k = 0
      for (i in 0 until sz2) {
        val r = q1.poll()
        r?.left = TreeNode(lvl_lst[k])
        r?.right = TreeNode(lvl_lst[k+1])
        r?.left?.let{ q1.add(it) }
        r?.right?.let{ q1.add(it) }
        k += 2
      }
      sz2 = q1.size
      lvl++
    }
    return newNode
  }
}