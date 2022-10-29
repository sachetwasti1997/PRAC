package tree
typealias lstI = List<Int>
typealias hmILst = HashMap<Int, ArrayList<Int>>
/*
The Idea is simple here,
- Make the adjacency list representation of the tree, the max size of list can be 3,
- Now do a bfs and from the target node. Store all the nodes which are at distance k from target node
 */
class AllNodesDisK {
  /*
  fun createAdjList(gr:hmILst, root: TreeNode?, par: Int) {
    if (root == null) return
    gr[root.`val`] = ArrayList()
    if (par != -1) {
      gr[par]?.add(root.`val`)
      gr[root.`val`]?.add(par)
    }
    createAdjList(gr, root.left, root.`val`)
    createAdjList(gr, root.right, root.`val`)
  }
  fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
    if (root == null) return emptyList()
    val gr = hmILst()
    createAdjList(gr, root, -1)
    val q = LinkedList<Int>()
    target?.let{ q.add(it) }
    val visit = HashSet<Int>()
    var n = 0
    var res = ArrayList<Int>()
    while (!q.isEmpty()) {
      val tmp = q.poll()
      n++
      for (i in gr[tmp].orEmpty()) {
        if (!visit.contains(i)) {
          q.add(i)
          visit.add(i)
          if (n == k) res.add(i)
        }
      }
      if (n == k) break
    }
    return res
  }
   */
  fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
    return emptyList()
  }
}