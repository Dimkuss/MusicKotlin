fun main(){
    var buy = 5454
    var summary = 100001
    println("Вы купили на сумму $buy, вся сумма ваших прошлых покупок составляет $summary")
    if (summary in 1001..10000){
        var buy = buy - 100
        println("Вы ранее купили на большую сумму, вам скидка 100 рублей, с вас в итоге $buy рублей")
            }
    else if (summary >10001) {
        var buy = buy - buy *0.05
        println("Вы ранее купили на ОГРОМНУЮ сумму, вам скидка 5% с вас $buy рублей")
    }
}
