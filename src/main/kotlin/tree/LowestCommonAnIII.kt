package tree

class LowestCommonAnIII {
  fun lowestCommonAncestor(p: NodeR?, q: NodeR?): NodeR? {
    val stt = HashSet<Int>()
    var p1 = p
    while (p1 != null) {
      stt.add(p1.`val`)
      p1 = p1.parent
    }
    var q1 = q
    while (q1 != null) {
      if (stt.contains(q1.`val`)) return q1
      q1 = q1.parent
    }
    return null
  }
}