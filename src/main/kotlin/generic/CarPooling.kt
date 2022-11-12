package generic

class CarPooling {
  /*
  fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
    var in_car = 0
    var stopsCap = IntArray(1001){0}
    for (i in trips) {
      stopsCap[i[1]] += i[0]
      stopsCap[i[2]] -= i[1]
    }
    for (i in stopsCap.indices) {
      in_car += stopsCap[i]
      if (in_car > capacity) return false
    }
    return true
  }
   */
  fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
    var in_car = 0
    val stopsCap = IntArray(1001){0}
    for (i in trips) {
      stopsCap[i[1]] += i[0]
      stopsCap[i[2]] -= i[1]
    }
    for (i in stopsCap.indices) {
      in_car += stopsCap[i]
      if (in_car > capacity) return false
    }
    return true
  }
}