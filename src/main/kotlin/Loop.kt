fun main() {
    //loop
    for (i in 1..100) {
        println("Day $i bersama Infinite Learning")
    }
    println()

    //for loop with index
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", " Friday", " Saturday", "Sunday")
    for ((index,value) in days.withIndex() ){
        println("value $value with index $index")
    }
    println()

    //for lop foreach
    val months = arrayOf("January", "February", "March", "April", " May", " June", "July", "August", "September", "October", "November", "December")
    months.forEach { value ->
        println("Month is $value")
    }
}