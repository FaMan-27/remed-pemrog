package remed

fun main() {
    //print
    //  "Saya lapar sekali, minjem 100 dong buat makan hari ini" 600 kali
    // GUNAKAN RANGE
    (1..600).forEachIndexed { index, i ->
        println("${index+1}. Saya lapar sekali, minjem 100 dong buat makan hari ini")
    }
}