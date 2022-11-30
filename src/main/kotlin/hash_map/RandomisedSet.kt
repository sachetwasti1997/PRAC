package hash_map

class RandomisedSet(var st: HashMap<Int, Int> = HashMap(), var lst: ArrayList<Int> = ArrayList()) {

  fun insert(`val`: Int): Boolean {
    if (`val` in st) return false

    lst.add(`val`)
    st[`val`] = lst.size - 1
    return true
  }

  fun remove(`val`: Int): Boolean {
    if (`val` !in st) return false

    st[`val`]?.let {
      if (it == lst.size - 1) {
        lst.removeLast()
        st.remove(`val`)
      }else {
        val tmp = lst[lst.size - 1]
        st.remove(`val`)
        lst[it] = tmp
        st[tmp] = it
        lst.removeLast()
      }
    }
    return true
  }

  fun getRandom(): Int {
    return lst.random()
  }
}