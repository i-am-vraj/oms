package com.learn.oms.config;

import com.google.protobuf.Message;
import com.learn.oms.serdes.KafkaProtobufSerializer;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Slf4j
@Configuration
public class KafkaProducerConfiguration {

  @Value("${spring.kafka.bootstrap.servers}")
  private String bootstrapServers;

  @Bean
  public KafkaTemplate<String, String> kafkaTemplate() {
    return new KafkaTemplate<>(producerFactory());
  }

  public ProducerFactory<String, String> producerFactory() {
    return new DefaultKafkaProducerFactory<>(producerConfigs());
  }

  public Map<String, Object> producerConfigs() {
    Map<String, Object> props = new HashMap<>();
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.RETRIES_CONFIG, 3);
    return props;
  }

  @Bean
  public <T extends Message> KafkaTemplate<String, T> kafkaTemplateForProtobuf() {
    return new KafkaTemplate<>(producerFactoryForProtobuf());
  }

  public <T extends Message> ProducerFactory<String, T> producerFactoryForProtobuf() {
    return new DefaultKafkaProducerFactory<>(producerConfigsForProtobuf());
  }

  public Map<String, Object> producerConfigsForProtobuf() {
    Map<String, Object> producerConfig = new HashMap<>();
    producerConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    producerConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    producerConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);
    producerConfig.put(ProducerConfig.RETRIES_CONFIG, 3);
    return producerConfig;
  }
}
