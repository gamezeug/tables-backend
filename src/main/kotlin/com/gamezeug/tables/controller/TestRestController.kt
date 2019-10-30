package com.gamezeug.tables.controller

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestRestController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @GetMapping
    fun login(): String {
        return "OK"
    }

}