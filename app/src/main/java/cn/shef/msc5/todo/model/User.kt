package cn.shef.msc5.todo.model

/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 10:48
 */
data class User (

    /**
     * user pk
     */
    val id: Int,

    /**
     * user name
     */
    val username: String,

    /**
     * user password
     */
    val password: String,

    /**
     * user email
     */
    val email: String,
)