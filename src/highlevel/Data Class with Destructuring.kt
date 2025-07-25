package highlevel

data class User(val  name : String, val  age : Int)

fun main(){

    val  user = User("Nabeel", 22)

    val  (name,  age) =  user //  destructuring
    println("Name: $name , Age: $age")

}