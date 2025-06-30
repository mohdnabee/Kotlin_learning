package Bank111
fun main(){

    val  fruitsList =  mutableListOf("Mango", "Orange", "Banana", "Pineapple", "Apple")

    fruitsList.add("Watermelon")
    fruitsList.remove("Banana")

    val fruits= fruitsList.contains("Banana")
    // if(hasRam){
    if(fruits){
        println("Has Banana in the list")
    }else {
        println("No Banana in the list")
    }
    println(fruitsList)


    fruitsList.add(3,"Coconut")
    println(fruitsList)
    fruitsList.add(4,"Guava")
    fruitsList.add("Cherry")
    fruitsList.add("Kiwi")
    fruitsList.add("Grapes")

    println(fruitsList)
}
