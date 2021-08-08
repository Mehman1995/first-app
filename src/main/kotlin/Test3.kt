fun main() {


    val itemCount = 11
    val itemCont = itemCount * 110
    val itemPrice = 100
    val discount = 100
    val discountStart = 10000
    val discont = 100 * 5


    var totalPrice = itemPrice * itemCount
    var totalPric = itemPrice * itemCont

    if (totalPrice >= discountStart) {
        totalPrice -= discount
        println("сумма покупки 11 вещей + скидка 100 руб = $totalPrice руб")
    } else {
        println("если сумма покупки свыше 10_001 руб то применяется скидка 5%")
        println()
        if (totalPric >= 10_000) {
            totalPric /= discont
            println("Ваша сумма со скидкой 5% состовляет = $totalPric руб")
            println()
            println("А если будете постоянным пользователем нашего магазина то приобретете скидку \n" +
                    "1% и тогда ваш товар будет стоить")
            totalPric /= discont / 242 * 1
            println("$totalPric руб")

        }

    }
}