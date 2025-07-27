package highlevel
//🧠 Explanation
//sealed class is used for a fixed set of class types.
//
//Ensures exhaustive when checks at compile-time.
//
//Very useful in state management (e.g., in Jetpack Compose, MVVM).

sealed class Result
data class Success(val data: String): Result()
data class Error(val message: String): Result()
object Loading : Result()


fun  handleResponse(result: Result){

    when(result){

        is Success -> println("Data: ${result.data}")
        is Error -> println("Error: ${result.message}")
        Loading -> println("Loading...")

    }
}



fun  main(){

    handleResponse(Success("user data loaded"))

    handleResponse(Error("Failed to  load data"))

    handleResponse(Loading)

}