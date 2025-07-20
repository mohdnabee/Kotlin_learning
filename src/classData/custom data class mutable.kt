package classData

data class StudentsMute(val  name : String,  val marks: Int)

fun  main (){
    val  students = mutableListOf(
        StudentsMute("Aman",90),
        StudentsMute("Raj",50),
        StudentsMute("Tiger",75)
    )

    val  topStudent =  students.filter { it .marks>80 }
    println(topStudent)
}