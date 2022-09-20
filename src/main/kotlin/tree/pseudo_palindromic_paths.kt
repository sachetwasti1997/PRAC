package tree

import java.lang.StringBuilder
import javax.xml.stream.events.Characters

class pseudo_palindromic_paths {
  fun pseudoPalindromicPaths (root: TreeNode?): Int {
    val nm = HashMap<Int, Int> ()
    var res = 0
    fun traverse(r: TreeNode?) {
      if (r == null) return
      nm[r.`val`] = nm.getOrPut(r.`val`){0}+1
      if (r.left == null && r.right == null) {
        var odd_cnt = 0
        for (k in nm) {
          if (k.value % 2 != 0) odd_cnt++
        }
        if(odd_cnt == 1 || odd_cnt == 0) res ++
      }else{
        traverse(r.left)
        traverse(r.right)
      }
      if (nm[r.`val`] == 1) nm.remove(r.`val`)
      else nm[r.`val`]?.let{nm[r.`val`] = it - 1}
    }
    traverse(root)
    return res
  }
}

fun main () {
  val rt = TreeNode(2)
  val lft1 = TreeNode(3)
  val rht1 = TreeNode(1)
  val lft11 = TreeNode(3)
  val rht11 = TreeNode(1)
  val rht12 = TreeNode(1)
  rt.left = lft1
  rt.right = rht1
  lft1.left = lft11
  lft1.right = rht11
  rht1.right = rht12

  val p = pseudo_palindromic_paths()
  p.pseudoPalindromicPaths(rt)
}