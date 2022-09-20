package recursion

import java.lang.StringBuilder

class print_subseq {
    fun printSub(str: String) {
        val res = StringBuilder()
        fun print_s(i: Int) {
            if (i == str.length) {
                println(res)
                return
            }
            res.append(str[i])
            print_s(i+1)
            res.setLength(res.length-1)
            print_s(i+1)
        }
        print_s(0)
    }
}

fun main() {
    val p = print_subseq()
    p.printSub("sachet")
}