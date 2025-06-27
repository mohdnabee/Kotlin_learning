fun main(){

    println("who is this coffee for?")
    val name =  readln()
    println("how many pieces of sugar do you want ?")
    val sugarCount =  readln()
    val  sugarCountInt =  sugarCount.toInt()
//  call function
    makeCoffee(sugarCountInt, name)
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

