package math

class HammingWeight {
  /*
  fun hammingWeight(n:Int):Int {

  }
   */
  fun hammingWeight(n:Int):Int {
    return Integer.bitCount(n)
  }
}