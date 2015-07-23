// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

public interface ChangePasswordInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ezecli.ChangePasswordInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string currentPassword = 1;</code>
   *
   * <pre>
   *&#47; User's current password
   * </pre>
   */
  boolean hasCurrentPassword();
  /**
   * <code>required string currentPassword = 1;</code>
   *
   * <pre>
   *&#47; User's current password
   * </pre>
   */
  java.lang.String getCurrentPassword();
  /**
   * <code>required string currentPassword = 1;</code>
   *
   * <pre>
   *&#47; User's current password
   * </pre>
   */
  com.google.protobuf.ByteString
      getCurrentPasswordBytes();

  /**
   * <code>required string newPassword = 2;</code>
   *
   * <pre>
   *&#47;New password the user would like to use
   * </pre>
   */
  boolean hasNewPassword();
  /**
   * <code>required string newPassword = 2;</code>
   *
   * <pre>
   *&#47;New password the user would like to use
   * </pre>
   */
  java.lang.String getNewPassword();
  /**
   * <code>required string newPassword = 2;</code>
   *
   * <pre>
   *&#47;New password the user would like to use
   * </pre>
   */
  com.google.protobuf.ByteString
      getNewPasswordBytes();
}