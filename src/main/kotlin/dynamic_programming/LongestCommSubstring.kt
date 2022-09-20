package dynamic_programming

import java.util.*

class LongestCommSubstring {
  fun longestValidParentheses(s: String): Int {
    val char_stk = Stack<Char>()
    val indx_stk = Stack<Int>()
    indx_stk.add(-1)
    var res = 0
    for (i in s.indices) {
      if (s[i] == '(') {
        char_stk.add('(')
        indx_stk.add(i)
      }else if (!char_stk.isEmpty() && char_stk.peek() == '(') {
        char_stk.pop()
        indx_stk.pop()
        res = res.coerceAtLeast(i - indx_stk.peek())
      }else {
        indx_stk.add(i)
      }
    }
    return res
  }
}