package Games

fun main() {
    var playerScore = 0
    var computerScore = 0

    println("Welcome to Rock, Paper, Scissors Game!")

    while (true) {
        println("\nEnter Rock, Paper or Scissors (or type 'exit' to quit):")
        val input = readln().trim().lowercase()

        if (input == "exit") {
            println("\nFinal Score => Player: $playerScore | Computer: $computerScore")
            println("Thanks for playing!")
            break
        }

        val playerChoice = input.replaceFirstChar { it.uppercase() }
        if (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
            println("Invalid choice. Please enter Rock, Paper or Scissors.")
            continue
        }

        val computerChoice = when ((1..3).random()) {
            1 -> "Rock"
            2 -> "Paper"
            else -> "Scissors"
        }

        println("Computer chose: $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        when (winner) {
            "Tie" -> println("It's a tie!")
            "Player" -> {
                println("You won!")
                playerScore++
            }
            "Computer" -> {
                println("Computer won!")
                computerScore++
            }
        }

        println("Score => Player: $playerScore | Computer: $computerScore")
    }
}
