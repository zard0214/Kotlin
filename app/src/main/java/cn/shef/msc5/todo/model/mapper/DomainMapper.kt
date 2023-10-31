package cn.shef.msc5.todo.model.mapper

interface DomainMapper <T, DomainModel>{

    fun map2Model(model: T): DomainModel

    fun map2DTOModel(domainModel: DomainModel): T
}