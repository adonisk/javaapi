// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

/**
 * Protobuf type {@code ezecli.LoginInput}
 *
 * <pre>
 **
 * LoginInput message represents the login message to initiate the login API of the ezecli app. API is used to create session for the user. 
 * </pre>
 */
public final class LoginInput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ezecli.LoginInput)
    LoginInputOrBuilder {
  // Use LoginInput.newBuilder() to construct.
  private LoginInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private LoginInput(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final LoginInput defaultInstance;
  public static LoginInput getDefaultInstance() {
    return defaultInstance;
  }

  public LoginInput getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private LoginInput(
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
            int rawValue = input.readEnum();
            com.eze.ezecli.LoginInput.LoginMode value = com.eze.ezecli.LoginInput.LoginMode.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              loginMode_ = value;
            }
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            username_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            passkey_ = bs;
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
    return com.eze.ezecli.Ezetap.internal_static_ezecli_LoginInput_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.eze.ezecli.Ezetap.internal_static_ezecli_LoginInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.eze.ezecli.LoginInput.class, com.eze.ezecli.LoginInput.Builder.class);
  }

  public static com.google.protobuf.Parser<LoginInput> PARSER =
      new com.google.protobuf.AbstractParser<LoginInput>() {
    public LoginInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginInput(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<LoginInput> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf enum {@code ezecli.LoginInput.LoginMode}
   *
   * <pre>
   **
   * Loginmode is an enum representing the modes of login on the ezecli app
   * </pre>
   */
  public enum LoginMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PASSWORD = 0;</code>
     *
     * <pre>
     *&#47; Password mode; It is used to authenticate the user on Ezetap system. 
     * </pre>
     */
    PASSWORD(0, 0),
    /**
     * <code>APPKEY = 1;</code>
     *
     * <pre>
     *&#47; App_Key mode; It is used to authorize the user of the merchant on the Ezetap system.
     * </pre>
     */
    APPKEY(1, 1),
    ;

    /**
     * <code>PASSWORD = 0;</code>
     *
     * <pre>
     *&#47; Password mode; It is used to authenticate the user on Ezetap system. 
     * </pre>
     */
    public static final int PASSWORD_VALUE = 0;
    /**
     * <code>APPKEY = 1;</code>
     *
     * <pre>
     *&#47; App_Key mode; It is used to authorize the user of the merchant on the Ezetap system.
     * </pre>
     */
    public static final int APPKEY_VALUE = 1;


    public final int getNumber() { return value; }

    public static LoginMode valueOf(int value) {
      switch (value) {
        case 0: return PASSWORD;
        case 1: return APPKEY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LoginMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<LoginMode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LoginMode>() {
            public LoginMode findValueByNumber(int number) {
              return LoginMode.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.eze.ezecli.LoginInput.getDescriptor().getEnumTypes().get(0);
    }

    private static final LoginMode[] VALUES = values();

    public static LoginMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private LoginMode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ezecli.LoginInput.LoginMode)
  }

  private int bitField0_;
  public static final int LOGINMODE_FIELD_NUMBER = 1;
  private com.eze.ezecli.LoginInput.LoginMode loginMode_;
  /**
   * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
   *
   * <pre>
   *&#47; Mode of login
   * </pre>
   */
  public boolean hasLoginMode() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
   *
   * <pre>
   *&#47; Mode of login
   * </pre>
   */
  public com.eze.ezecli.LoginInput.LoginMode getLoginMode() {
    return loginMode_;
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private java.lang.Object username_;
  /**
   * <code>required string username = 2;</code>
   *
   * <pre>
   *&#47; Username of the user to login
   * </pre>
   */
  public boolean hasUsername() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string username = 2;</code>
   *
   * <pre>
   *&#47; Username of the user to login
   * </pre>
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        username_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string username = 2;</code>
   *
   * <pre>
   *&#47; Username of the user to login
   * </pre>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSKEY_FIELD_NUMBER = 3;
  private java.lang.Object passkey_;
  /**
   * <code>required string passkey = 3;</code>
   *
   * <pre>
   *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
   * </pre>
   */
  public boolean hasPasskey() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required string passkey = 3;</code>
   *
   * <pre>
   *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
   * </pre>
   */
  public java.lang.String getPasskey() {
    java.lang.Object ref = passkey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        passkey_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string passkey = 3;</code>
   *
   * <pre>
   *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
   * </pre>
   */
  public com.google.protobuf.ByteString
      getPasskeyBytes() {
    java.lang.Object ref = passkey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      passkey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    loginMode_ = com.eze.ezecli.LoginInput.LoginMode.PASSWORD;
    username_ = "";
    passkey_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasLoginMode()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasUsername()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPasskey()) {
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
      output.writeEnum(1, loginMode_.getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getUsernameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getPasskeyBytes());
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
        .computeEnumSize(1, loginMode_.getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getUsernameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getPasskeyBytes());
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

  public static com.eze.ezecli.LoginInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.LoginInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.LoginInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eze.ezecli.LoginInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eze.ezecli.LoginInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.LoginInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.LoginInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.eze.ezecli.LoginInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.eze.ezecli.LoginInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.eze.ezecli.LoginInput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.eze.ezecli.LoginInput prototype) {
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
   * Protobuf type {@code ezecli.LoginInput}
   *
   * <pre>
   **
   * LoginInput message represents the login message to initiate the login API of the ezecli app. API is used to create session for the user. 
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ezecli.LoginInput)
      com.eze.ezecli.LoginInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_LoginInput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_LoginInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eze.ezecli.LoginInput.class, com.eze.ezecli.LoginInput.Builder.class);
    }

    // Construct using com.eze.ezecli.LoginInput.newBuilder()
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
      loginMode_ = com.eze.ezecli.LoginInput.LoginMode.PASSWORD;
      bitField0_ = (bitField0_ & ~0x00000001);
      username_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      passkey_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.eze.ezecli.Ezetap.internal_static_ezecli_LoginInput_descriptor;
    }

    public com.eze.ezecli.LoginInput getDefaultInstanceForType() {
      return com.eze.ezecli.LoginInput.getDefaultInstance();
    }

    public com.eze.ezecli.LoginInput build() {
      com.eze.ezecli.LoginInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.eze.ezecli.LoginInput buildPartial() {
      com.eze.ezecli.LoginInput result = new com.eze.ezecli.LoginInput(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.loginMode_ = loginMode_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.username_ = username_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.passkey_ = passkey_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.eze.ezecli.LoginInput) {
        return mergeFrom((com.eze.ezecli.LoginInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.eze.ezecli.LoginInput other) {
      if (other == com.eze.ezecli.LoginInput.getDefaultInstance()) return this;
      if (other.hasLoginMode()) {
        setLoginMode(other.getLoginMode());
      }
      if (other.hasUsername()) {
        bitField0_ |= 0x00000002;
        username_ = other.username_;
        onChanged();
      }
      if (other.hasPasskey()) {
        bitField0_ |= 0x00000004;
        passkey_ = other.passkey_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasLoginMode()) {
        
        return false;
      }
      if (!hasUsername()) {
        
        return false;
      }
      if (!hasPasskey()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.eze.ezecli.LoginInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.eze.ezecli.LoginInput) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.eze.ezecli.LoginInput.LoginMode loginMode_ = com.eze.ezecli.LoginInput.LoginMode.PASSWORD;
    /**
     * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
     *
     * <pre>
     *&#47; Mode of login
     * </pre>
     */
    public boolean hasLoginMode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
     *
     * <pre>
     *&#47; Mode of login
     * </pre>
     */
    public com.eze.ezecli.LoginInput.LoginMode getLoginMode() {
      return loginMode_;
    }
    /**
     * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
     *
     * <pre>
     *&#47; Mode of login
     * </pre>
     */
    public Builder setLoginMode(com.eze.ezecli.LoginInput.LoginMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      loginMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required .ezecli.LoginInput.LoginMode loginMode = 1;</code>
     *
     * <pre>
     *&#47; Mode of login
     * </pre>
     */
    public Builder clearLoginMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      loginMode_ = com.eze.ezecli.LoginInput.LoginMode.PASSWORD;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public Builder clearUsername() {
      bitField0_ = (bitField0_ & ~0x00000002);
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>required string username = 2;</code>
     *
     * <pre>
     *&#47; Username of the user to login
     * </pre>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object passkey_ = "";
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public boolean hasPasskey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public java.lang.String getPasskey() {
      java.lang.Object ref = passkey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          passkey_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public com.google.protobuf.ByteString
        getPasskeyBytes() {
      java.lang.Object ref = passkey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        passkey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public Builder setPasskey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      passkey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public Builder clearPasskey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      passkey_ = getDefaultInstance().getPasskey();
      onChanged();
      return this;
    }
    /**
     * <code>required string passkey = 3;</code>
     *
     * <pre>
     *&#47; App_key or password to be used while login; App_key is the preferred mode of login. 
     * </pre>
     */
    public Builder setPasskeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      passkey_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ezecli.LoginInput)
  }

  static {
    defaultInstance = new LoginInput(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ezecli.LoginInput)
}
