package com.learn.oms.serdes;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.learn.oms.proto.ProtosContainer;
import java.util.Arrays;
import java.util.Map;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

@NoArgsConstructor(force = true)
public class KafkaSampleDTODeserializer implements Deserializer<ProtosContainer.SampleDto> {

  private Parser<ProtosContainer.SampleDto> parser;

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    Deserializer.super.configure(configs, isKey);
    parser = ProtosContainer.SampleDto.PARSER;
  }

  @Override
  public ProtosContainer.SampleDto deserialize(String topic, byte[] data) {
    try {
      return parser.parseFrom(data);
    } catch (InvalidProtocolBufferException e) {
      throw new SerializationException(
          "error while deserializing to proto message" + Arrays.toString(data), e);
    }
  }
}
