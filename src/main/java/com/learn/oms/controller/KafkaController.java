package com.learn.oms.controller;

import com.learn.oms.kafka.producer.KafkaProducer;
import com.learn.oms.proto.ProtosContainer;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1.0/kafka")
public class KafkaController {

  @Autowired private KafkaProducer<ProtosContainer.SampleDto> kafkaProducer;

  @Value("${kafka.string.topic}")
  private String stringTopic;

  @Value("${kafka.protobuf.topic}")
  private String protobufTopic;

  @GetMapping("/test")
  public ResponseEntity<Boolean> getOffers() {
    int id = new Random().nextInt();
    String email = "ervrajdesai999@gmail.com";
    String name = "Vraj Desai" + id;
    ProtosContainer.SampleDto person =
        ProtosContainer.SampleDto.newBuilder().setId(id).setName(name).setEmail(email).build();
    kafkaProducer.pushToKafka(person.toString(), stringTopic);
    kafkaProducer.pushToKafka(person, protobufTopic);
    return new ResponseEntity<>(true, HttpStatus.OK);
  }
}
