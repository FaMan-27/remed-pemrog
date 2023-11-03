package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
        val aritmatika = 2..11 step 2
        var hasil = 0
        aritmatika.forEachIndexed { index, number1 ->
            println("U${index + 1} adalah $number1")
        }

}