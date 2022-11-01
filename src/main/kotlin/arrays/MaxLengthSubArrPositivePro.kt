package arrays

class MaxLengthSubArrPositivePro {
  /*
  fun getMaxLen(nums: IntArray): Int {
    var nmFrm1stNgve = 0
    var nmFrmBegn = 0
    var max = 0
    var isEvenNg = true
    for (i in nums) {
      nmFrmBeg++
      if (i > 0) nmFrm1stNgve = if (nmFrm1stNgve == 0) 0 else nmFrm1stNgve+1
      else if (i < 0) {
        ++nFrm1stNg
        isEvenNg = !isEvnNg
      }else {
        nmFrm1stNgve = 0
        nmFrmBegn = 0
        isEvenNg = true
      }
      max = max.coerceAtLeast(if(isEvenNg)nmFrmBegn else nmFrm1stNg-1)
    }
    return max
  }
   */
  fun getMaxLen(nums: IntArray): Int {
    return 1
  }
}