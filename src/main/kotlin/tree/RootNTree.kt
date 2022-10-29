package tree

class Node1(var `val`: Int) {
  var children: List<Node1?> = listOf()
}

class RootNTree {
  /*
  The idea is simple go through all the nodes and the node that cannot be found
  in the children List of any other node return them
  fun findRoot(tree: List<Node1>): Node1? {
    val sett = HashSet<Int>()
    for (i in tree) {
      for (j in i.children) {
        j?.let{ sett.add(it.`val`) }
      }
    }
    for (i in tree) {
      if (i.`val` !in sett) return i
    }
    return null
  }
   */
  fun findRoot(tree: List<Node1>): Node1? {
    val sett = HashSet<Int>()
    for (i in tree) {
      for (j in i.children) {
        j?.let{ sett.add(it.`val`) }
      }
    }
    for (i in tree) {
      if (i.`val` !in sett) return i
    }
    return null
  }

  /*
  Another Idea is to take sum of all nodes and substract all children nodes values
  in the list
  fun findRoot(tree: List<Node>): Node? {
    var sm: Long = 0
    for (i in tree) sm += i.`val`.toLong()
    for (i in tree) {
      for (j in i.children) j?.let{ sm -= it.`val` }
    }
    for (i in tree) {
      if (i.`val` == sm) return i
    }
    return null
  }
   */
}