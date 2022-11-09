package arrays

class BuildingsWithOceanView {
  /*
  fun findBuildings(heights: IntArray): IntArray {
    val max = 0
    val res = ArrayList<Int>()
    var i = heights.size-1
    while (i >= 0) {
      if (max < heights[i]) {
        max = heights[i]
        res.add(max)
      }
      i--
    }
    res.reversed().toIntArray()
  }
   */
  fun findBuildings(heights: IntArray): IntArray {
    var max = 0
    val res = ArrayList<Int>()
    var i = heights.size-1
    while (i >= 0) {
      if (max < heights[i]) {
        max = heights[i]
        res.add(i)
      }
      i--
    }
    return res.reversed().toIntArray()
  }
}