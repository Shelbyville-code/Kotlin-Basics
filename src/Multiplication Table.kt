fun main() {
    println("Enter a number:")
    val number =readLine()!!.toInt()

    println("Multiplication table for $number")
    for (num in 1..10){
        println("$number x $num = ${number * num}")
    }
}