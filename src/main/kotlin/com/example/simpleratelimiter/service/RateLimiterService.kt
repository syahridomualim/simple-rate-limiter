package com.example.simpleratelimiter.service

import io.github.resilience4j.ratelimiter.annotation.RateLimiter
import org.springframework.stereotype.Service
import java.time.Instant


@Service
class RateLimiterService {

    @RateLimiter(name = "customRateLimiterConfig")
    fun hello(): String {
        println("Hello! ${Instant.now()}")
        return "Hello"
    }
}