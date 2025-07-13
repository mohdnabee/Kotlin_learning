package Games.QuizQuetions

fun main() {
    val questions = listOf(
        ProgrammingQuestion(
            "What will be the output of: println(5 / 2)?",
            listOf("2", "2.5", "2.0", "Error"),
            "2.5"
        ),
        ProgrammingQuestion(
            "Which of the following is a valid way to declare a constant in Kotlin?",
            listOf("val PI = 3.14", "var PI = 3.14", "const val PI = 3.14", "final val PI = 3.14"),
            "const val PI = 3.14"
        ),
        ProgrammingQuestion(
            "What will this code output?\nval a = null\nprintln(a == null)",
            listOf("true", "false", "null", "Error"),
            "true"
        ),
        ProgrammingQuestion(
            "Which expression returns the length of a string in Kotlin?",
            listOf("string.size()", "string.length()", "string.length", "string.len"),
            "string.length"
        ),
        ProgrammingQuestion(
            "What will be printed?\nval list = listOf(1,2,3)\nprintln(list[3])",
            listOf("3", "IndexOutOfBoundsException", "null", "0"),
            "IndexOutOfBoundsException"
        ),
        ProgrammingQuestion(
            "What is the result of: println(2 + 3 * 4)?",
            listOf("14", "20", "24", "10"),
            "14"
        ),
        ProgrammingQuestion(
            "Which of these is NOT a Kotlin feature?",
            listOf("Null Safety", "Smart Casting", "Checked Exceptions", "Extension Functions"),
            "Checked Exceptions"
        ),
        ProgrammingQuestion(
            "What does the Elvis operator `?:` do?",
            listOf("Checks equality", "Performs null check", "Converts types", "Combines strings"),
            "Performs null check"
        ),
        ProgrammingQuestion(
            "What will this print?\nval x = \"abc\"\nprintln(x is String)",
            listOf("true", "false", "null", "Error"),
            "true"
        ),
        ProgrammingQuestion(
            "What keyword is used for defining an interface in Kotlin?",
            listOf("interface", "class", "object", "module"),
            "interface"
        )
    ).shuffled()

    var score = 0

    for ((index, q) in questions.withIndex()) {
        val shuffledOptions = q.options.shuffled()
        val optionLabels = listOf("A", "B", "C", "D")

        println("Question ${index + 1}: ${q.text}")
        for (i in shuffledOptions.indices) {
            println("${optionLabels[i]}. ${shuffledOptions[i]}")
        }

        print("Enter your answer (A/B/C/D): ")
        val userAnswer = readln().uppercase()

        val selectedOption = optionLabels.indexOf(userAnswer).takeIf { it in shuffledOptions.indices }
        val chosenAnswer = selectedOption?.let { shuffledOptions[it] }

        if (chosenAnswer == q.correctAnswer) {
            println("✅ Correct!\n")
            score++
        } else {
            println("❌ Wrong! Correct answer: ${q.correctAnswer}\n")
        }
    }

    println("🎯 Quiz Completed! Your Score: $score / ${questions.size}")
}

data class ProgrammingQuestion(
    val text: String,
    val options: List<String>,
    val correctAnswer: String
)
