package com.test.kr.test.controller

import org.jsoup.Jsoup
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/message")
    fun index(@RequestParam s : String, @RequestParam url : String): String {
        val url = url
        val docs = Jsoup.connect(url).get()
        return docs.select(s).html()
    }
}