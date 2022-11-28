package generic

class PlayersWithZeroesOneLosses {
  /*
  fun findWinners(m: Array<IntArray>): List<List<Int>> {
    val noLoss = HashSet<Int>(m.size)
    val oneLoss = HashSet<Int>(m.size)
    val multLoss = HashSet<Int>(m.size)
    for (i in m) {
      noLoss.add(i[0])
      if (i[1] in noLoss) noLoss.remove(i[1])
      if (i[1] in oneLoss) {
        oneLoss.remove(i[1])
        multLoss.add(i[1])
      }else if (i[1] !in multLoss) onLoss.add(i[1])
    }
    return arrayListOf(noLoss.sort(), oneLoss.sort())
  }
   */
  fun findWinners(m: Array<IntArray>): List<List<Int>> {
    val noLoss = HashSet<Int>(m.size)
    val oneLoss = HashSet<Int>(m.size)
    val multLoss = HashSet<Int>(m.size)
    for (i in m) {
      noLoss.add(i[0])
      if (i[1] in noLoss) noLoss.remove(i[1])
      if (i[1] in oneLoss) {
        oneLoss.remove(i[1])
        multLoss.add(i[1])
      }else if (i[1] !in multLoss) oneLoss.add(i[1])
    }
    return arrayListOf(noLoss.sorted(), oneLoss.sorted())
  }
}