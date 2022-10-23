package arrays

class PlusOne {
  fun plusOne(digits: IntArray): IntArray {
    val n = digits.size
    val arr = IntArray(n+1)
    var sm = digits[n-1] + 1
    var carry = 0
    carry = sm / 10
    arr[n] = sm % 10
    var i = n - 2
    while (i >= 0) {
      sm = carry + digits[i]
      carry = sm / 10
      arr[i+1] = sm % 10
      i--
    }
    if ( carry > 0) {
      arr[i+1] = carry
      return arr
    }
    return arr.slice(1..arr.size-1).toIntArray()
  }
}