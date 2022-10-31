package math

import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap

class IntegerEnglishWrd {
  fun numberToWords(num: Int): String {
    if (num == 0) return "Zero"
    val wrd = HashMap<Int, String>()
    wrd[1] = "One"
    wrd[2] = "Two"
    wrd[3] = "Three"
    wrd[4] = "Four"
    wrd[5] = "Five"
    wrd[6] = "Six"
    wrd[7] = "Seven"
    wrd[8] = "Eight"
    wrd[9] = "Nine"
    wrd[10] = "Ten"
    wrd[11] = "Eleven"
    wrd[12] = "Twelve"
    wrd[13] = "Thirteen"
    wrd[14] = "Fourteen"
    wrd[15] = "Fifteen"
    wrd[16] = "Sixteen"
    wrd[17] = "Seventeen"
    wrd[18] = "Eighteen"
    wrd[19] = "Nineteen"
    wrd[20] = "Twenty"
    wrd[30] = "Thirty"
    wrd[40] = "Forty"
    wrd[50] = "Fifty"
    wrd[60] = "Sixty"
    wrd[70] = "Seventy"
    wrd[80] = "Eighty"
    wrd[90] = "Ninety"
    val nmPlace = HashMap<Int, String>()
    nmPlace[2] = "Thousand"
    nmPlace[3] = "Million"
    nmPlace[4] = "Billion"
    var nm = num
    var nmbr = LinkedList<String>()
    var t = 0
    var res = ArrayList<List<Int>>()
    while(nm > 0) {
      var lst = ArrayList<Int>()
      repeat (3) {
        var r = nm % 10
        if(nm > 0)lst.add(r)
        nm /= 10
      }
      lst.reverse()
      res.add(lst)
    }
    res.reverse()
    val number = LinkedList<String>()
    var n = res.size
    for (i in res.indices) {
      var f = 0
      if (res[i].size == 1) {
        wrd[res[i][0]]?.let{number.add(it)}
        f = res[i][0]
      }else if (res[i].size == 2) {
        if (res[i][0] == 1) {
          val d = res[i][0] * 10 + res[i][1]
          wrd[d]?.let { number.add(it) }
        } else if (res[i][0] > 1) {
          wrd[res[i][0] * 10]?.let { number.add(it) }
          wrd[res[i][1]]?.let { number.add(it) }
        }
        f = res[i][0] + res[i][1]
      }else if (res[i].size == 3) {
        if (res[i][0] >= 1) {
          wrd[res[i][0]]?.let { number.add(it) }
          number.add("Hundred")
        }
        if (res[i][1] == 1) {
          val d = res[i][1] * 10 + res[i][2]
          wrd[d]?.let { number.add(it) }
        } else {
          wrd[res[i][1] * 10]?.let { number.add(it) }
          wrd[res[i][2]] ?.let { number.add(it) }
        }
        f = res[i][0] + res[i][1] + res[i][2]
      }
      if (f > 0)nmPlace[n--]?.let { number.add(it) }
    }
    val st = StringBuilder()
    for (i in number.indices) {
      st.append(number[i])
      if(i < number.size-1)st.append(" ")
    }
    return st.toString()
  }
}

fun main() {
  val i = IntegerEnglishWrd()
  println(i.numberToWords(100000))
}