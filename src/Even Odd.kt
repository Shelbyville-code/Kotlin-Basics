import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter a number:")
    var number = read.nextInt()

    if (number ==0){
        println("$number is neutral")
    }

    else if (number %2==0){
        println("$number is an even number")
    }

    else{
        println("$number is an odd number")
    }
}