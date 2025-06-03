package org.karabula.gratzbot

import kotlinx.serialization.json.Json
import org.karabula.gratzbot.model.User

private val json = Json {
    prettyPrint = true
}

fun main() {
    val jsonString = """
        {
            "name": "Baska",
            "age": 30
        }
    """.trimIndent()
    val user = json.decodeFromString<User>(jsonString)
    println(user)
}
