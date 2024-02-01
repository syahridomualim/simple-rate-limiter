package com.example.simpleratelimiter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleRateLimiterApplication

fun main(args: Array<String>) {
    runApplication<SimpleRateLimiterApplication>(*args)
}
