package org.b4cklog.mobile.models

data class User(
    val id: Int,
    val username: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val age: String,
    val isAdmin: Boolean
)

data class UserProfileResponse(
    val user: User,
    val games: Map<String, List<Game>>
)