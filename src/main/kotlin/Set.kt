fun main() {
    val seta = setOf(1, 2, 4, 2 ,1 ,5)
    val setb = setOf(1, 2, 4 ,5)
    println(seta == setb)

    val list1 = setOf(1, 1, 2, 3, 5, 8, -1)
    val list2 = setOf(1, 1, 2, 2, 3, 5)
    val list3 = setOf(6, 7)

    val intersect = list1.intersect(list2) //irisan
    val union = list1.union(list3) //gabungan
    println(intersect)
    println(union)

    //mutablesetof can only add and remove items, and can't change the value
    val setitems = mutableSetOf(1, 2, 3, 5, 1, 4)
    //setitems[2]=7 //can't change immutable set
    setitems.add(6)
    setitems.remove(2)

}