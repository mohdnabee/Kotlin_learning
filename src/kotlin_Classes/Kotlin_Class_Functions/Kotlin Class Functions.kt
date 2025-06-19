package kotlin_Classes.Kotlin_Class_Functions

//  Kotlin Class Functions
//You can also use functions inside a class, to perfom certain actions:
//
//Example
//Create a drive() function inside the Car class and call it:

class bikes (var brand: String ,  var  model : String, var year : Int){


    //  class function

    fun drive (){
        println("Wroom!")
    }
}

fun main (){
     var  b1 = bikes("kawashaki" , "H2R",2014)
    // print property values

    println(b1.brand + " " + b1.model +" " +b1.year)

    //  call function
    b1.drive()
}

//  Tip: When a function is declared inside a class, it is known as a class function, or member function.
//
//Note: When an object of the class is created, it has access to all of the class functions.