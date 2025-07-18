//Parent Class/Super Class/Base Class
open class Animal{
    var hasFeathers = true
    var hasWings = true

    fun speak(){
        println("Animal is speaking")
    }
}

//Child Class
class Duck : Animal(){
    var color = "White"
    fun swim(){
        println("Duck is swimming")
    }
}

fun main() {
    var a = Animal()


    var d = Duck()
    d.speak()
    println(d.color)
}