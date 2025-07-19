package classData

// 📘 1. What is a data class in Kotlin?
// ➤ A data class is a special class that is used to hold data.
//    Kotlin automatically generates useful functions like equals(), hashCode(), toString(), and copy().

data class StudentData(val name: String, val rollNumber: Int, val marks: Double)

fun main() {

    // 📘 2. Create a list of Student objects
    val students = listOf(
        StudentData("Amit", 101, 88.5),
        StudentData("Nina", 102, 67.0),
        StudentData("Rahul", 103, 92.0),
        StudentData("Sara", 104, 74.0)
    )

    // 📘 3. Print all students with marks above 75
    println("🎯 Students with marks above 75:")
    for (student in students) {
        if (student.marks > 75) {
            println("${student.name} - ${student.marks}")
        }
    }


    // 📘 4. Compare two data class objects using ==
    val s1 = StudentData("Amit", 101, 88.5)
    val s2 = StudentData("Amit", 101, 88.5)



    println("\n🔍 Comparing two student objects:")
    println("s1 == s2: ${s1 == s2}")  // true, because data class compares values, not references


    // 📘 5. Use of copy() function with a Book data class
    data class Book(val title: String, val author: String, val price: Double)


    val originalBook = Book("Kotlin Mastery", "John Doe", 499.0)
    val discountedBook = originalBook.copy(price = 349.0)



    println("\n📚 Original Book: $originalBook")
    println("💸 Discounted Book: $discountedBook")
}
