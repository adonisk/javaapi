// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

public interface SignatureInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ezecli.SignatureInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction you want to sign.
   * </pre>
   */
  boolean hasTxnId();
  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction you want to sign.
   * </pre>
   */
  java.lang.String getTxnId();
  /**
   * <code>required string txnId = 1;</code>
   *
   * <pre>
   *&#47;Id of the transaction you want to sign.
   * </pre>
   */
  com.google.protobuf.ByteString
      getTxnIdBytes();

  /**
   * <code>required .ezecli.SignatureInput.ImageType imageType = 2;</code>
   *
   * <pre>
   *&#47;Type of the image captured by your application
   * </pre>
   */
  boolean hasImageType();
  /**
   * <code>required .ezecli.SignatureInput.ImageType imageType = 2;</code>
   *
   * <pre>
   *&#47;Type of the image captured by your application
   * </pre>
   */
  com.eze.ezecli.SignatureInput.ImageType getImageType();

  /**
   * <code>required bytes imageBytes = 3;</code>
   *
   * <pre>
   *&#47;Data of the image
   * </pre>
   */
  boolean hasImageBytes();
  /**
   * <code>required bytes imageBytes = 3;</code>
   *
   * <pre>
   *&#47;Data of the image
   * </pre>
   */
  com.google.protobuf.ByteString getImageBytes();

  /**
   * <code>optional int32 height = 4;</code>
   *
   * <pre>
   *&#47;Height of the image
   * </pre>
   */
  boolean hasHeight();
  /**
   * <code>optional int32 height = 4;</code>
   *
   * <pre>
   *&#47;Height of the image
   * </pre>
   */
  int getHeight();

  /**
   * <code>optional int32 width = 5;</code>
   *
   * <pre>
   *&#47;Width of the image
   * </pre>
   */
  boolean hasWidth();
  /**
   * <code>optional int32 width = 5;</code>
   *
   * <pre>
   *&#47;Width of the image
   * </pre>
   */
  int getWidth();

  /**
   * <code>optional double tipAmount = 6;</code>
   *
   * <pre>
   *&#47;Tip amount
   * </pre>
   */
  boolean hasTipAmount();
  /**
   * <code>optional double tipAmount = 6;</code>
   *
   * <pre>
   *&#47;Tip amount
   * </pre>
   */
  double getTipAmount();
}
