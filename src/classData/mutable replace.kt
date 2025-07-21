package classData

fun  main (){

    val  colors =  mutableListOf("Red","Green","Blue")
    colors[1] =  "Yellow"

    println(colors)

    colors.add(1,"Purple")
    colors.add("Red")
    println(colors)


}