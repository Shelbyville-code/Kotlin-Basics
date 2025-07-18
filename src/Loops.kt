fun main() {
    //While loop

    var count = 45
    while (count <=50){
        println("Number is $count")
        count++

        println()

     var count = 10
     while (count >=5){
         println("Number is $count")
         count--
     }
    }

println()

    //Do While loop
    var x = 1
    do{
        println("Number is $x")
        x++
    }
        while (x<=5)

println()

    //For loop
    for ( num in 30..40){
        println("Number is $num")
    }

println()

    for ( letter in 'A'..'D'){
        println("Letter is $letter")
    }

println()

    var num = 10
    while (num <=20){
        if (num == 15){
            break
        }
        println("Number is $num")
        num++
    }







}