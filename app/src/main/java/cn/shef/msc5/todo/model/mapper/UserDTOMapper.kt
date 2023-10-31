package cn.shef.msc5.todo.model.mapper

import com.msc5.todos.domain.UserDTO
import cn.shef.msc5.todo.model.User


class UserDTOMapper : DomainMapper<UserDTO, User> {

    override fun map2Model(model: UserDTO): User {
        return User(
            id = model.id,
            username = model.username,
            password = model.password,
            email = model.email,
        )
    }

    override fun map2DTOModel(domainModel: User): UserDTO {
        return UserDTO(
            id = domainModel.id,
            username = domainModel.username,
            password = domainModel.password,
            email = domainModel.email,
        )
    }

    fun map2ModelList(initial: List<UserDTO>): List<User> {
        return initial.map { map2Model(it) }
    }

    fun map2DTOModel(initial: List<User>): List<UserDTO> {
        return initial.map { map2DTOModel(it) }
    }

}
