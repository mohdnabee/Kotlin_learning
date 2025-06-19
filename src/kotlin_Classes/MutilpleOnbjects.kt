package kotlin_Classes

//  Multiple Objects
//You can create multiple objects of one class:
//
//Example

class  Cars {
    var brand = ""
    var model = ""
    var year= 0

}


fun main (){

    val  v1 = Cars()
    v1.brand = "Ford "
    v1.model ="mustang "
    v1.year = 1969

    val v2=  Cars()
    v2.brand = "BMW"
    v2.model = "X5"
    v2.year = 1999


    println(v1.brand)
    println(v2.brand)
}