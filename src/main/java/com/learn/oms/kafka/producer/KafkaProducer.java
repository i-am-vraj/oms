package com.learn.oms.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaProducerException;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaProducer<T> {

  @Autowired
  @Qualifier("kafkaTemplate")
  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  @Qualifier("kafkaTemplateForProtobuf")
  private KafkaTemplate<String, T> kafkaTemplateForProtobuf;

  public void pushToKafka(String payload, String topic) {
    log.info("sending string payload: {}, to topic: {}", payload, topic);
    ProducerRecord<String, String> record = new ProducerRecord<>(topic, payload);
    kafkaTemplate
        .send(record)
        .thenAccept(
            result ->
                log.info(
                    "successfully published string payload to kafka: {}, topic: {}",
                    payload,
                    topic))
        .exceptionally(
            ex -> {
              log.error(
                  "unable to send string payload to kafka: {}, topic: {}", payload, topic, ex);
              throw new KafkaProducerException(record, "unable to send string", ex.getCause());
            });
  }

  public void pushToKafka(T payload, String topic) {
    log.info("sending proto payload: {}, to topic: {}", payload, topic);
    ProducerRecord<String, T> record = new ProducerRecord<>(topic, payload);
    kafkaTemplateForProtobuf
        .send(record)
        .thenAccept(
            result ->
                log.info(
                    "successfully published proto payload to kafka: {}, topic: {}", payload, topic))
        .exceptionally(
            ex -> {
              log.error("unable to send proto payload to kafka: {}, topic: {}", payload, topic, ex);
              throw new KafkaProducerException(record, "unable to send proto", ex.getCause());
            });
  }
}
