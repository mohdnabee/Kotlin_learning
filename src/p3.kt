fun main(){
    //  variables

    var name : String =  "John" //  string
    val birthyear :  Int =  1975 //  Int

    println(name)
    println(birthyear)


    println("Kotlin is smart enough to understand that \"John\" is a String (text), and that 1975 is an Int (number) variable.")


    // val newName = "Don" ||  val shows error
    var newName =  "Don"
    newName =  "boss"
    println(newName)

    val pi = 3.14159265359
    println(pi)


    val  firstName =  "Mohd"
    val SecondName =  "Nabeel"

    val fullName =  firstName + SecondName
    println(fullName)


    val x =  4
    val y = 5
    println("X +y is : "+(x+y))
}