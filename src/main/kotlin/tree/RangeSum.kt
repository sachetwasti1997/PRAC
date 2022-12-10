package tree

class RangeSum {
  /*
  class Sum (var sum: Int)
  fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int  {
    root?.let { rt ->
      var nd = 0
      if (rt.`val` in low .. high) {
        return rangeSumBST(rt.left, low, high) + rangeSumBST(rt.right, low, high) + rt.`val`
      }else if (rt.`val` < low) {
        return rangeSumBST(rt.right, low, high)
      } else {
        return rangeSumBST(rt.left, low, high)
      }
    }
    return 0
  }
   */
  fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int  {
    root?.let { rt ->
      var nd = 0
      if (rt.`val` in low .. high) {
        return rangeSumBST(rt.left, low, high) + rangeSumBST(rt.right, low, high) + rt.`val`
      }else if (rt.`val` < low) {
        return rangeSumBST(rt.right, low, high)
      } else {
        return rangeSumBST(rt.left, low, high)
      }
    }
    return 0
  }
}