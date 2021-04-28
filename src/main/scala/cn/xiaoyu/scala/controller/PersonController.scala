package cn.xiaoyu.scala.controller

import java.lang

import cn.xiaoyu.scala.domain.Person
import cn.xiaoyu.scala.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/person"))
class PersonController @Autowired()(personService: PersonService) {
	/**
	 * Post Json格式
	 * {"name" : "xiaoyu", "sex": "man"}
	 */
	@PostMapping(value = Array("save"))
	def save(@RequestBody person: Person): Person = {
		personService.save(person)
	}

	/**
	 * http://localhost:8080/person/selectById/65
	 */
	@GetMapping(value = Array("selectById/{id}"))
	def selectById(@PathVariable id: Integer): Person = {
		personService.selectById(id)
	}

	/**
	 * http://localhost:8080/person/selectById2?id=65
	 */
	@GetMapping(value = Array("selectById2"))
	def selectById2(@RequestParam id: Integer): Person = {
		personService.selectById(id)
	}

	/**
	 * http://localhost:8080/person/selectAll
	 */
	@GetMapping(value = Array("selectAll"))
	def selectPerson(): lang.Iterable[Person] = {
		personService.selectAll()
	}
}