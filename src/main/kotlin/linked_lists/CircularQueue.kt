package linked_lists

class MyCircularQueue(k: Int) {

  class Node(var `val`: Int, var next: Node ?= null, var prev: Node ?= null)

  var capacity = 0
  var head: Node ?= null
  var tail: Node ?= null
  var sz = 0

  init {
    capacity = k
  }

  fun enQueue(value: Int): Boolean {
    if (sz == capacity) return false
    sz++
    if (head == null) {
      head = Node(value)
      tail = head
      return true
    }
    val tmp = Node(value)
    tmp.prev = tail
    tail?.next = tmp
    tail = tmp
    return true
  }

  fun deQueue(): Boolean {
    if (sz == 0) return false
    sz--
    if (head == tail) {
      head = null
      tail = null
      return true
    }
    tail = tail?.prev
    tail?.next = null
    return true
  }

  fun Front(): Int {
    return head?.`val` ?: -1
  }

  fun Rear(): Int {
    return tail?.`val` ?: -1
  }

  fun isEmpty(): Boolean {
    return sz == 0
  }

  fun isFull(): Boolean {
    return sz == capacity
  }

}

fun main() {
  val CQ = MyCircularQueue(8)
  println(CQ.enQueue(3))
  println(CQ.enQueue(9))
  println(CQ.enQueue(5))
  println(CQ.enQueue(0))
  println(CQ.deQueue())
  println(CQ.deQueue())
  println(CQ.isEmpty())
  println(CQ.isEmpty())
  println(CQ.Rear())
  println(CQ.Rear())
  println(CQ.deQueue())
}