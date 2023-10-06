fun main() {
    //Step Function
    val rangeInt = 1..10 step 2
    println("Step: "+ rangeInt.step)
    println(rangeInt.toList())
    println()

    //CheckRange
    var angka = 21
    if (angka in 1..20){
        println("angka $angka ada didalam daftar")
    }
    else println("angka $angka berada diluar daftar")
    println()


}