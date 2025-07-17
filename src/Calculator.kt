import java.util.Scanner

fun main() {
    var calc = Scanner(System.`in`)

    println("Enter first number:")
    var num1 = calc.nextInt()

    print("Enter operator (+, -, *, /): ")
    var operator = readLine()

    print("Enter second number: ")
    var num2 = readLine()!!.toDouble()

    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operator"
    }

    println("Result: $result")


}
