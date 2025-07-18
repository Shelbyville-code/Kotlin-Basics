

fun main() {
    //Standard library functions
    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(67.9)
    println(number)

    school()
    divide()
    student(name = "Joe", age = 56, gender = "Male")

}


//User defined functions

fun school (){
    println("eMobilis")
}

fun divide (){
    var num1 = 56
    var num2 = 7
    println(num1/num2)
}


//Parameter and argument
fun student(name:String, age :Int, gender:String){
    println("$name $age $gender")
}




