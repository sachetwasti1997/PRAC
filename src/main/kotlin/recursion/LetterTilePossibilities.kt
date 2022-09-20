package recursion

class LetterTilePossibilities {
  fun numTilePossibilities(tiles: String): Int {
    val map = HashMap<Char, Int>(tiles.length)
    for (i in tiles) map[i] = map.getOrPut(i){0}+1
    var ways = 0
    fun calc() {
      for ((k,v) in map) {
        if (v > 0) {
          ways++
          map[k] = v - 1
          calc()
          map[k]?.let { map[k] = it+1 }
        }
      }
    }
    calc()
    return ways
  }
}

fun main() {
  val c = LetterTilePossibilities()
  c.numTilePossibilities("C")
}