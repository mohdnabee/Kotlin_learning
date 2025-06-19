package kotlin_Classes.Constructors

//  Now it's even easier to specify multiple objects of one class:

class  newCars (var brand : String ,  var model: String ,  var year : Int)

fun main() {
    val c1 = newCars("Ford", "Mustang", 1969)
    val c2 = newCars("BMW",  "X5",      1999)
    val c3 = newCars("Tesla","Model S", 2020)

    println(c1.brand)
    println(c2.brand)
    println(c3.brand)

}