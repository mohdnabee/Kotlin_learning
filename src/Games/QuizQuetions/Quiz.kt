package code

fun main() {
    val questions = listOf(
        Question(
            "What is the capital of India?",
            listOf("A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"),
            "B"
        ),
        Question(
            "Which planet is known as the Red Planet?",
            listOf("A. Earth", "B. Venus", "C. Mars", "D. Jupiter"),
            "C"
        ),
        Question(
            "Who is the author of 'Harry Potter'?",
            listOf("A. J.K. Rowling", "B. Mark Twain", "C. Jane Austen", "D. Charles Dickens"),
            "A"
        ),
        Question(
            "What is the square root of 144?",
            listOf("A. 10", "B. 11", "C. 12", "D. 13"),
            "C"
        ),
        Question(
            "Which language is used for Android app development?",
            listOf("A. Python", "B. Kotlin", "C. Swift", "D. JavaScript"),
            "B"
        ),
        Question(
            "what is the value of 2*4*5+10 ",
            listOf("A. 10", "B. 60","C. 30", "D. 50"),
            "D"
        )
    )

    var score = 0

    for ((index, q) in questions.withIndex()) {
        println("Question ${index + 1}: ${q.text}")
        q.options.forEach { println(it) }

        print("Enter your answer (A/B/C/D): ")
        val userAnswer = readln().uppercase()

        if (userAnswer == q.correctAnswer) {
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
