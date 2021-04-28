package cn.xiaoyu.scala.dao

import cn.xiaoyu.scala.domain.Person
import org.springframework.data.repository.CrudRepository

trait PersonRepository extends CrudRepository[Person,Integer]{

}