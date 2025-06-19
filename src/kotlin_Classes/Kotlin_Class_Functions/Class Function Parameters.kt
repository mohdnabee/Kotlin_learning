package kotlin_Classes.Kotlin_Class_Functions

import java.time.Year

// Class Function Parameters
//Just like with regular functions, you can pass parameters to a class function:
//
//Example
//Create two functions: drive() and speed(), and pass parameters to the speed() function:\


class  car (var brand :String ,  var model :  String , var year: Int) {

    //  class function
    fun drive(){
        println("Wroom!")
    }

    //  class function with parameters :
    fun  speed (maxSpeed : Int){
        println("max Speed is : "+ maxSpeed )
    }
}


fun main () {
    var c1 = car("Ford", "Mustang", 1969)

    // Print property values
    println(c1.brand + " " + c1.model + " " + c1.year)

    // Call the functions
    c1.drive()
    c1.speed(200)
}