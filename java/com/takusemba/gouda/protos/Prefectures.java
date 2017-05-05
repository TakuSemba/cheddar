// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prefectures.proto

package com.takusemba.gouda.protos;

public final class Prefectures {
  private Prefectures() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PrefectureOrBuilder extends
      // @@protoc_insertion_point(interface_extends:prefectures.Prefecture)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID
     * </pre>
     *
     * <code>optional int64 id = 1;</code>
     */
    long getId();

    /**
     * <pre>
     * 名前
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * 名前
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * 読み方（ローマ字）
     * </pre>
     *
     * <code>optional string romaji = 3;</code>
     */
    java.lang.String getRomaji();
    /**
     * <pre>
     * 読み方（ローマ字）
     * </pre>
     *
     * <code>optional string romaji = 3;</code>
     */
    com.google.protobuf.ByteString
        getRomajiBytes();
  }
  /**
   * Protobuf type {@code prefectures.Prefecture}
   */
  public  static final class Prefecture extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:prefectures.Prefecture)
      PrefectureOrBuilder {
    // Use Prefecture.newBuilder() to construct.
    private Prefecture(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Prefecture() {
      id_ = 0L;
      name_ = "";
      romaji_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Prefecture(
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
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              romaji_ = s;
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
      return com.takusemba.gouda.protos.Prefectures.internal_static_prefectures_Prefecture_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.takusemba.gouda.protos.Prefectures.internal_static_prefectures_Prefecture_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.takusemba.gouda.protos.Prefectures.Prefecture.class, com.takusemba.gouda.protos.Prefectures.Prefecture.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <pre>
     * ID
     * </pre>
     *
     * <code>optional int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * 名前
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 名前
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROMAJI_FIELD_NUMBER = 3;
    private volatile java.lang.Object romaji_;
    /**
     * <pre>
     * 読み方（ローマ字）
     * </pre>
     *
     * <code>optional string romaji = 3;</code>
     */
    public java.lang.String getRomaji() {
      java.lang.Object ref = romaji_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        romaji_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 読み方（ローマ字）
     * </pre>
     *
     * <code>optional string romaji = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRomajiBytes() {
      java.lang.Object ref = romaji_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        romaji_ = b;
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getRomajiBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, romaji_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getRomajiBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, romaji_);
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
      if (!(obj instanceof com.takusemba.gouda.protos.Prefectures.Prefecture)) {
        return super.equals(obj);
      }
      com.takusemba.gouda.protos.Prefectures.Prefecture other = (com.takusemba.gouda.protos.Prefectures.Prefecture) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && getName()
          .equals(other.getName());
      result = result && getRomaji()
          .equals(other.getRomaji());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ROMAJI_FIELD_NUMBER;
      hash = (53 * hash) + getRomaji().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.takusemba.gouda.protos.Prefectures.Prefecture parseFrom(
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
    public static Builder newBuilder(com.takusemba.gouda.protos.Prefectures.Prefecture prototype) {
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
     * Protobuf type {@code prefectures.Prefecture}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:prefectures.Prefecture)
        com.takusemba.gouda.protos.Prefectures.PrefectureOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.takusemba.gouda.protos.Prefectures.internal_static_prefectures_Prefecture_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.takusemba.gouda.protos.Prefectures.internal_static_prefectures_Prefecture_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.takusemba.gouda.protos.Prefectures.Prefecture.class, com.takusemba.gouda.protos.Prefectures.Prefecture.Builder.class);
      }

      // Construct using com.takusemba.gouda.protos.Prefectures.Prefecture.newBuilder()
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
        id_ = 0L;

        name_ = "";

        romaji_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.takusemba.gouda.protos.Prefectures.internal_static_prefectures_Prefecture_descriptor;
      }

      public com.takusemba.gouda.protos.Prefectures.Prefecture getDefaultInstanceForType() {
        return com.takusemba.gouda.protos.Prefectures.Prefecture.getDefaultInstance();
      }

      public com.takusemba.gouda.protos.Prefectures.Prefecture build() {
        com.takusemba.gouda.protos.Prefectures.Prefecture result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.takusemba.gouda.protos.Prefectures.Prefecture buildPartial() {
        com.takusemba.gouda.protos.Prefectures.Prefecture result = new com.takusemba.gouda.protos.Prefectures.Prefecture(this);
        result.id_ = id_;
        result.name_ = name_;
        result.romaji_ = romaji_;
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
        if (other instanceof com.takusemba.gouda.protos.Prefectures.Prefecture) {
          return mergeFrom((com.takusemba.gouda.protos.Prefectures.Prefecture)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.takusemba.gouda.protos.Prefectures.Prefecture other) {
        if (other == com.takusemba.gouda.protos.Prefectures.Prefecture.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getRomaji().isEmpty()) {
          romaji_ = other.romaji_;
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
        com.takusemba.gouda.protos.Prefectures.Prefecture parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.takusemba.gouda.protos.Prefectures.Prefecture) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <pre>
       * ID
       * </pre>
       *
       * <code>optional int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       * ID
       * </pre>
       *
       * <code>optional int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID
       * </pre>
       *
       * <code>optional int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * 名前
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 名前
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 名前
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 名前
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 名前
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object romaji_ = "";
      /**
       * <pre>
       * 読み方（ローマ字）
       * </pre>
       *
       * <code>optional string romaji = 3;</code>
       */
      public java.lang.String getRomaji() {
        java.lang.Object ref = romaji_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          romaji_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 読み方（ローマ字）
       * </pre>
       *
       * <code>optional string romaji = 3;</code>
       */
      public com.google.protobuf.ByteString
          getRomajiBytes() {
        java.lang.Object ref = romaji_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          romaji_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 読み方（ローマ字）
       * </pre>
       *
       * <code>optional string romaji = 3;</code>
       */
      public Builder setRomaji(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        romaji_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 読み方（ローマ字）
       * </pre>
       *
       * <code>optional string romaji = 3;</code>
       */
      public Builder clearRomaji() {
        
        romaji_ = getDefaultInstance().getRomaji();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 読み方（ローマ字）
       * </pre>
       *
       * <code>optional string romaji = 3;</code>
       */
      public Builder setRomajiBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        romaji_ = value;
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


      // @@protoc_insertion_point(builder_scope:prefectures.Prefecture)
    }

    // @@protoc_insertion_point(class_scope:prefectures.Prefecture)
    private static final com.takusemba.gouda.protos.Prefectures.Prefecture DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.takusemba.gouda.protos.Prefectures.Prefecture();
    }

    public static com.takusemba.gouda.protos.Prefectures.Prefecture getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Prefecture>
        PARSER = new com.google.protobuf.AbstractParser<Prefecture>() {
      public Prefecture parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Prefecture(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Prefecture> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Prefecture> getParserForType() {
      return PARSER;
    }

    public com.takusemba.gouda.protos.Prefectures.Prefecture getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prefectures_Prefecture_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prefectures_Prefecture_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021prefectures.proto\022\013prefectures\"6\n\nPref" +
      "ecture\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\016\n\006roma" +
      "ji\030\003 \001(\tB0\n\032com.takusemba.gouda.protosB\013" +
      "PrefecturesZ\005protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_prefectures_Prefecture_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_prefectures_Prefecture_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prefectures_Prefecture_descriptor,
        new java.lang.String[] { "Id", "Name", "Romaji", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}