package arrays

class MinNumberKeyPresses {
  /*
  fun minimumKeypresses(s: String): Int {
    val chrArr = Array<Int>(26)
    for (i in s) chrArr[i-'a']++
    chrArr.sort()
    var num = 0
    var res = 0
    for (i = 25; i >= 0; i--) {
      if (num < 9) res += chrArr[i]
      else if (num < 18) res += chrArr[i] * 2
      else if (num < 27) res += chrArr[i] * 3
    }
    return res
  }
   */
  fun minimumKeypresses(s: String): Int {
    val chrArr = Array<Int>(26){0}
    for (i in s) chrArr[i-'a']++
    chrArr.sort()
    var num = 0
    var res = 0
    for (i in 25 downTo 0) {
      if (num < 9) res += chrArr[i]
      else if (num < 18) res += chrArr[i] * 2
      else if (num < 27) res += chrArr[i] * 3
      num++
    }
    return res
  }
}