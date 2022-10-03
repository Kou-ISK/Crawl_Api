package com.example.crawlApi

import com.example.crawlApi.controller.Controller
import com.example.crawlApi.service.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrawlApiApplication

fun main(args: Array<String>) {
	runApplication<CrawlApiApplication>(*args)
	lateinit var controller:Controller
	controller.doThis()
}
