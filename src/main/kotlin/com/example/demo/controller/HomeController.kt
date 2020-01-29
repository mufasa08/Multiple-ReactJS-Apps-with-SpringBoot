package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(value = ["/"])
class HomeController {

    @GetMapping("/first-app")
    fun accessAppOne(): String {
        return "forward:/first-app/index.html"
    }

    @GetMapping("/second-app")
    fun accessAppTwo(
    ): String {
        return "forward:/second-app/index.html"
    }

}