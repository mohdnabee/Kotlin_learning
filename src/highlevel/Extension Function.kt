package highlevel

fun  String.capitalizeFirstLetter(): String{
    return this.replaceFirstChar { it.uppercase()}
}

fun main (){
    val name =  "Nabeel"
    println(name.capitalizeFirstLetter())
}