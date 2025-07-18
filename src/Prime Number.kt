fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number <= 1) {
        println("$number is not a prime number.")
    } else {
        var isPrime = true
        for (i in 2..number / 2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            println("$number is a prime number.")
        } else {
            println("$number is not a prime number.")
        }
    }
}
