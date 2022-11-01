package tree

typealias LI = ArrayList<Int>
class PrintTreeAntiClock {
  /*
  fun isLeaf(root: TreeNode?) {
    if (root == null) return false
    return root.left == null && root.right == null
  }
  fun addLeft(root: TreeNode?, res: LI) {
    if (root == null) return
    val cur = root.left
    while (cur != null) {
      if (!isLeaf(cur)) res.add(cur.`val`)
      if (cur.left != null) cur = cur.left
      else cur = cur.right
    }
  }
  fun addRight(root: TreeNode?, res: LI) {
    if (root == null) return
    val cur = root.right
    val tmp = LI()
    while (cur != null) {
      if (!isLeaf(cur)) res.add(cur.`val`)
      if (cur.right != null) cur = cur.right
      else cur = cur.left
    }
    res.addAll(tmp.reversed())
  }
  fun addLeaves(root: TreeNode?, res: LI) {
    if (isLeaf(root)) {
      root?.let{res.add(it)}
      return
    }
    root?.left{ addLeaves(it, res) }
    root?.right{ addLeaves(it, res) }
  }
  fun boundaryOfBinaryTree(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    val res = LI()
    res.add(root.`val`)
    addLeft(root, res)
    addLeaves(root, res)
    addRight(root, res)
  }
   */
  fun isLeaf(root: TreeNode?): Boolean {
    if (root == null) return false
    return root.left == null && root.right == null
  }
  fun addLeft(root: TreeNode?, res: LI) {
    if (root == null) return
    var cur = root.left
    while (cur != null) {
      if (!isLeaf(cur)) res.add(cur.`val`)
      if (cur.left != null) cur = cur.left
      else cur = cur.right
    }
  }
  fun addRight(root: TreeNode?, res: LI) {
    if (root == null) return
    var cur = root.right
    val tmp = LI()
    while (cur != null) {
      if (!isLeaf(cur)) res.add(cur.`val`)
      if (cur.right != null) cur = cur.right
      else cur = cur.left
    }
    res.addAll(tmp.reversed())
  }
  fun addLeaves(root: TreeNode?, res: LI) {
    if (isLeaf(root)) {
      root?.let{res.add(it.`val`)}
      return
    }
    root?.left?.let{ addLeaves(it, res) }
    root?.right?.let{ addLeaves(it, res) }
  }
  fun boundaryOfBinaryTree(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    val res = LI()
    res.add(root.`val`)
    addLeft(root, res)
    addLeaves(root, res)
    addRight(root, res)
    return res
  }
}