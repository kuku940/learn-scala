package cn.xiaoyu.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class Application

object Application extends App {
	SpringApplication.run(classOf[Application])
}