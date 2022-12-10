package tree


/*

fun dfs(root: TreeNode?, ins: String, lst: LinkedList<Int>): Boolean {
  root?.let{ rt ->
    val left = dfs(rt.left, ins, lst)
    val rght = dfs(rt.right, ins, lst)
    if (rt.left == null && rt.right == null) {
      if (ins == "ADD") lst.add(rt.`val`)
      else {
        if (lst.isEmpty() || lst.peek() != rt.`val`) return false
        lst.poll()
      }
    }
    return left && rght
  }
  return true
}

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
  val l1 = LinkedList<Int>()
  dfs(root1, "ADD", l1)
  return dfs(root2, "REMOVE", l2)
}
 */

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
  return false
}