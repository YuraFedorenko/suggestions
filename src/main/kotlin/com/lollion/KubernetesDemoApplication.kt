package com.lollion

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubernetesDemoApplication

fun main(args: Array<String>) {
    runApplication<KubernetesDemoApplication>(*args)
}
