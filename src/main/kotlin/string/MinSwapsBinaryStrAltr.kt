package string

class MinSwapsBinaryStrAltr {
  /*
  fun create(start: Char, m: Int, n: Int): Int {
    val str = StringBuilder()
    var m1 = m
    var n1 = n
    var curr = start
    while (m1 > 0 || n1 > 0) {
      if (curr == '1') {
        str.append('0')
        n1--
        curr = '0'
      }else {
        str.append('1')
        m1--
        curr = '1'
      }
    }
    return str.toString()
  }
  fun minSwaps(s: String): Int {
    val mp = HashMap<Char, Int>()
    for (i in s) mp[i] = mp.getOrPut(i){0} + 1
    if (mp.size == 1) return -1
    val m = mp['1'] ?: 0
    val n = mp['0'] ?: 0
    if (m - 1 > n || n - 1 > m) return -1
    val o1 = create('1', m-1, n)
    val o2 = create('0', m, n-1)
    var swp = 0
    var swp2 = 0
    for (i in s.indices) if (s[i] == '1' && s[i] != o1[i])swp++
    for (i in s.indices) if (s[i] == '0' && s[i] != o2[i]) swp2++
    return swp2.coerceAtLeast(swp)
  }
   */
  fun checkAlrAlt(str: String): Int {
    var curr = str[0]
    for (i in 1 until str.length) {
      if (curr == str[i]) return -1
      curr = str[i]
    }
    return 1
  }
  fun create(start: Char, m: Int, n: Int): String {
    val str = StringBuilder()
    str.append(start)
    var m1 = m
    var n1 = n
    var curr = start
    while (m1 > 0 && n1 > 0) {
      if (curr == '1') {
        str.append('0')
        n1--
        curr = '0'
      }else {
        str.append('1')
        m1--
        curr = '1'
      }
    }
    while (n1 > 0) {
      str.append(0)
      n1--
    }
    while (m1 > 0) {
      str.append(1)
      m1 --
    }
    return str.toString()
  }
  fun minSwaps(s: String): Int {
    if (s.length == 1) return 0
    if (checkAlrAlt(s) > 0) return 0
    val mp = HashMap<Char, Int>()
    for (i in s) mp[i] = mp.getOrPut(i){0} + 1
    if (mp.size == 1) return -1
    val m = mp['1'] ?: 0
    val n = mp['0'] ?: 0
    if (m - 1 > n || n - 1 > m) return -1
    val o1 = create('1', m-1, n)
    val o2 = create('0', m, n-1)
    var swp = 0
    var swp2 = 0
    for (i in s.indices) if (s[i] == '1' && s[i] != o1[i])swp++
    for (i in s.indices) if (s[i] == '0' && s[i] != o2[i]) swp2++
    if (checkAlrAlt(o1) < 0) return swp2
    else if (checkAlrAlt(o2) < 0) return swp
    var ans = 0
    if (swp2 == 0)
      ans = swp
    else if(swp == 0)
      ans = swp2
    else ans = swp2.coerceAtMost(swp)
    return ans
  }
}

fun main () {
  val m = MinSwapsBinaryStrAltr()
  m.minSwaps("11111000000")
}