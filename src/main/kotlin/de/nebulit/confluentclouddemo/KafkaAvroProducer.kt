package de.nebulit.confluentclouddemo

import de.nebulit.records.Address
import ksql.orders
import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

@Component
class KafkaAvroProducer(var kafkaTemplate: KafkaTemplate<String, orders>) {

    @Scheduled(fixedDelay = 1000L)
    fun produce() {
        println("Producing new order")
        kafkaTemplate.send("avro-topic", orders().apply {
            this.itemid = UUID.randomUUID().toString()
            this.orderid = 5
            this.ordertime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
            this.address = ksql.address().apply {
                this.city = "München"
                this.zipcode = 80805
                this.state = "none"
            }
        })
    }


}
