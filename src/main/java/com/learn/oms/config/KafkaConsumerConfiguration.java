package com.learn.oms.config;

import com.google.protobuf.Message;
import com.learn.oms.serdes.KafkaSampleDTODeserializer;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@Slf4j
@Configuration
public class KafkaConsumerConfiguration {

  @Value("${spring.kafka.bootstrap.servers}")
  private String bootStrapServerAddress;

  @Bean
  public ConcurrentKafkaListenerContainerFactory<String, String> kafkaContainerFactory() {
    ConcurrentKafkaListenerContainerFactory<String, String> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactory());
    return factory;
  }

  private ConsumerFactory<String, String> consumerFactory() {
    return new DefaultKafkaConsumerFactory<>(consumerConfigs());
  }

  private Map<String, Object> consumerConfigs() {
    Map<String, Object> consumerConfig = new HashMap<>();
    consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServerAddress);
    consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    consumerConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    return consumerConfig;
  }

  @Bean
  public <T extends Message>
      ConcurrentKafkaListenerContainerFactory<String, T> kafkaContainerFactoryForProtobuf() {
    ConcurrentKafkaListenerContainerFactory<String, T> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactoryForProtobuf());
    return factory;
  }

  private <T extends Message> ConsumerFactory<String, T> consumerFactoryForProtobuf() {
    return new DefaultKafkaConsumerFactory<>(consumerConfigsForProtobuf());
  }

  private Map<String, Object> consumerConfigsForProtobuf() {
    Map<String, Object> consumerConfig = new HashMap<>();
    consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServerAddress);
    consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    consumerConfig.put(
        ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaSampleDTODeserializer.class);
    return consumerConfig;
  }
}
