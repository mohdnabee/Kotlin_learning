fun main() {
    val questions = listOf(
        Question(
            "What is the capital of India?",
            listOf("A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"),
            'B'
        ),
        Question(
            "Which language is used for Android app development?",
            listOf("A. Python", "B. JavaScript", "C. Kotlin", "D. Swift"),
            'C'
        ),
        Question(
            "What is the square root of 144?",
            listOf("A. 10", "B. 12", "C. 14", "D. 16"),
            'B'
        ),
        Question(
            "Which planet is known as the Red Planet?",
            listOf("A. Earth", "B. Mars", "C. Jupiter", "D. Venus"),
            'B'
        ),
        Question(
            "Who wrote 'Romeo and Juliet'?",
            listOf("A. Dickens", "B. Milton", "C. Shakespeare", "D. Orwell"),
            'C'
        )
    )

    var score = 0

    println("🎯 Welcome to the Kotlin Quiz App!\n")

    for ((index, q) in questions.withIndex()) {
        println("Q${index + 1}: ${q.question}")
        q.options.forEach { println(it) }
        print("Your answer (A/B/C/D): ")
        val userAnswer = readln().trim().uppercase().firstOrNull()

        if (userAnswer == q.answer) {
            println("✅ Correct!\n")
            score++
        } else {
            println("❌ Wrong! Correct answer: ${q.answer}\n")
        }
    }

    println("🎉 Quiz Finished! Your Score: $score / ${questions.size}")
    when (score) {
        6 -> println("🏆 Excellent!")
        in 3..4 -> println("👍 Good Job!")
        else -> println("📘 Try Again!")
    }
}

data class Question(
    val question: String,
    val options: List<String>,
    val answer: Char
)
