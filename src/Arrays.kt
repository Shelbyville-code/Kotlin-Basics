fun main() {
    var language = arrayOf("Kotlin","JavaScript","Java")
    println(language[1])

    //Reassigning an element
    language[1]="Python"
    println(language[1])

    //looping through an array
    for (lang in language){
        println(lang)
    }

    //Size of an array
    println(language.size)
}