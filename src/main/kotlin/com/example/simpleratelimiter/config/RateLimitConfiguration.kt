package com.example.simpleratelimiter.config

import io.github.resilience4j.ratelimiter.RateLimiter
import io.github.resilience4j.ratelimiter.RateLimiterConfig
import io.github.resilience4j.ratelimiter.RateLimiterRegistry
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration
import java.time.temporal.ChronoUnit


@Configuration
class RateLimitConfiguration @Autowired constructor(private val rateLimiterRegistry: RateLimiterRegistry) {

    @Bean
    fun customRateLimiterConfig(): RateLimiter {
        val ratelimiterConfig = RateLimiterConfig.Builder()
                .limitForPeriod(1)
                .limitRefreshPeriod(Duration.of(1, ChronoUnit.SECONDS))
                .timeoutDuration(Duration.of(1000, ChronoUnit.SECONDS))
                .build()

        return rateLimiterRegistry.rateLimiter("customRateLimiterConfig", ratelimiterConfig)
    }

}