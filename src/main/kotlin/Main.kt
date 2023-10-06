fun main() {
    var grade ='A'
    val StringText = "Kampus \\Merdeka \nby \"Infinite Learning\""
    val Statement = """"
        Belajar bahasa kotlin
        ---------------------
        Di Infinite Learning
        bersama Kampus Merdeka
    """.trimIndent()

    println("Grade "+ grade++)
    println("Grade "+ grade++)
    println("Grade "+ grade++)
    println("")
    println("Grade "+ grade++)
    println("Grade "+ grade--)
    println("Grade "+ grade--)


    println(Statement)
}