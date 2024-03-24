package com.learn.oms.benchmark;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectReader;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.learn.oms.kafka.consumer.StringConsumer;
import com.learn.oms.proto.ProtosContainer;
import com.learn.oms.proto.ProtosLargeContainer;
import com.learn.oms.proto.SampleLargePOJO;
import com.learn.oms.proto.SamplePOJO;
import com.learn.oms.utils.Utils;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class SerdesBenchmark {

  private final Parser<ProtosContainer.SampleDto> protoParser = ProtosContainer.SampleDto.PARSER;
  private final Parser<ProtosLargeContainer.SampleLargeDto> protoLargeParser =
      ProtosLargeContainer.SampleLargeDto.PARSER;
  private final ObjectReader jsonReader = Utils.mapper.readerFor(SamplePOJO.class);
  private final ObjectReader jsonLargeReader = Utils.mapper.readerFor(SampleLargePOJO.class);

  private static Person getPerson() {
    int id = new Random().nextInt();
    String email = "ervrajdesai999@gmail.com";
    String name = "Vraj Desai " + id;
    return new Person(id, email, name);
  }

  private record Person(int id, String email, String name) {}

  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder().include(StringConsumer.class.getSimpleName()).build();
    new Runner(opt).run();
  }

  public void consume(String payload) throws JsonProcessingException {
    SamplePOJO samplePOJO = jsonReader.readValue(payload);
  }

  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  @Warmup(iterations = 0)
  @Measurement(iterations = 3)
  @Fork(value = 3)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void benchmarkJson(Blackhole blackhole) throws JsonProcessingException {
    Person record = getPerson();
    SamplePOJO person =
        SamplePOJO.builder().id(record.id()).email(record.email()).name(record.name()).build();

    consume(Utils.mapper.writeValueAsString(person));

    blackhole.consume(person);
    blackhole.consume(record);
  }

  public void consume(byte[] payload) throws InvalidProtocolBufferException {
    ProtosContainer.SampleDto sampleDto = protoParser.parseFrom(payload);
  }

  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  @Warmup(iterations = 0)
  @Measurement(iterations = 3)
  @Fork(value = 3)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void benchmarkProto(Blackhole blackhole) throws InvalidProtocolBufferException {
    Person record = getPerson();
    ProtosContainer.SampleDto person =
        ProtosContainer.SampleDto.newBuilder()
            .setId(record.id())
            .setName(record.name())
            .setEmail(record.email())
            .build();

    consume(person.toByteArray());

    blackhole.consume(person);
    blackhole.consume(record);
  }

  public void consumeLarge(String payload) throws JsonProcessingException {
    SampleLargePOJO sampleLargePOJO = jsonLargeReader.readValue(payload);
  }

  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  @Warmup(iterations = 0)
  @Measurement(iterations = 3)
  @Fork(value = 3)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void benchmarkJsonLarge(Blackhole blackhole) throws JsonProcessingException {
    Person record = getPerson();
    SampleLargePOJO person = SampleLargePOJO.builder().build();

    consumeLarge(Utils.mapper.writeValueAsString(person));

    blackhole.consume(person);
    blackhole.consume(record);
  }

  public void consumeLarge(byte[] payload) throws InvalidProtocolBufferException {
    ProtosLargeContainer.SampleLargeDto sampleLargeDto = protoLargeParser.parseFrom(payload);
  }

  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  @Warmup(iterations = 0)
  @Measurement(iterations = 3)
  @Fork(value = 3)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void benchmarkProtoLarge(Blackhole blackhole) throws InvalidProtocolBufferException {
    Person record = getPerson();
    ProtosLargeContainer.SampleLargeDto person =
        ProtosLargeContainer.SampleLargeDto.newBuilder().build();

    consumeLarge(person.toByteArray());

    blackhole.consume(person);
    blackhole.consume(record);
  }
}
