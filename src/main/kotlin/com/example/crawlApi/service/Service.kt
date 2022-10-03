package com.example.crawlApi.service

import com.example.crawlApi.model.Model
import com.fasterxml.jackson.module.kotlin.jsonMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class Service {
    @Autowired
    lateinit var restTemplate: RestTemplate

    var url:String = "https://zipcloud.ibsnet.co.jp/api/search?zipcode"

    fun getSample(): Model? {
        var response = restTemplate.getForObject(url, Model::class.java,"1800033")
        return response
    }
}