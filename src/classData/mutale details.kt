package classData

fun  main  (){

   val  pc =   mutableListOf("Ram", "SSD", "Graphic card", "MotherBoard", "Headphone","Keyboard","Mouse")
    var  count =0

    println("---------------Buy a Gaming PC----------------------")

    pc.add("Cabinet")
    for (list  in  pc){
        count ++
        println("$count "+list)
    }



}