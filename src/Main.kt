fun main() {

    val tugas = 800
    val uts = 20
    val uas = 0

    val rataRata = (tugas + uts + uas) / 3

    if (rataRata < 0 || rataRata > 100) {
        println("Nilai rata-rata tidak valid. Nilai harus antara 0 dan 100.")
    } else {

        val (grade, status) = when (rataRata) {
            in 75..100 -> "A" to "Lulus"
            in 65..74 -> "B" to "Lulus"
            in 55..64 -> "C" to "Lulus"
            in 45..54 -> "D" to "Tidak Lulus"
            else -> "E" to "Tidak Lulus"
        }

        // Output hasil
        println("------ HASIL NILAI ------")
        println("Rata-rata nilai: $rataRata")
        println("Grade: $grade")
        println("Status: $status")
    }
}
