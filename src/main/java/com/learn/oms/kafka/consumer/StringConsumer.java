package com.learn.oms.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StringConsumer {

  @KafkaListener(
      id = "stringConsumer",
      topics = "${kafka.string.topic}",
      containerFactory = "kafkaContainerFactory")
  public void consume(String payload) {
    log.info("received string payload: {}", payload);
  }
}
