package arrays

class DistanceValue {
  fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
    var nm = 0
    for (i in arr1) {
      var flag = 0
      for (j in arr2) {
        if (Math.abs(i-j) <= d) {
          flag++
          break
        }
      }
      if (flag == 0)nm++
    }
    return nm
  }
}