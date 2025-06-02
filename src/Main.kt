import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class User(val name: String, val age: Int)

fun main() {
    val jsonString = """
        {
            "name": "Baska",
            "age": 30
        }
    """.trimIndent()
    val user = Json.decodeFromString<User>(jsonString)
    println(user)
}