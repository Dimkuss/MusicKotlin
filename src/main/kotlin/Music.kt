fun main() {

    fun calc(currentItemSum: Double, allSum: Int, isMeloman: Boolean) {
        if (isMeloman) {

            when {
                allSum <= 1000 -> {
                    println("C вас как меломану ${currentItemSum - currentItemSum * 0.01}")

                }
                allSum in 1001..10000 -> {
                    println("Вам предоставляется скидка 100 рублей. И как меломану. Bаша цена составит ${currentItemSum - 100 - currentItemSum * 0.01}")
                }
                allSum >= 10001 -> {
                    val itemSum = currentItemSum * 0.05
                    val itemSum2 = currentItemSum - itemSum
                    val coast = itemSum2 - itemSum2*0.01
                    println("Вам предоставляется скидка 5%. И как меломану. Ваша цена составит ${coast}")
                }

            }


        } else {
            when {
                allSum <= 1000 -> {
                    println("C вас  $currentItemSum")

                }
                allSum in 1001..10000 -> {
                    println("Вам предоставляется скидка 100 рублей. Bаша цена составит ${currentItemSum - 100}")
                }
                allSum >= 10001 -> {
                    println("Вам предоставляется скидка 5%. Ваша цена составит ${currentItemSum - currentItemSum * 0.05}")
                }

            }
        }
    }
    calc(100.00, 100001, true)
}