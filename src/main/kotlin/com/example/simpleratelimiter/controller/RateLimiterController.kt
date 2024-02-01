package com.example.simpleratelimiter.controller

import com.example.simpleratelimiter.service.RateLimiterService
import io.github.resilience4j.ratelimiter.annotation.RateLimiter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class RateLimiterController @Autowired constructor(private val rateLimiterService: RateLimiterService) {

    @PostMapping
    fun hello(): String {
        return rateLimiterService.hello()
    }

}