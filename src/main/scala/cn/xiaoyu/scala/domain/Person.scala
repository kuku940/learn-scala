package cn.xiaoyu.scala.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

@Entity
@Table
class Person {
	@Id
	@GeneratedValue
	@BeanProperty
	var id: Integer = _

	@BeanProperty
	var name: String = _

	@BeanProperty
	var sex: String = _
}