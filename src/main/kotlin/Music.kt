fun main() {

    fun calc(currentItemSum: Int, allSum: Int, isMeloman: Boolean) {
        if (isMeloman) {

            when {
                allSum <= 1000 -> {
                    println("C вас как меломану ${currentItemSum - currentItemSum * 0.01}")

                }
                allSum in 1001..10000 -> {
                    println("Вам предоставляется скидка 100 рублей. И как меломану. Bаша цена составит ${currentItemSum - 100 - currentItemSum * 0.01}")
                }
                allSum >= 10001 -> {
                    println("Вам предоставляется скидка 5%. И как меломану. Ваша цена составит ${currentItemSum - currentItemSum * 0.05 - currentItemSum * 0.01}")
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
    calc(1000, 1001, false)
}