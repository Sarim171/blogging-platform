package com.blogging_platform

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class BloggingPlatformApplication

fun main(args: Array<String>) {
	runApplication<BloggingPlatformApplication>(*args)
}
