package Games.QuizQuetions

fun main() {
    val questions = listOf(
        Question(
            "What is the capital of India?",
            listOf("Mumbai", "Delhi", "Kolkata", "Chennai"),
            "Delhi"
        ),
        Question(
            "Which planet is known as the Red Planet?",
            listOf("Earth", "Venus", "Mars", "Jupiter"),
            "Mars"
        ),
        Question(
            "Who is the author of 'Harry Potter'?",
            listOf("J.K. Rowling", "Mark Twain", "Jane Austen", "Charles Dickens"),
            "J.K. Rowling"
        ),
        Question(
            "What is the square root of 144?",
            listOf("10", "11", "12", "13"),
            "12"
        ),
        Question(
            "Which language is used for Android app development?",
            listOf("Python", "Kotlin", "Swift", "JavaScript"),
            "Kotlin"
        )
    ).shuffled() // Shuffle the questions

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

data class Question(
    val text: String,
    val options: List<String>,
    val correctAnswer: String
)
