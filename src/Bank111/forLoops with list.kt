package Bank111

fun main (){

    // Immutable list - you cannot add items after initlization
    // val shoppingList = listOf("Processor", "Ram", "Graphics Card" ,"SSD")

    // mutable list - you can add items later and modify
    val  shoppingList =  mutableListOf("Processor", "RAM","SSD",
        "Graphics Card RTX 3060" )


    //  adding items to list
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    //  index and list
    // shoppingList.add(2,"Graphics Card RTX 4090")

    // println(shoppingList)
    shoppingList.removeAt(2)
    // println(shoppingList)
    shoppingList.removeAt(1)
    //println(shoppingList)
    shoppingList.add(2,"RAM")
//    println(shoppingList[2])
//    println(shoppingList)
//    println(shoppingList[3])

    shoppingList[3] ="Graphics Card RX 7800XT"
    // println(shoppingList)
    val hasRam=  shoppingList.contains("RAM")
    // if(hasRam){
    if(shoppingList.contains("RAM")){
        println("Has RAM in the list")
    }else {
        println("No RAM in the list")
    }

    for (item in shoppingList){
        println(item)
        if(item == "RAM"){
            shoppingList.removeLast()
            break
        }
    }



    //shoppingList.set(1,"Water Cooling") //  replace item
    println(shoppingList)

    // [0][1][2][3][4]




}
