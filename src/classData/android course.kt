package classData

data class CourseName(val part: Int, val name: String)

fun main() {

    val courseList = listOf(
        CourseName(1, "Basics & UI Foundation"),
        CourseName(2, "Intermediate Concepts"),
        CourseName(3, "APIs & Advanced UI"),
        CourseName(4, "Projects (Mini + Full Clones)")
    )

    // Example: Print the course list
    for (course in courseList) {
        println("Part ${course.part}: ${course.name}")
    }

}
