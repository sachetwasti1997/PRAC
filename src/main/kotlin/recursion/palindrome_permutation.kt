package recursion

class palindrome_permutation_11 {
  fun generatePalindromes(s: String): List<String> {
    val mp = HashMap<Char, Int>().apply{
      for (i in s) this[i] = this.getOrPut(i){0}+1
    }
    var cnt = 0
    var ch = ' '
    for (i in mp) {
      if (i.value % 2 != 0){
        ch = i.key
        cnt ++
      }
    }
    if (cnt > 1) return emptyList()
    var m = 0
    var tmp = CharArray(s.length){' '}
    if(cnt == 1) {
      tmp[s.length/2] = ch
      mp[ch]?.let{
        if(it - 1 == 0) mp.remove(ch)
        else mp[ch]?.let{k -> mp[ch] = it - 1 }
      }
    }
    m = (s.length/2) - 1
    var res = ArrayList<String>()
    fun create(i: Int, j: Int) {
      if (i >= j) {
        val str = tmp.joinToString("")
        if (str == s) return
        res.add(str)
        return
      }
      for (k in mp) {
        if (k.value >= 2) {
          tmp[i] = k.key
          tmp[j] = k.key
          mp[k.key] = k.value - 2
          create(i+1, j-1)
          mp[k.key] = k.value + 2
          tmp[i] = ' '
          tmp[j] = ' '
        }
      }
    }
    create(0, s.length-1)
    return res
  }
}

fun main() {
  val pp = palindrome_permutation_11()
  pp.generatePalindromes("abb")
}