fun main() {

    val sum = 77000.0
    val comission = 0.75
    val minimalComission = 35
    val remmitance = if (sum < 75_000) {
        sum
    } else {
        sum - (sum * comission / 100) - minimalComission
    }
    println("Перевод с учетом комиссии: $remmitance руб.")
}
