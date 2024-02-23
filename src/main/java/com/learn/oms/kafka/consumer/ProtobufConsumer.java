package com.learn.oms.kafka.consumer;

import com.google.protobuf.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProtobufConsumer {

  @KafkaListener(
      id = "protobufConsumer",
      topics = "${kafka.protobuf.topic}",
      containerFactory = "kafkaContainerFactoryForProtobuf")
  public <T extends Message> void consume(T payload) {
    log.info("received proto payload: {}", payload);
  }
}
