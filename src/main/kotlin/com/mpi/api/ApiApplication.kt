package com.mpi.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.multipart.support.StandardServletMultipartResolver

@SpringBootApplication
class ApiApplication {

    @Bean
    fun multipartResolver(): StandardServletMultipartResolver {
        return StandardServletMultipartResolver()
    }
}

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}