fun main() {
    val correctUsername = "admin"
    val correctPassword = "1234"

    var attempts = 3

    while (attempts > 0) {

        print("Enter Username: ")
        val username = readln()

        print("Enter Password: ")
        val password = readln()

        if (username == correctUsername && password == correctPassword) {
            println("Login successful! Welcome, $username.")
            return
        } else {
            attempts--
            println("Invalid credentials. Attempts left: $attempts\n")
        }
    }

    println("Too many failed attempts. Account locked.")
}
