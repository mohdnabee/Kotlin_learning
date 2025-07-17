package ArrayKotlin

fun  main  (){

    val  list =  arrayOf("Black Pen", "Scale", "Pencil", "Eraser", "Blue Pen")
    println("Number of item  List : ${list.size}")

    for (item  in  list){

        println("item number ${list.indexOf(item)} $item ")
    }


}



//  list.indexOf(item)  its show the index value like 0,1,2,34,  etc at  depend your array  size