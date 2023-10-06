fun main() {
    val groupmap = mapOf(
        1 to "group 1",
        2 to "group 2",
        3 to "group 3",
        4 to "group 4",
        5 to "group 5",
        6 to "group 6",
        7 to "group 3",
    )
    println(groupmap)

    val mutablegroupmap = groupmap.toMutableMap()
    println(mutablegroupmap)

    mutablegroupmap[1] = "grup satu"
    mutablegroupmap.put(8, "grup 8")
    println(mutablegroupmap)
}