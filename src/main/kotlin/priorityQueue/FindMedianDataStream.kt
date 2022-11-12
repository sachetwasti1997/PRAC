package priorityQueue

import java.util.PriorityQueue

class FindMedianDataStream(
  val smEle: PriorityQueue<Int> = PriorityQueue{a,b -> b-a},
  val lgEle: PriorityQueue<Int> = PriorityQueue()
) {
  fun addNum(num: Int) {

    smEle.add(num)

    if (!smEle.isEmpty() && !lgEle.isEmpty() && smEle.peek() > lgEle.peek()) {
      val t = smEle.poll()
      lgEle.add(t)
    }

    while (smEle.size > lgEle.size + 1) {
      val t = smEle.poll()
      lgEle.add(t)
    }
    while(lgEle.size > smEle.size + 1) {
      val t = lgEle.poll()
      smEle.add(t)
    }
  }

  fun findMedian(): Double {
    var res = 0.0
    if (smEle.size == lgEle.size) {
      return (smEle.peek().toDouble() + lgEle.peek().toDouble()) / 2
    }else if (smEle.size > lgEle.size) {
      return smEle.peek().toDouble()
    }else {
      return lgEle.peek().toDouble()
    }
  }
}

fun main () {
  val f = FindMedianDataStream()
  f.addNum(1)
  println(f.findMedian())
  f.addNum(2)
  println(f.findMedian())
  f.addNum(3)
  println(f.findMedian())
  f.addNum(4)
  println(f.findMedian())
}