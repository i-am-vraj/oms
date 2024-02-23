package com.learn.oms.serdes;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import java.util.Arrays;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

public class KafkaProtobufDeserializer<T extends Message> implements Deserializer<T> {

  private final Parser<T> parser;

  public KafkaProtobufDeserializer(Parser<T> parser) {
    this.parser = parser;
  }

  @Override
  public T deserialize(String topic, byte[] data) {
    try {
      return parser.parseFrom(data);
    } catch (InvalidProtocolBufferException e) {
      throw new SerializationException(
          "error while deserializing to protobuf message" + Arrays.toString(data), e);
    }
  }
}
