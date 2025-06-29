
data class  CoffeeDetails(
    val sugarCount: Int ,
    val name : String ,
    val size: String,
    val  creamAmount :Int

){

}


fun main(){

    val  coffeeForNabeel = CoffeeDetails(0, "nabeel","xxl",0)
    makeCoffee(coffeeForNabeel)

}


fun askCoffeeDetails(){
    println("who is this coffee for?")
    val name =  readln()
    println("how many pieces of sugar do you want ?")
    val sugarCount =  readln()
    val  sugarCountInt =  sugarCount.toInt()
//  call function
   // makeCoffee(sugarCountInt, name)
}

//  define function
fun makeCoffee(cofeeDetails: CoffeeDetails ) {
    if(cofeeDetails.sugarCount ==1){
        println("Coffer with ${cofeeDetails.sugarCount} spoons of sugar for ${cofeeDetails.name}  and cream: ${cofeeDetails.creamAmount}")
    }else if(cofeeDetails.sugarCount ==0){
        println("Coffer with no sugar for ${cofeeDetails.name} and cream: ${cofeeDetails.creamAmount}")
    }
    else{
        println("Coffer with ${cofeeDetails.sugarCount} spoons of  for ${cofeeDetails.name} and cream: ${cofeeDetails.creamAmount}")
    }
}

//  data classes
//  data class in kotlin  are classes whose purpose is to hold data.