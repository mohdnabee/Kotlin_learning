package NULLSAFTELY

fun  main (){

    //  1.  Non-nullable variable
    val  name : String= "Nabeel"
    println("Name: $name")


    // 2. Nullable variable
    var nickName : String? =  null
    println("Nick Name: $nickName")

// 3. Safe call operator (?.)
    val  length =  nickName?.length
    println("Nick name Length : $length")

    // 4. Elvis operator (?:)
    val safeLength = nickName?.length ?: 0
    println("Safe Length: $safeLength")  // Output: 0

    // 5. Let block
    nickName = "Nabs"
    nickName?.let {
        println("NickName in let: $it, length: ${it.length}")
    }

    // 6. Not-null assertion (!!)
    val notNullLength = nickName!!.length
    println("Length using !! : $notNullLength")  // Output: 4

    // 7. Smart Cast
    if (nickName != null) {
        println("Smart cast length: ${nickName.length}")
    }

    // 8. Lateinit example
    val user = User()
    user.setUsername("Gamerz")
    println("Lateinit Username: ${user.getUsername()}")
}



// Lateinit class
class User {
    private lateinit var username: String

    fun setUsername(name: String) {
        username = name
    }

    fun getUsername(): String {
        return username
    }

}
