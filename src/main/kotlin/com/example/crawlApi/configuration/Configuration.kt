package com.example.crawlApi.configuration

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class Configuration {
    @Bean
    fun restTemplate(): RestTemplate {
        val restTemplateBuilder = RestTemplateBuilder()
        return restTemplateBuilder.build()
    }
}