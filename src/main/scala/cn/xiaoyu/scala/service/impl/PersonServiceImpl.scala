package cn.xiaoyu.scala.service.impl

import java.lang

import cn.xiaoyu.scala.dao.PersonRepository
import cn.xiaoyu.scala.domain.Person
import cn.xiaoyu.scala.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PersonServiceImpl @Autowired()(
	                                    val personRepository: PersonRepository
                                    ) extends PersonService {
	/**
	 * 保存
	 *
	 * @param person 保存对象
	 * @return Person
	 */
	@Transactional
	override def save(person: Person): Person = {
		personRepository.save(person)
	}

	/**
	 * 根据Id查询
	 *
	 * @param id 查询参数
	 * @return Person
	 */
	override def selectById(id: Integer): Person = {
		personRepository.findById(id).orElse(null)
	}

	override def selectAll(): lang.Iterable[Person] = {
		personRepository.findAll()
	}
}
