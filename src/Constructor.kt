class Employee(var name: String,var position: String,var salary: Double,var status: String){
    fun work(){
        println("Employee is working")
    }

}

fun main() {
    var employee1 = Employee("Martha","C.E.O",560000.00,"Married")
    println(employee1.name +" "+ employee1.position +" "+ employee1.salary +" "+ employee1.status)

    var employee2 = Employee("Job","H.R",160000.00,"Married")
    println(employee2.name +" "+ employee2.position +" "+ employee2.salary +" "+ employee2.status)

    var employee3 = Employee("Martin","Receptionist",60000.00,"Single")
    println(employee3.name +" "+ employee3.position +" "+ employee3.salary +" "+ employee3.status)
}