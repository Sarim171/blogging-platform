package com.blogging_platform

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BloggingPlatformApplication

fun main(args: Array<String>) {
	runApplication<BloggingPlatformApplication>(*args)
}
