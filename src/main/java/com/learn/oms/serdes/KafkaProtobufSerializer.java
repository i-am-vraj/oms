package com.learn.oms.serdes;

import com.google.protobuf.Message;
import org.apache.kafka.common.serialization.Serializer;

public class KafkaProtobufSerializer<T extends Message> implements Serializer<T> {

  @Override
  public byte[] serialize(String topic, T data) {
    return data.toByteArray();
  }
}
