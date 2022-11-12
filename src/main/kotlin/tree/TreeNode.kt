package tree

class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

class NodeR(var `val`: Int, var left: NodeR?, var right: NodeR?, var parent: NodeR?)

class Node(var `val`: Int, var left: Node? = null, var right: Node? = null, var random: Node? = null)

class NodeCopy(var `val`: Int, var left: Node? = null, var right: Node? = null, var random: Node? = null)

class NodeN(var `val`: Int) {
  var children: List<NodeN?> = listOf()
}