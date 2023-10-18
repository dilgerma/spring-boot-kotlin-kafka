package de.nebulit.confluentclouddemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class ConfluentCloudDemoApplication

fun main(args: Array<String>) {
	runApplication<ConfluentCloudDemoApplication>(*args)
}
