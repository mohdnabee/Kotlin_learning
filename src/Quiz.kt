package code

fun main() {
    val questions = listOf(
        NewQuestion(
            "Which data type is used to store true or false values in Kotlin?",
            listOf("Int", "Boolean", "String", "Float"),
            "Boolean"
        ),
        NewQuestion(
            "What does JVM stand for?",
            listOf("Java Virtual Machine", "Java Variable Mode", "Joint Virtual Manager", "Java Version Manager"),
            "Java Virtual Machine"
        ),
        NewQuestion(
            "Which function is the entry point in a Kotlin program?",
            listOf("start()", "run()", "main()", "launch()"),
            "main()"
        ),
        NewQuestion(
            "Which symbol is used for single-line comments in Kotlin?",
            listOf("/*", "//", "#", "<!-- -->"),
            "//"
        ),
        NewQuestion(
            "Which keyword is used to declare a variable that cannot be reassigned?",
            listOf("val", "var", "const", "final"),
            "val"
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

data class NewQuestion(
    val text: String,
    val options: List<String>,
    val correctAnswer: String
)
