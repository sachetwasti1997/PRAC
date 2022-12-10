package depthFirstSearch

import tree.TreeNode
typealias hm = HashMap<Int, Int>

fun dfs (root:TreeNode?, sm:hm): Int {
  var v = 0
  root?.let {
    val left = dfs(it.left, sm)
    val right = dfs(it.right, sm)
    v = left + right + it.`val`
    sm[v] = sm.getOrPut(v){0} + 1
  }
  return v
}

 fun findFrequentTreeSum(root: TreeNode?): IntArray {
   var max = Int.MIN_VALUE
   val res = ArrayList<Int>()
   val sm = hm()
   dfs(root, sm)
   for ((_,v) in sm) {
     max = max.coerceAtLeast(v)
   }
   for ((k,v) in sm) {
     if (v == max) res.add(k)
   }
   return res.toIntArray()
 }
