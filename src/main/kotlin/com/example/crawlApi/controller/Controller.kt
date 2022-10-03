package com.example.crawlApi.controller

import com.example.crawlApi.service.Service
import org.springframework.stereotype.Controller

@Controller
class Controller {
    lateinit var service:Service
    fun doThis(){
        println(service.getSample())

    }
}