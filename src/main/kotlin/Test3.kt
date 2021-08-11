fun main() {

    val sum = 11_000
    val isMeloman = true
    val user = "Вася"
    val discount = 5
    val discountForMeloman = 1
    val standartDiscount = 100
    var purchase = if (sum <= 1000) {
        sum
    } else if (sum >= 1001 && sum <= 10_000) {
        sum - standartDiscount
    } else {
        sum - (sum * discount / 100)
    }

    if (isMeloman) {
        purchase -= (purchase * discountForMeloman / 100)
    }
    println("$user закупился на $purchase")
}