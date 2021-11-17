package hello.thymleaf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThymleafBasicApplication

fun main(args: Array<String>) {
	runApplication<ThymleafBasicApplication>(*args)
}
