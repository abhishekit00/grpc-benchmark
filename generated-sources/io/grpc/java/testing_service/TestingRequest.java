// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestingService.proto

package io.grpc.java.testing_service;

/**
 * Protobuf type {@code testing_service.TestingRequest}
 */
public  final class TestingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:testing_service.TestingRequest)
    TestingRequestOrBuilder {
  // Use TestingRequest.newBuilder() to construct.
  private TestingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestingRequest() {
    varOne_ = "";
    varTwo_ = "";
    varThree_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TestingRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            varOne_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            varTwo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            varThree_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.java.testing_service.TestingServiceProto.internal_static_testing_service_TestingRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.java.testing_service.TestingServiceProto.internal_static_testing_service_TestingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.java.testing_service.TestingRequest.class, io.grpc.java.testing_service.TestingRequest.Builder.class);
  }

  public static final int VAR_ONE_FIELD_NUMBER = 1;
  private volatile java.lang.Object varOne_;
  /**
   * <code>string var_one = 1;</code>
   */
  public java.lang.String getVarOne() {
    java.lang.Object ref = varOne_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      varOne_ = s;
      return s;
    }
  }
  /**
   * <code>string var_one = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVarOneBytes() {
    java.lang.Object ref = varOne_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      varOne_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VAR_TWO_FIELD_NUMBER = 2;
  private volatile java.lang.Object varTwo_;
  /**
   * <code>string var_two = 2;</code>
   */
  public java.lang.String getVarTwo() {
    java.lang.Object ref = varTwo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      varTwo_ = s;
      return s;
    }
  }
  /**
   * <code>string var_two = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVarTwoBytes() {
    java.lang.Object ref = varTwo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      varTwo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VAR_THREE_FIELD_NUMBER = 3;
  private volatile java.lang.Object varThree_;
  /**
   * <code>string var_three = 3;</code>
   */
  public java.lang.String getVarThree() {
    java.lang.Object ref = varThree_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      varThree_ = s;
      return s;
    }
  }
  /**
   * <code>string var_three = 3;</code>
   */
  public com.google.protobuf.ByteString
      getVarThreeBytes() {
    java.lang.Object ref = varThree_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      varThree_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVarOneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, varOne_);
    }
    if (!getVarTwoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, varTwo_);
    }
    if (!getVarThreeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, varThree_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVarOneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, varOne_);
    }
    if (!getVarTwoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, varTwo_);
    }
    if (!getVarThreeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, varThree_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.java.testing_service.TestingRequest)) {
      return super.equals(obj);
    }
    io.grpc.java.testing_service.TestingRequest other = (io.grpc.java.testing_service.TestingRequest) obj;

    boolean result = true;
    result = result && getVarOne()
        .equals(other.getVarOne());
    result = result && getVarTwo()
        .equals(other.getVarTwo());
    result = result && getVarThree()
        .equals(other.getVarThree());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VAR_ONE_FIELD_NUMBER;
    hash = (53 * hash) + getVarOne().hashCode();
    hash = (37 * hash) + VAR_TWO_FIELD_NUMBER;
    hash = (53 * hash) + getVarTwo().hashCode();
    hash = (37 * hash) + VAR_THREE_FIELD_NUMBER;
    hash = (53 * hash) + getVarThree().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.java.testing_service.TestingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.java.testing_service.TestingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.java.testing_service.TestingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.java.testing_service.TestingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code testing_service.TestingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:testing_service.TestingRequest)
      io.grpc.java.testing_service.TestingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.java.testing_service.TestingServiceProto.internal_static_testing_service_TestingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.java.testing_service.TestingServiceProto.internal_static_testing_service_TestingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.java.testing_service.TestingRequest.class, io.grpc.java.testing_service.TestingRequest.Builder.class);
    }

    // Construct using io.grpc.java.testing_service.TestingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      varOne_ = "";

      varTwo_ = "";

      varThree_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.java.testing_service.TestingServiceProto.internal_static_testing_service_TestingRequest_descriptor;
    }

    public io.grpc.java.testing_service.TestingRequest getDefaultInstanceForType() {
      return io.grpc.java.testing_service.TestingRequest.getDefaultInstance();
    }

    public io.grpc.java.testing_service.TestingRequest build() {
      io.grpc.java.testing_service.TestingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.java.testing_service.TestingRequest buildPartial() {
      io.grpc.java.testing_service.TestingRequest result = new io.grpc.java.testing_service.TestingRequest(this);
      result.varOne_ = varOne_;
      result.varTwo_ = varTwo_;
      result.varThree_ = varThree_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.java.testing_service.TestingRequest) {
        return mergeFrom((io.grpc.java.testing_service.TestingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.java.testing_service.TestingRequest other) {
      if (other == io.grpc.java.testing_service.TestingRequest.getDefaultInstance()) return this;
      if (!other.getVarOne().isEmpty()) {
        varOne_ = other.varOne_;
        onChanged();
      }
      if (!other.getVarTwo().isEmpty()) {
        varTwo_ = other.varTwo_;
        onChanged();
      }
      if (!other.getVarThree().isEmpty()) {
        varThree_ = other.varThree_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.java.testing_service.TestingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.java.testing_service.TestingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object varOne_ = "";
    /**
     * <code>string var_one = 1;</code>
     */
    public java.lang.String getVarOne() {
      java.lang.Object ref = varOne_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        varOne_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string var_one = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVarOneBytes() {
      java.lang.Object ref = varOne_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        varOne_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string var_one = 1;</code>
     */
    public Builder setVarOne(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      varOne_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string var_one = 1;</code>
     */
    public Builder clearVarOne() {
      
      varOne_ = getDefaultInstance().getVarOne();
      onChanged();
      return this;
    }
    /**
     * <code>string var_one = 1;</code>
     */
    public Builder setVarOneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      varOne_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object varTwo_ = "";
    /**
     * <code>string var_two = 2;</code>
     */
    public java.lang.String getVarTwo() {
      java.lang.Object ref = varTwo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        varTwo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string var_two = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVarTwoBytes() {
      java.lang.Object ref = varTwo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        varTwo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string var_two = 2;</code>
     */
    public Builder setVarTwo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      varTwo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string var_two = 2;</code>
     */
    public Builder clearVarTwo() {
      
      varTwo_ = getDefaultInstance().getVarTwo();
      onChanged();
      return this;
    }
    /**
     * <code>string var_two = 2;</code>
     */
    public Builder setVarTwoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      varTwo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object varThree_ = "";
    /**
     * <code>string var_three = 3;</code>
     */
    public java.lang.String getVarThree() {
      java.lang.Object ref = varThree_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        varThree_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string var_three = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVarThreeBytes() {
      java.lang.Object ref = varThree_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        varThree_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string var_three = 3;</code>
     */
    public Builder setVarThree(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      varThree_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string var_three = 3;</code>
     */
    public Builder clearVarThree() {
      
      varThree_ = getDefaultInstance().getVarThree();
      onChanged();
      return this;
    }
    /**
     * <code>string var_three = 3;</code>
     */
    public Builder setVarThreeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      varThree_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:testing_service.TestingRequest)
  }

  // @@protoc_insertion_point(class_scope:testing_service.TestingRequest)
  private static final io.grpc.java.testing_service.TestingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.java.testing_service.TestingRequest();
  }

  public static io.grpc.java.testing_service.TestingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestingRequest>
      PARSER = new com.google.protobuf.AbstractParser<TestingRequest>() {
    public TestingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestingRequest> getParserForType() {
    return PARSER;
  }

  public io.grpc.java.testing_service.TestingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

