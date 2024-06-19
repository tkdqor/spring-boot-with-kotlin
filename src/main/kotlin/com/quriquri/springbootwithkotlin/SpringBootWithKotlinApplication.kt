package com.quriquri.springbootwithkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class SpringBootWithKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootWithKotlinApplication>(*args)
}
