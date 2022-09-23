package arrays

class reverse_words_III {

  fun reverseWords(s: String): String {
    val str = s.split(" ").toMutableList()
    print(str)
    str[0] =
    return str.joinToString(" ")
  }

}

fun main() {
  val r = reverse_words_III()
  r.reverseWords("Let's take LeetCode contest")
}