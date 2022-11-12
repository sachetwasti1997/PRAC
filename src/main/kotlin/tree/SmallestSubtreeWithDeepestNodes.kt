package tree

class SmallestSubtreeWithDeepestNodes {
  class MxHldr (var mxVl: Int = 0, var nd: TreeNode? = null)
  fun findHt (root: TreeNode?, dpth: Int, mxHldr: MxHldr):Int {
    if (root == null) return dpth
    val l = findHt(root.left, dpth+1, mxHldr)
    val r = findHt(root.right, dpth+1, mxHldr)
    if (l >= mxHldr.mxVl && l == r) {
      mxHldr.mxVl = l
      mxHldr.nd = root
    }
    return l.coerceAtLeast(r)
  }
  fun subtreeWithAllDeepest (root: TreeNode?): TreeNode? {
    val mx = MxHldr()
    findHt(root, 0, mx)
    return mx.nd
  }
}