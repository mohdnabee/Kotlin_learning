package classData

data class Student(

    val  name : String,
    val age : Int,
    val  grade : String

)


fun main  (){

    val student1 = Student("Ash", 10, "B")

    // using a copy

    val  student2 = student1.copy(name = "Garry")


    println("Trainer 1: $student1")
    println("Trainer 2: $student2")
}