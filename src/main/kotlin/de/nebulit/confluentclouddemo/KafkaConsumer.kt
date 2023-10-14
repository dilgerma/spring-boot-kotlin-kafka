package de.nebulit.confluentclouddemo

import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
@KafkaListener(groupId = "test", topics = ["test-topic"])
class KafkaConsumer {

    @KafkaHandler
    fun consume(message: String) {
        println(message)
    }
}
