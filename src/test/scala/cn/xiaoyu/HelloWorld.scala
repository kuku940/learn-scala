package cn.xiaoyu

object HelloWorld {
	/* 这是我的第一个 Scala 程序
	 * 以下程序将输出'Hello World!'
	 */
	def main(args: Array[String]) {
		// 输出 Hello World
		println("Hello, world!")

		// 申明变量
		var name: String = "xiaoxiao"

		// 申明常量
		val FIRST_NAME: String = "zhao"

		var myVar = 10
		val myVal = 100
		var apple, orange = 100

		val pa = (20, "fofo", 100.2)
		println(pa)
		println(pa._1)


		var a: Int = 0
		val numList = List(1, 2, 3, 4, 5, 6, 7, 8)
		// for 循环
		for (a <- numList) {
			print(a + ",")
		}

		println()

		for (a <- numList
		     if a != 3; if a < 6) {
			print(a + ",")
		}
		println()

		// for 循环
		var retVal = for {a <- numList
		                  if a != 3; if a < 8
		                  } yield a
		// 输出返回值
		for (a <- retVal) {
			print(a + ",")
		}
	}
}
