package hello.thymleaf.basic

import org.springframework.stereotype.Component

@Component
class HelloBean {
    fun hello(data: String) = "Hello $data"
}