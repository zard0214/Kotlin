package com.msc5.todos.domain.mapper

import com.msc5.todos.domain.UserDTO
import com.msc5.todos.domain.model.User
import com.msc5.todos.domain.util.DomainMapper


class UserDTOMapper : DomainMapper<UserDTO, User> {

    override fun map2Model(model: UserDTO): User {
        return User(
            id = model.pk,
            username = model.username,
            password = model.password,
            email = model.email,
        )
    }

    override fun map2DTOModel(domainModel: User): UserDTO {
        return UserDTO(
            pk = domainModel.id,
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
