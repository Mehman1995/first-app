
fun main() {
    val likes = 81
    val result = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $result")
}