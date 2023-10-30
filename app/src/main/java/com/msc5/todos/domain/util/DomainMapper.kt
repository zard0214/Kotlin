package com.msc5.todos.domain.util

interface DomainMapper <T, DomainModel>{

    fun map2Model(model: T): DomainModel

    fun map2DTOModel(domainModel: DomainModel): T
}