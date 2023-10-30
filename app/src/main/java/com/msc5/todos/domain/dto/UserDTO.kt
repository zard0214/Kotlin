package com.msc5.todos.domain

import com.google.gson.annotations.SerializedName

data class UserDTO (

    @SerializedName("id")
    var id: Int,

    @SerializedName("username")
    var username: String,

    @SerializedName("password")
    var password: String,

    @SerializedName("email")
    var email: String,

)