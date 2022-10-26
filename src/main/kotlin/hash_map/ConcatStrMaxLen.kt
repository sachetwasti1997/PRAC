package hash_map
typealias ls = List<String>
typealias setCh = HashSet<Char>
class ConcatStrMaxLen {

  fun overlap(charSet: setCh, s: String): Boolean {
    val prev = HashSet<Char>()
    for (c in s) {
      if (c in charSet || c in prev) return false
      prev.add(c)
    }
    return true
  }

  fun choose(charSet: setCh, arr: ls, inx: Int): Int {
    if (inx == arr.size) return charSet.size
    var res = 0
    if (overlap(charSet, arr[inx])) {
      arr[inx].forEach { charSet.add(it) }
      res = choose(charSet, arr, inx+1)
      arr[inx].forEach { charSet.remove(it) }
    }
    return res.coerceAtLeast(choose(charSet, arr, inx+1))
  }

  fun maxLength(arr: ls): Int {
    return choose(HashSet(), arr, 0)
  }
}

fun main() {
  val c = ConcatStrMaxLen()
  val p = c.maxLength(listOf("abcdefghijklm","bcdefghijklmn","cdefghijklmno","defghijklmnop","efghijklmnopq","fghijklmnopqr","ghijklmnopqrs","hijklmnopqrst","ijklmnopqrstu","jklmnopqrstuv","klmnopqrstuvw","lmnopqrstuvwx","mnopqrstuvwxy","nopqrstuvwxyz","opqrstuvwxyza","pqrstuvwxyzab"))
  println(p)
}