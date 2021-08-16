fun main() {

    val minCommission = 3500
    val percentCommission = 0.75f
    val amount= 500000
    var result = (amount / 100) * percentCommission

    if (result < minCommission) {
        result = minCommission.toFloat()
    }
    println(result / 100)
}