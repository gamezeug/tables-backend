package com.gamezeug.tables.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
class ResourceServerConfiguration : ResourceServerConfigurerAdapter() {

    /**
     * Allow every request to be checked by the rest controller.
     */
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests().anyRequest().permitAll()
    }

}