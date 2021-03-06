// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

/**
 * Protobuf type {@code ezecli.ProgressInfo}
 *
 * <pre>
 **
 * ProgressInfo is a message representing progress of the API
 * </pre>
 */
public final class ProgressInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ezecli.ProgressInfo)
    ProgressInfoOrBuilder {
  // Use ProgressInfo.newBuilder() to construct.
  private ProgressInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ProgressInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ProgressInfo defaultInstance;
  public static ProgressInfo getDefaultInstance() {
    return defaultInstance;
  }

  public ProgressInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  @SuppressWarnings("unused")
private ProgressInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            stepsCompleted_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            totalSteps_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.eze.ezecli.Ezetap.internal_static_ezecli_ProgressInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.eze.ezecli.Ezetap.internal_static_ezecli_ProgressInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.eze.ezecli.ProgressInfo.class, com.eze.ezecli.ProgressInfo.Builder.class);
  }

  public static com.google.protobuf.Parser<ProgressInfo> PARSER =
      new com.google.protobuf.AbstractParser<ProgressInfo>() {
    public ProgressInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProgressInfo(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ProgressInfo> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int STEPSCOMPLETED_FIELD_NUMBER = 1;
  private int stepsCompleted_;
  /**
   * <code>required int32 stepsCompleted = 1;</code>
   *
   * <pre>
   *&#47; Steps completed so far in the API
   * </pre>
   */
  public boolean hasStepsCompleted() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 stepsCompleted = 1;</code>
   *
   * <pre>
   *&#47; Steps completed so far in the API
   * </pre>
   */
  public int getStepsCompleted() {
    return stepsCompleted_;
  }

  public static final int TOTALSTEPS_FIELD_NUMBER = 2;
  private int totalSteps_;
  /**
   * <code>required int32 totalSteps = 2;</code>
   *
   * <pre>
   *&#47; Total no. of steps in the API
   * </pre>
   */
  public boolean hasTotalSteps() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required int32 totalSteps = 2;</code>
   *
   * <pre>
   *&#47; Total no. of steps in the API
   * </pre>
   */
  public int getTotalSteps() {
    return totalSteps_;
  }

  private void initFields() {
    stepsCompleted_ = 0;
    totalSteps_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasStepsCompleted()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTotalSteps()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, stepsCompleted_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, totalSteps_);
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, stepsCompleted_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalSteps_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.eze.ezecli.ProgressInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.ProgressInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.eze.ezecli.ProgressInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.ProgressInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.eze.ezecli.ProgressInfo prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ezecli.ProgressInfo}
   *
   * <pre>
   **
   * ProgressInfo is a message representing progress of the API
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ezecli.ProgressInfo)
      com.eze.ezecli.ProgressInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_ProgressInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_ProgressInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eze.ezecli.ProgressInfo.class, com.eze.ezecli.ProgressInfo.Builder.class);
    }

    // Construct using com.eze.ezecli.ProgressInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      stepsCompleted_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      totalSteps_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_ProgressInfo_descriptor;
    }

    public com.eze.ezecli.ProgressInfo getDefaultInstanceForType() {
      return com.eze.ezecli.ProgressInfo.getDefaultInstance();
    }

    public com.eze.ezecli.ProgressInfo build() {
      com.eze.ezecli.ProgressInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.eze.ezecli.ProgressInfo buildPartial() {
      com.eze.ezecli.ProgressInfo result = new com.eze.ezecli.ProgressInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.stepsCompleted_ = stepsCompleted_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.totalSteps_ = totalSteps_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.eze.ezecli.ProgressInfo) {
        return mergeFrom((com.eze.ezecli.ProgressInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.eze.ezecli.ProgressInfo other) {
      if (other == com.eze.ezecli.ProgressInfo.getDefaultInstance()) return this;
      if (other.hasStepsCompleted()) {
        setStepsCompleted(other.getStepsCompleted());
      }
      if (other.hasTotalSteps()) {
        setTotalSteps(other.getTotalSteps());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasStepsCompleted()) {
        
        return false;
      }
      if (!hasTotalSteps()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.eze.ezecli.ProgressInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.eze.ezecli.ProgressInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int stepsCompleted_ ;
    /**
     * <code>required int32 stepsCompleted = 1;</code>
     *
     * <pre>
     *&#47; Steps completed so far in the API
     * </pre>
     */
    public boolean hasStepsCompleted() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 stepsCompleted = 1;</code>
     *
     * <pre>
     *&#47; Steps completed so far in the API
     * </pre>
     */
    public int getStepsCompleted() {
      return stepsCompleted_;
    }
    /**
     * <code>required int32 stepsCompleted = 1;</code>
     *
     * <pre>
     *&#47; Steps completed so far in the API
     * </pre>
     */
    public Builder setStepsCompleted(int value) {
      bitField0_ |= 0x00000001;
      stepsCompleted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 stepsCompleted = 1;</code>
     *
     * <pre>
     *&#47; Steps completed so far in the API
     * </pre>
     */
    public Builder clearStepsCompleted() {
      bitField0_ = (bitField0_ & ~0x00000001);
      stepsCompleted_ = 0;
      onChanged();
      return this;
    }

    private int totalSteps_ ;
    /**
     * <code>required int32 totalSteps = 2;</code>
     *
     * <pre>
     *&#47; Total no. of steps in the API
     * </pre>
     */
    public boolean hasTotalSteps() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 totalSteps = 2;</code>
     *
     * <pre>
     *&#47; Total no. of steps in the API
     * </pre>
     */
    public int getTotalSteps() {
      return totalSteps_;
    }
    /**
     * <code>required int32 totalSteps = 2;</code>
     *
     * <pre>
     *&#47; Total no. of steps in the API
     * </pre>
     */
    public Builder setTotalSteps(int value) {
      bitField0_ |= 0x00000002;
      totalSteps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 totalSteps = 2;</code>
     *
     * <pre>
     *&#47; Total no. of steps in the API
     * </pre>
     */
    public Builder clearTotalSteps() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalSteps_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ezecli.ProgressInfo)
  }

  static {
    defaultInstance = new ProgressInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ezecli.ProgressInfo)
}

