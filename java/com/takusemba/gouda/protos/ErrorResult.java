// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: error.proto
package com.takusemba.gouda.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class ErrorResult extends Message<ErrorResult, ErrorResult.Builder> {
  public static final ProtoAdapter<ErrorResult> ADAPTER = new ProtoAdapter_ErrorResult();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_MESSAGE = "";

  /**
   * / Error message
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String message;

  public ErrorResult(String message) {
    this(message, ByteString.EMPTY);
  }

  public ErrorResult(String message, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.message = message;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.message = message;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ErrorResult)) return false;
    ErrorResult o = (ErrorResult) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(message, o.message);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (message != null ? message.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (message != null) builder.append(", message=").append(message);
    return builder.replace(0, 2, "ErrorResult{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ErrorResult, Builder> {
    public String message;

    public Builder() {
    }

    /**
     * / Error message
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    @Override
    public ErrorResult build() {
      return new ErrorResult(message, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ErrorResult extends ProtoAdapter<ErrorResult> {
    public ProtoAdapter_ErrorResult() {
      super(FieldEncoding.LENGTH_DELIMITED, ErrorResult.class);
    }

    @Override
    public int encodedSize(ErrorResult value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.message)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ErrorResult value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.message);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ErrorResult decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.message(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public ErrorResult redact(ErrorResult value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
