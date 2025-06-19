package kotlin_Classes

//  Kotlin Classes/Objects
//  Everything in Kotlin is associated with classes and objects, along with its properties and functions. For example: in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.
//
//A Class is like an object constructor, or a "blueprint" for creating objects.
//
//Create a Class
//To create a class, use the class keyword, and specify the name of the class:
//
//Example
//  Create a Car class along with some properties (brand, model and year)
 class  Car {
     var brand = ""
    var model = ""
    var year=0
 }
//A property is basically a variable that belongs to the class.
//
//Good to Know: It is considered good practice to start the name of a class with an upper case letter, for better organization.

//  Create an Object
//Now we can use the class named Car to create objects.
//
//In the example below, we create an object of Car called c1, and then we access the properties of c1 by using the dot syntax (.), just like we did to access array and string properties:
//
//Example

fun main (){
    val c1 = Car()
    c1.brand="ford"
    c1.model="mustang"
    c1.year=  1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}