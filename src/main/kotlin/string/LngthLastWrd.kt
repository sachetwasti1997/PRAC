package string

class LngthLastWrd {
  fun lengthOfLastWord(s: String): Int {
    var arr = s.split(" ")
    val wrd = ""
    var inx = arr.size-1
    while(inx >= 0) {
      if (arr[inx].isEmpty()) inx --
      else return arr[inx].length
    }
    return wrd.length
  }
}