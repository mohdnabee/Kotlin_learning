package kotlin_Classes.Constructors

//  Kotlin Constructor
//In the previous chapter, we created an object of a class, and specified the properties inside the class, like this:

//  example
//class Car {
//    var brand = ""
//    var model = ""
//    var year = 0
//}
//
//fun Games.main() {
//    val c1 = Car()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)
//    println(c1.model)
//    println(c1.year)
//}


//  In Kotlin, there's a faster way of doing this, by using a constructor.
//
//A constructor is like a special function, and it is defined by using two parantheses () after the class name. You can specify the properties inside of the parantheses (like passing parameters into a regular function).
//
//The constructor will initialize the properties when you create an object of a class. Just remember to specify the type of the property/variable:

class care(var brand : String , var Model : String ,  var year: Int)

fun main (){
    var c1 = care("ford", "Mustang", 1969)

    println(c1.brand)
    println(c1.year)
    println(c1.Model)

}
