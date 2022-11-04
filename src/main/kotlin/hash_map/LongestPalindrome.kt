package hash_map

class LongestPalindrome {
  fun longestPalindrome(words: Array<String>): Int {
    val mp = HashMap<String, Int>(words.size)
    var pr = 0
    for (i in words) {
      mp[i] = mp.getOrPut(i){0}+1
    }
    var res = 0
    for ((k, v) in mp) {
      if(v == 0) continue
      if (k[0] == k[1]) {
        if (v > 1) {
          if (v % 2 == 0) {
            pr += 2 * v
            mp[k] = 0
          }
          else {
            pr += 2 * (v-1)
            mp[k] = 1
          }
        }
      }
      else {
        val lt = mp[k.reversed()] ?: 0
        if (lt > 0) {
          res += 2 * lt.coerceAtMost(v)
          if (lt == v) {
            mp[k] = 0
            mp[k.reversed()] = 0
          } else if (lt > v) {
            mp[k] = 0
            mp[k.reversed()] = lt - v
          } else {
            mp[k] = v - lt
            mp[k.reversed()] = 0
          }
        }
      }
    }
    res *= 2
    res += pr
    for ((k, v) in mp) {
      if (k[0] == k[1] && v == 1) {
        res += 2
        break
      }
    }
    return res
  }
}

fun main() {
  val l = LongestPalindrome()
  l.longestPalindrome(arrayOf("lc","cl","gg"))
}