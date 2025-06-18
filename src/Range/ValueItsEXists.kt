package Range

//  Check if a Value Exists
//You can also use the in operator to check if a value exists in a range:

fun main(){

    val  nums =  arrayOf(2,4,5,6)
    if (2 in  nums ){
        println("its exists !")
    }else {
        println("It does Not exists .  ")
    }


    //  example 2

    val  cars =  arrayOf("ford",  "Nano",  "Range Rover" ,  "Bmw" , "audi" ,"Mustang", "Bugatti")

    if ("Bugatti" in cars ){
        println("Available")
    }
    else{
        println("Not Available")
    }
}
