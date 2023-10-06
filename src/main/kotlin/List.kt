fun main(){
    val listnumber = listOf("one","two", "three")
    println(listnumber)

    val mutablelist = mutableListOf(false, "one", 2, 3.5)
    println(mutablelist)
    mutablelist.remove(false)
    mutablelist.set(0,1)
    mutablelist[2] = 3
    mutablelist.add(3, 4)
    println(mutablelist)
}