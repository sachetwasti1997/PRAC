package tree

class LCAOfDeepestLeaves {
  class MxHld(var mxHt: Int = 0, var root: TreeNode?= null)
  fun find(mx: MxHld, node: TreeNode ?= null, par: TreeNode ?= null, dpth:Int):Int {
    if (node == null) return dpth
    val l = find(mx, node.left, node, dpth+1)
    val r = find(mx, node.right, node, dpth+1)
    if (l >= mx.mxHt && l == r) {
      mx.mxHt = l
      mx.root = node
    }
    return l.coerceAtLeast(r)
  }
  fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
    val mx = MxHld()
    find(mx, root, null, 0)
    return mx.root
  }
}