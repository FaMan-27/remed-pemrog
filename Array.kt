package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    var namaSiswa: Array<String> = arrayOf(
        "abdul ",
        "Hanif ",
        "Ilyas ",
        "Fadhil ",
        "Ardan ",
        "FaizA ",
        "FaizK ",
        "Hadid ",
        "Irsyad ",
        "Aji ",
        "Rezvan ",
        "abdul 1 ",
        "Hanif 1 ",
        "Ilyas 1 ",
        "Fadhil 1 ",
        "Ardan 1 ",
        "FaizA 1 ",
        "FaizK 1 ",
        "Hadid 1 ",
        "Irsyad 1 ",
        "Aji 1 ",
        "Rezvan 1 ",
    )
    namaSiswa.forEachIndexed { index, namaSiswa ->
        println("${index + 1}. $namaSiswa")
    }

}