package clasess

fun main (){

    //  creating an object/instance of the class dog
    var myDog = Dog("Rock" ,"Husky",4)
    println("${myDog.name } is a ${myDog.breed} add is ${myDog.age} year is old")
    println()
    println("A year has passed!")
    myDog.name =  "Brock"
    myDog.age=  6
    println("${myDog.name } is a ${myDog.breed} add is ${myDog.age} year is old")
}