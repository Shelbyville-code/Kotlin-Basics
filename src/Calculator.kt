import java.util.Scanner

fun main() {
    val calc = Scanner(System.`in`)

    println("Enter first number:")
    val num1 = calc.nextInt()

    print("Enter operator (+, -, *, /): ")
    val operator = readLine()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operator"
    }

    println("Result: $result")


}
