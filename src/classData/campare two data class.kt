package classData

data class Employee (val  id :Int, val  name : String, val  department : String)


//  compare Two  data class object

fun  main(){

    val emp1 = Employee(101,"Nabeel", "IT")
    val emp2 = Employee(101,"Nabeel", "IT")

    println("emp1 == emp2 : ${emp1 ==  emp2}")

}

