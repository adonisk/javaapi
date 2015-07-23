// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

/**
 * Protobuf type {@code ezecli.TxnDetailsInput}
 *
 * <pre>
 **
 * TxnDetailsInput is a message representing the input to the transaction details API. This API is used to fetch the details of a transaction already done.
 * </pre>
 */
public final class TxnDetailsInput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ezecli.TxnDetailsInput)
    TxnDetailsInputOrBuilder {
  // Use TxnDetailsInput.newBuilder() to construct.
  private TxnDetailsInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private TxnDetailsInput(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final TxnDetailsInput defaultInstance;
  public static TxnDetailsInput getDefaultInstance() {
    return defaultInstance;
  }

  public TxnDetailsInput getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private TxnDetailsInput(
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            txnId_ = bs;
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
    return com.eze.ezecli.Ezetap.internal_static_ezecli_TxnDetailsInput_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.eze.ezecli.Ezetap.internal_static_ezecli_TxnDetailsInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.eze.ezecli.TxnDetailsInput.class, com.eze.ezecli.TxnDetailsInput.Builder.class);
  }

  public static com.google.protobuf.Parser<TxnDetailsInput> PARSER =
      new com.google.protobuf.AbstractParser<TxnDetailsInput>() {
    public TxnDetailsInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxnDetailsInput(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<TxnDetailsInput> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TXNID_FIELD_NUMBER = 1;
  private java.lang.Object txnId_;
  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction
   * </pre>
   */
  public boolean hasTxnId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction
   * </pre>
   */
  public java.lang.String getTxnId() {
    java.lang.Object ref = txnId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        txnId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTxnIdBytes() {
    java.lang.Object ref = txnId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txnId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    txnId_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTxnId()) {
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
      output.writeBytes(1, getTxnIdBytes());
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
        .computeBytesSize(1, getTxnIdBytes());
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

  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.TxnDetailsInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.eze.ezecli.TxnDetailsInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.TxnDetailsInput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.eze.ezecli.TxnDetailsInput prototype) {
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
   * Protobuf type {@code ezecli.TxnDetailsInput}
   *
   * <pre>
   **
   * TxnDetailsInput is a message representing the input to the transaction details API. This API is used to fetch the details of a transaction already done.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ezecli.TxnDetailsInput)
      com.eze.ezecli.TxnDetailsInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_TxnDetailsInput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_TxnDetailsInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eze.ezecli.TxnDetailsInput.class, com.eze.ezecli.TxnDetailsInput.Builder.class);
    }

    // Construct using com.eze.ezecli.TxnDetailsInput.newBuilder()
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
      txnId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_TxnDetailsInput_descriptor;
    }

    public com.eze.ezecli.TxnDetailsInput getDefaultInstanceForType() {
      return com.eze.ezecli.TxnDetailsInput.getDefaultInstance();
    }

    public com.eze.ezecli.TxnDetailsInput build() {
      com.eze.ezecli.TxnDetailsInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.eze.ezecli.TxnDetailsInput buildPartial() {
      com.eze.ezecli.TxnDetailsInput result = new com.eze.ezecli.TxnDetailsInput(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.txnId_ = txnId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.eze.ezecli.TxnDetailsInput) {
        return mergeFrom((com.eze.ezecli.TxnDetailsInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.eze.ezecli.TxnDetailsInput other) {
      if (other == com.eze.ezecli.TxnDetailsInput.getDefaultInstance()) return this;
      if (other.hasTxnId()) {
        bitField0_ |= 0x00000001;
        txnId_ = other.txnId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasTxnId()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.eze.ezecli.TxnDetailsInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.eze.ezecli.TxnDetailsInput) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object txnId_ = "";
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public boolean hasTxnId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public java.lang.String getTxnId() {
      java.lang.Object ref = txnId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          txnId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTxnIdBytes() {
      java.lang.Object ref = txnId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public Builder setTxnId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      txnId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public Builder clearTxnId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      txnId_ = getDefaultInstance().getTxnId();
      onChanged();
      return this;
    }
    /**
     * <code>required string txnId = 1;</code>
     *
     * <pre>
     *&#47;Id of the transaction
     * </pre>
     */
    public Builder setTxnIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      txnId_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ezecli.TxnDetailsInput)
  }

  static {
    defaultInstance = new TxnDetailsInput(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ezecli.TxnDetailsInput)
}

