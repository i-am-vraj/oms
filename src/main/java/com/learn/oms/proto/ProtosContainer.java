// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample_dto.proto

// Protobuf Java Version: 3.25.3
package com.learn.oms.proto;

public final class ProtosContainer {
  private ProtosContainer() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface SampleDtoOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:protobuf.SampleDto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     *
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     *
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     * <code>required int32 id = 2;</code>
     *
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>required int32 id = 2;</code>
     *
     * @return The id.
     */
    int getId();

    /**
     * <code>optional string email = 3;</code>
     *
     * @return Whether the email field is set.
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     *
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     *
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString getEmailBytes();
  }
  /** Protobuf type {@code protobuf.SampleDto} */
  public static final class SampleDto extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:protobuf.SampleDto)
      SampleDtoOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SampleDto.newBuilder() to construct.
    private SampleDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SampleDto() {
      name_ = "";
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new SampleDto();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.learn.oms.proto.ProtosContainer.internal_static_protobuf_SampleDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.learn.oms.proto.ProtosContainer
          .internal_static_protobuf_SampleDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.learn.oms.proto.ProtosContainer.SampleDto.class,
              com.learn.oms.proto.ProtosContainer.SampleDto.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;

    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>required string name = 1;</code>
     *
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string name = 1;</code>
     *
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     *
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_ = 0;
    /**
     * <code>required int32 id = 2;</code>
     *
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 id = 2;</code>
     *
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int EMAIL_FIELD_NUMBER = 3;

    @SuppressWarnings("serial")
    private volatile java.lang.Object email_ = "";
    /**
     * <code>optional string email = 3;</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string email = 3;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof com.learn.oms.proto.ProtosContainer.SampleDto)) {
        return super.equals(obj);
      }
      com.learn.oms.proto.ProtosContainer.SampleDto other =
          (com.learn.oms.proto.ProtosContainer.SampleDto) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName().equals(other.getName())) return false;
      }
      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId() != other.getId()) return false;
      }
      if (hasEmail() != other.hasEmail()) return false;
      if (hasEmail()) {
        if (!getEmail().equals(other.getEmail())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasEmail()) {
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.learn.oms.proto.ProtosContainer.SampleDto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code protobuf.SampleDto} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:protobuf.SampleDto)
        com.learn.oms.proto.ProtosContainer.SampleDtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.learn.oms.proto.ProtosContainer.internal_static_protobuf_SampleDto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.learn.oms.proto.ProtosContainer
            .internal_static_protobuf_SampleDto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.learn.oms.proto.ProtosContainer.SampleDto.class,
                com.learn.oms.proto.ProtosContainer.SampleDto.Builder.class);
      }

      // Construct using com.learn.oms.proto.ProtosContainer.SampleDto.newBuilder()
      private Builder() {}

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        id_ = 0;
        email_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.learn.oms.proto.ProtosContainer.internal_static_protobuf_SampleDto_descriptor;
      }

      @java.lang.Override
      public com.learn.oms.proto.ProtosContainer.SampleDto getDefaultInstanceForType() {
        return com.learn.oms.proto.ProtosContainer.SampleDto.getDefaultInstance();
      }

      @java.lang.Override
      public com.learn.oms.proto.ProtosContainer.SampleDto build() {
        com.learn.oms.proto.ProtosContainer.SampleDto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.learn.oms.proto.ProtosContainer.SampleDto buildPartial() {
        com.learn.oms.proto.ProtosContainer.SampleDto result =
            new com.learn.oms.proto.ProtosContainer.SampleDto(this);
        if (bitField0_ != 0) {
          buildPartial0(result);
        }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.learn.oms.proto.ProtosContainer.SampleDto result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.email_ = email_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.learn.oms.proto.ProtosContainer.SampleDto) {
          return mergeFrom((com.learn.oms.proto.ProtosContainer.SampleDto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.learn.oms.proto.ProtosContainer.SampleDto other) {
        if (other == com.learn.oms.proto.ProtosContainer.SampleDto.getDefaultInstance())
          return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasEmail()) {
          email_ = other.email_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10:
                {
                  name_ = input.readBytes();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 10
              case 16:
                {
                  id_ = input.readInt32();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 16
              case 26:
                {
                  email_ = input.readBytes();
                  bitField0_ |= 0x00000004;
                  break;
                } // case 26
              default:
                {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       *
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       *
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       *
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       *
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       *
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int id_;
      /**
       * <code>required int32 id = 2;</code>
       *
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       *
       * @return Whether the email field is set.
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            email_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        email_ = getDefaultInstance().getEmail();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       *
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:protobuf.SampleDto)
    }

    // @@protoc_insertion_point(class_scope:protobuf.SampleDto)
    private static final com.learn.oms.proto.ProtosContainer.SampleDto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.learn.oms.proto.ProtosContainer.SampleDto();
    }

    public static com.learn.oms.proto.ProtosContainer.SampleDto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SampleDto> PARSER =
        new com.google.protobuf.AbstractParser<SampleDto>() {
          @java.lang.Override
          public SampleDto parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
              builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
              throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
              throw e.asInvalidProtocolBufferException()
                  .setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
              throw new com.google.protobuf.InvalidProtocolBufferException(e)
                  .setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
          }
        };

    public static com.google.protobuf.Parser<SampleDto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SampleDto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.learn.oms.proto.ProtosContainer.SampleDto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_protobuf_SampleDto_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_SampleDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\020sample_dto.proto\022\010protobuf\"4\n\tSampleDt"
          + "o\022\014\n\004name\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\r\n\005email\030\003 \001"
          + "(\tB&\n\023com.learn.oms.protoB\017ProtosContain"
          + "er"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_protobuf_SampleDto_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_SampleDto_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_protobuf_SampleDto_descriptor,
            new java.lang.String[] {
              "Name", "Id", "Email",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
