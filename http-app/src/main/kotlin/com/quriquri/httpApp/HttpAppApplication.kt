package com.quriquri.httpApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpAppApplication

fun main(args: Array<String>) {
    runApplication<HttpAppApplication>(*args)
}
