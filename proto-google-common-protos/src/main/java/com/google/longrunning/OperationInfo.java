/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 *
 *
 * <pre>
 * A message representing the message types used by a long-running operation.
 * Example:
 *   rpc LongRunningRecognize(LongRunningRecognizeRequest)
 *       returns (google.longrunning.Operation) {
 *     option (google.longrunning.operation_info) = {
 *       response_type: "LongRunningRecognizeResponse"
 *       metadata_type: "LongRunningRecognizeMetadata"
 *     };
 *   }
 * </pre>
 *
 * Protobuf type {@code google.longrunning.OperationInfo}
 */
public final class OperationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.longrunning.OperationInfo)
    OperationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OperationInfo.newBuilder() to construct.
  private OperationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OperationInfo() {
    responseType_ = "";
    metadataType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OperationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OperationInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              responseType_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              metadataType_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.longrunning.OperationsProto
        .internal_static_google_longrunning_OperationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.longrunning.OperationsProto
        .internal_static_google_longrunning_OperationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.longrunning.OperationInfo.class,
            com.google.longrunning.OperationInfo.Builder.class);
  }

  public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseType_;
  /**
   *
   *
   * <pre>
   * Required. The message name of the primary return type for this
   * long-running operation.
   * This type will be used to deserialize the LRO's response.
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string response_type = 1;</code>
   *
   * @return The responseType.
   */
  @java.lang.Override
  public java.lang.String getResponseType() {
    java.lang.Object ref = responseType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The message name of the primary return type for this
   * long-running operation.
   * This type will be used to deserialize the LRO's response.
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string response_type = 1;</code>
   *
   * @return The bytes for responseType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResponseTypeBytes() {
    java.lang.Object ref = responseType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      responseType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object metadataType_;
  /**
   *
   *
   * <pre>
   * Required. The message name of the metadata type for this long-running
   * operation.
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string metadata_type = 2;</code>
   *
   * @return The metadataType.
   */
  @java.lang.Override
  public java.lang.String getMetadataType() {
    java.lang.Object ref = metadataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The message name of the metadata type for this long-running
   * operation.
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string metadata_type = 2;</code>
   *
   * @return The bytes for metadataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadataTypeBytes() {
    java.lang.Object ref = metadataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metadataType_ = b;
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

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metadataType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, metadataType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.longrunning.OperationInfo)) {
      return super.equals(obj);
    }
    com.google.longrunning.OperationInfo other = (com.google.longrunning.OperationInfo) obj;

    if (!getResponseType().equals(other.getResponseType())) return false;
    if (!getMetadataType().equals(other.getMetadataType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseType().hashCode();
    hash = (37 * hash) + METADATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.longrunning.OperationInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.OperationInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.OperationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.longrunning.OperationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.longrunning.OperationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.longrunning.OperationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.longrunning.OperationInfo parseFrom(
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

  public static Builder newBuilder(com.google.longrunning.OperationInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A message representing the message types used by a long-running operation.
   * Example:
   *   rpc LongRunningRecognize(LongRunningRecognizeRequest)
   *       returns (google.longrunning.Operation) {
   *     option (google.longrunning.operation_info) = {
   *       response_type: "LongRunningRecognizeResponse"
   *       metadata_type: "LongRunningRecognizeMetadata"
   *     };
   *   }
   * </pre>
   *
   * Protobuf type {@code google.longrunning.OperationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.OperationInfo)
      com.google.longrunning.OperationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_OperationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_OperationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.longrunning.OperationInfo.class,
              com.google.longrunning.OperationInfo.Builder.class);
    }

    // Construct using com.google.longrunning.OperationInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      responseType_ = "";

      metadataType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.longrunning.OperationsProto
          .internal_static_google_longrunning_OperationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.longrunning.OperationInfo getDefaultInstanceForType() {
      return com.google.longrunning.OperationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.longrunning.OperationInfo build() {
      com.google.longrunning.OperationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.longrunning.OperationInfo buildPartial() {
      com.google.longrunning.OperationInfo result = new com.google.longrunning.OperationInfo(this);
      result.responseType_ = responseType_;
      result.metadataType_ = metadataType_;
      onBuilt();
      return result;
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
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.longrunning.OperationInfo) {
        return mergeFrom((com.google.longrunning.OperationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.longrunning.OperationInfo other) {
      if (other == com.google.longrunning.OperationInfo.getDefaultInstance()) return this;
      if (!other.getResponseType().isEmpty()) {
        responseType_ = other.responseType_;
        onChanged();
      }
      if (!other.getMetadataType().isEmpty()) {
        metadataType_ = other.metadataType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.longrunning.OperationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.longrunning.OperationInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responseType_ = "";
    /**
     *
     *
     * <pre>
     * Required. The message name of the primary return type for this
     * long-running operation.
     * This type will be used to deserialize the LRO's response.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string response_type = 1;</code>
     *
     * @return The responseType.
     */
    public java.lang.String getResponseType() {
      java.lang.Object ref = responseType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the primary return type for this
     * long-running operation.
     * This type will be used to deserialize the LRO's response.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string response_type = 1;</code>
     *
     * @return The bytes for responseType.
     */
    public com.google.protobuf.ByteString getResponseTypeBytes() {
      java.lang.Object ref = responseType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        responseType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the primary return type for this
     * long-running operation.
     * This type will be used to deserialize the LRO's response.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string response_type = 1;</code>
     *
     * @param value The responseType to set.
     * @return This builder for chaining.
     */
    public Builder setResponseType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      responseType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the primary return type for this
     * long-running operation.
     * This type will be used to deserialize the LRO's response.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string response_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResponseType() {

      responseType_ = getDefaultInstance().getResponseType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the primary return type for this
     * long-running operation.
     * This type will be used to deserialize the LRO's response.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string response_type = 1;</code>
     *
     * @param value The bytes for responseType to set.
     * @return This builder for chaining.
     */
    public Builder setResponseTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      responseType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object metadataType_ = "";
    /**
     *
     *
     * <pre>
     * Required. The message name of the metadata type for this long-running
     * operation.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string metadata_type = 2;</code>
     *
     * @return The metadataType.
     */
    public java.lang.String getMetadataType() {
      java.lang.Object ref = metadataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the metadata type for this long-running
     * operation.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string metadata_type = 2;</code>
     *
     * @return The bytes for metadataType.
     */
    public com.google.protobuf.ByteString getMetadataTypeBytes() {
      java.lang.Object ref = metadataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metadataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the metadata type for this long-running
     * operation.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string metadata_type = 2;</code>
     *
     * @param value The metadataType to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      metadataType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the metadata type for this long-running
     * operation.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string metadata_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetadataType() {

      metadataType_ = getDefaultInstance().getMetadataType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The message name of the metadata type for this long-running
     * operation.
     * If the response is in a different package from the rpc, a fully-qualified
     * message name must be used (e.g. `google.protobuf.Struct`).
     * Note: Altering this value constitutes a breaking change.
     * </pre>
     *
     * <code>string metadata_type = 2;</code>
     *
     * @param value The bytes for metadataType to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      metadataType_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.longrunning.OperationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.longrunning.OperationInfo)
  private static final com.google.longrunning.OperationInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.longrunning.OperationInfo();
  }

  public static com.google.longrunning.OperationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationInfo> PARSER =
      new com.google.protobuf.AbstractParser<OperationInfo>() {
        @java.lang.Override
        public OperationInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OperationInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OperationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.longrunning.OperationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
