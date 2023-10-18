package de.nebulit.confluentclouddemo

import de.nebulit.records.Address
import ksql.orders
import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
@KafkaListener(groupId = "avro-test", topics = ["avro-topic"])
class KafkaAvroConsumer {

    @KafkaHandler
    fun consume(message: orders) {
        println(message)
    }


}
