// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ezetap.proto

package com.eze.ezecli;

public interface TxnHistoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ezecli.TxnHistory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 totalCount = 1;</code>
   *
   * <pre>
   *&#47;Total num of records fetched
   * </pre>
   */
  boolean hasTotalCount();
  /**
   * <code>required int32 totalCount = 1;</code>
   *
   * <pre>
   *&#47;Total num of records fetched
   * </pre>
   */
  int getTotalCount();

  /**
   * <code>required double netAmount = 2;</code>
   *
   * <pre>
   *&#47;Net amount of the fetched transactions
   * </pre>
   */
  boolean hasNetAmount();
  /**
   * <code>required double netAmount = 2;</code>
   *
   * <pre>
   *&#47;Net amount of the fetched transactions
   * </pre>
   */
  double getNetAmount();

  /**
   * <code>required int32 summaryItemCount = 3;</code>
   *
   * <pre>
   *&#47;Summary Item count
   * </pre>
   */
  boolean hasSummaryItemCount();
  /**
   * <code>required int32 summaryItemCount = 3;</code>
   *
   * <pre>
   *&#47;Summary Item count
   * </pre>
   */
  int getSummaryItemCount();

  /**
   * <code>repeated .ezecli.TxnHistory.SummaryItem summaryItems = 4;</code>
   *
   * <pre>
   *&#47;List of SummaryItem's
   * </pre>
   */
  java.util.List<com.eze.ezecli.TxnHistory.SummaryItem> 
      getSummaryItemsList();
  /**
   * <code>repeated .ezecli.TxnHistory.SummaryItem summaryItems = 4;</code>
   *
   * <pre>
   *&#47;List of SummaryItem's
   * </pre>
   */
  com.eze.ezecli.TxnHistory.SummaryItem getSummaryItems(int index);
  /**
   * <code>repeated .ezecli.TxnHistory.SummaryItem summaryItems = 4;</code>
   *
   * <pre>
   *&#47;List of SummaryItem's
   * </pre>
   */
  int getSummaryItemsCount();
  /**
   * <code>repeated .ezecli.TxnHistory.SummaryItem summaryItems = 4;</code>
   *
   * <pre>
   *&#47;List of SummaryItem's
   * </pre>
   */
  java.util.List<? extends com.eze.ezecli.TxnHistory.SummaryItemOrBuilder> 
      getSummaryItemsOrBuilderList();
  /**
   * <code>repeated .ezecli.TxnHistory.SummaryItem summaryItems = 4;</code>
   *
   * <pre>
   *&#47;List of SummaryItem's
   * </pre>
   */
  com.eze.ezecli.TxnHistory.SummaryItemOrBuilder getSummaryItemsOrBuilder(
      int index);

  /**
   * <code>repeated .ezecli.Txn txns = 5;</code>
   *
   * <pre>
   *&#47;List of Transactions
   * </pre>
   */
  java.util.List<com.eze.ezecli.Txn> 
      getTxnsList();
  /**
   * <code>repeated .ezecli.Txn txns = 5;</code>
   *
   * <pre>
   *&#47;List of Transactions
   * </pre>
   */
  com.eze.ezecli.Txn getTxns(int index);
  /**
   * <code>repeated .ezecli.Txn txns = 5;</code>
   *
   * <pre>
   *&#47;List of Transactions
   * </pre>
   */
  int getTxnsCount();
  /**
   * <code>repeated .ezecli.Txn txns = 5;</code>
   *
   * <pre>
   *&#47;List of Transactions
   * </pre>
   */
  java.util.List<? extends com.eze.ezecli.TxnOrBuilder> 
      getTxnsOrBuilderList();
  /**
   * <code>repeated .ezecli.Txn txns = 5;</code>
   *
   * <pre>
   *&#47;List of Transactions
   * </pre>
   */
  com.eze.ezecli.TxnOrBuilder getTxnsOrBuilder(
      int index);
}
