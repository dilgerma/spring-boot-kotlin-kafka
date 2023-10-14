package de.nebulit.confluentclouddemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
class ConfluentCloudDemoApplication

fun main(args: Array<String>) {
	runApplication<ConfluentCloudDemoApplication>(*args)
}
