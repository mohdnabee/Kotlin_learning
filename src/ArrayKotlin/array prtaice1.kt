package ArrayKotlin

fun  main  (){

    val  list =  arrayOf("Black Pen", "Scale", "Pencil", "Eraser", "Blue Pen")
    println("Number of item  List : ${list.size}")

    for (item  in  list){

        println("item number ${list.indexOf(item)} $item ")
    }


}