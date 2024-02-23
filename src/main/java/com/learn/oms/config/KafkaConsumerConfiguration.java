package com.learn.oms.config;

import com.learn.oms.serdes.KafkaProtobufDeserializer;
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
  public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaContainerFactory() {
    ConcurrentKafkaListenerContainerFactory<String, Object> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactory());
    return factory;
  }

  private ConsumerFactory<String, Object> consumerFactory() {
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
  public ConcurrentKafkaListenerContainerFactory<String, Object>
      kafkaContainerFactoryForProtobuf() {
    ConcurrentKafkaListenerContainerFactory<String, Object> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactoryForProtobuf());
    return factory;
  }

  private ConsumerFactory<String, Object> consumerFactoryForProtobuf() {
    return new DefaultKafkaConsumerFactory<>(consumerConfigsForProtobuf());
  }

  private Map<String, Object> consumerConfigsForProtobuf() {
    Map<String, Object> consumerConfig = new HashMap<>();
    consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServerAddress);
    consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    consumerConfig.put(
        ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaProtobufDeserializer.class);
    return consumerConfig;
  }
}
