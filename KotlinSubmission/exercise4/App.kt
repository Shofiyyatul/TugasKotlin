package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */


    val numberString = "123abc"

    try {
        val number = numberString.toInt()
        println("Angka: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: Format yang dapat dimasukkan hanya angka")
    }
}



