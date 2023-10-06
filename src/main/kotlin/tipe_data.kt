fun main() {
    //tipe data char
//    var angka = '1'
//    println("ini adalah angka ${angka++}")
//    println("angka tersebut ditambah 1 menjadi ${angka++}")
//    println("angka tersebut ditambah 1 menjadi ${angka++}")
//    println("angka tersebut ditambah 1 menjadi ${angka++}")
//    println("-------------------------------------------------------------------------")
//    println("ini adalah angka ${angka--}")
//    println("angka tersebut dikurangi 1 menjadi ${angka--}")
//    println("angka tersebut dikurangi 1 menjadi ${angka--}")
//    println("angka tersebut dikurangi 1 menjadi ${angka--}")
//    println("angka tersebut dikurangi 1 menjadi ${angka--}")



    //tipe data string
    val nama = "Yassar"

    //escaped string (\t,\n, \". \\)
    println("\\ini output dari escapedstring")
    print("nama saya $nama")
    print("\n\thuruf pertama dari nama saya adalah ${nama[0]} ")
    print("\nnama saya terdiri dari 4 huruf yaitu \"Y\", \"A\", \"S\", dan \"R\" \n")
    println("------------------------------------------------------------------------------------------------------------------")
    //Raw string
    val contohrawstring = """ 
        \ini output dari rawstring
        nama saya Yassar Muwwafaq Malyan Shabira,
        saya berasal dari prodi Sistem Informasi Universitas Jambi
        saat ini saya sedang mengikuti Studi Independen di "Infinite Learniing" program "Mobile Application Development"
    """.trimIndent()
    print(contohrawstring)


    //tipe data boolean
    println("operator boolean")
    var benar = true
    var salah = false
    println("operator && (benar dan salah = ${benar && salah})")
    println("operator || (benar atau salah = ${benar || salah})")
    println("operator && (tidak benar = ${!benar})")
    println()

    println("boolean expression")
    val angka1 = 1
    val angka2 = 2
    println("apakah 1 lebih besar dari 2 ? ${angka1 > angka2}")
    println("apakah 1 lebih kecil dari 2 ? ${angka1 < angka2}")
    println("apakah 1 sama dengan 2 ? ${angka1 == angka2}")
    println("apakah 1 tidak sama dengan 2 ? ${angka1 != angka2}")
    println()

    println("boolean function")
    println("fungsi and() (benar dan salah =  ${benar.and(salah)})")
    println("fungsi or() (benar atau salah = ${benar.or(salah)})")


    //tipe data numbers
    val umur: Int = 20
    val beratBadan: Double = 70.5
    val saldoBank: Long = 1000000000
    val suhu: Float = 25.5f
    val jumlahPesanan: Short = 10
    val kodeProduk: Byte = Byte.MAX_VALUE

    println("Umur: $umur tahun")
    println("Berat Badan: $beratBadan kg")
    println("Saldo Bank: $saldoBank IDR")
    println("Suhu: $suhu °C")
    println("Jumlah Pesanan: $jumlahPesanan")
    println("Kode Produk: $kodeProduk")


    //tipe data array
    val hewan = arrayOf("gajah","beo", "harimau", "kuda", "unta")
    var angka = intArrayOf(1,2,3,4,5)

    println("hewan sebelum diubah")
    println("1. ${hewan[2]}")
    println("2. ${hewan.get(0)}")
    println()

    println("hewan setelah diubah")
    hewan[2] = "bebek"
    hewan.set(0, "binturong")

    println("1. ${hewan[2]}")
    println("2. ${hewan[0]}")
    println()

    println("angka sebelum diubah adalah ${angka[0]}")
    angka.set(0,11)
    println("angka setelah diubah adalah ${angka[0]}")

}