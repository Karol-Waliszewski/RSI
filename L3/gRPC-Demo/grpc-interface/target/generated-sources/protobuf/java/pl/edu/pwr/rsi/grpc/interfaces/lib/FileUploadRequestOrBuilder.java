// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package pl.edu.pwr.rsi.grpc.interfaces.lib;

public interface FileUploadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pl.edu.pwr.rsi.grpc.interface.FileUploadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.MetaData metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.MetaData metadata = 1;</code>
   * @return The metadata.
   */
  pl.edu.pwr.rsi.grpc.interfaces.lib.MetaData getMetadata();
  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.MetaData metadata = 1;</code>
   */
  pl.edu.pwr.rsi.grpc.interfaces.lib.MetaDataOrBuilder getMetadataOrBuilder();

  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.File file = 2;</code>
   * @return Whether the file field is set.
   */
  boolean hasFile();
  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.File file = 2;</code>
   * @return The file.
   */
  pl.edu.pwr.rsi.grpc.interfaces.lib.File getFile();
  /**
   * <code>.pl.edu.pwr.rsi.grpc.interface.File file = 2;</code>
   */
  pl.edu.pwr.rsi.grpc.interfaces.lib.FileOrBuilder getFileOrBuilder();

  public pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest.RequestCase getRequestCase();
}
