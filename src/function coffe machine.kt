fun main(){

//  call function
    makeCoffee(1, "Joy" )
    makeCoffee(2, "Rock")
    makeCoffee(3, "brock")
    makeCoffee(0, "jimmy")

}

fun makeCoffee(sugarCount :Int,  name : String ) {
    if(sugarCount ==1){
        println("Coffer with $sugarCount spoons of sugar for $name")
    }else if(sugarCount ==0){
        println("Coffer with no sugar for $name")
    }
    else{
        println("Coffer with $sugarCount spoons of  for $name")
    }

}

