package cn.xiaoyu.scala.service

import java.lang

import cn.xiaoyu.scala.domain.Person

trait PersonService {
	def save(person: Person): Person

	def selectById(id: Integer): Person

	def selectAll(): lang.Iterable[Person]
}
