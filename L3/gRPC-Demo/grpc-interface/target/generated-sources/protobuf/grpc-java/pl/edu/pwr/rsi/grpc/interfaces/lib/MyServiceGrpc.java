package pl.edu.pwr.rsi.grpc.interfaces.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: grpc.proto")
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "pl.edu.pwr.rsi.grpc.interface.MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getShowRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowRanking",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getShowRankingMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getShowRankingMethod;
    if ((getShowRankingMethod = MyServiceGrpc.getShowRankingMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getShowRankingMethod = MyServiceGrpc.getShowRankingMethod) == null) {
          MyServiceGrpc.getShowRankingMethod = getShowRankingMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("ShowRanking"))
              .build();
        }
      }
    }
    return getShowRankingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue,
      pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getAddToRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToRanking",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue,
      pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getAddToRankingMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue, pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getAddToRankingMethod;
    if ((getAddToRankingMethod = MyServiceGrpc.getAddToRankingMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getAddToRankingMethod = MyServiceGrpc.getAddToRankingMethod) == null) {
          MyServiceGrpc.getAddToRankingMethod = getAddToRankingMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue, pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("AddToRanking"))
              .build();
        }
      }
    }
    return getAddToRankingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.Score,
      pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getFindInRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInRanking",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.Score.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.Score,
      pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getFindInRankingMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.Score, pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> getFindInRankingMethod;
    if ((getFindInRankingMethod = MyServiceGrpc.getFindInRankingMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getFindInRankingMethod = MyServiceGrpc.getFindInRankingMethod) == null) {
          MyServiceGrpc.getFindInRankingMethod = getFindInRankingMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.Score, pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.Score.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("FindInRanking"))
              .build();
        }
      }
    }
    return getFindInRankingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getSendImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendImage",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getSendImageMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> getSendImageMethod;
    if ((getSendImageMethod = MyServiceGrpc.getSendImageMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSendImageMethod = MyServiceGrpc.getSendImageMethod) == null) {
          MyServiceGrpc.getSendImageMethod = getSendImageMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SendImage"))
              .build();
        }
      }
    }
    return getSendImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
        @java.lang.Override
        public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStub(channel, callOptions);
        }
      };
    return MyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
        @java.lang.Override
        public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceBlockingStub(channel, callOptions);
        }
      };
    return MyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
        @java.lang.Override
        public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceFutureStub(channel, callOptions);
        }
      };
    return MyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showRanking(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowRankingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> addToRanking(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddToRankingMethod(), responseObserver);
    }

    /**
     */
    public void findInRanking(pl.edu.pwr.rsi.grpc.interfaces.lib.Score request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindInRankingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest> sendImage(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendImageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowRankingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>(
                  this, METHODID_SHOW_RANKING)))
          .addMethod(
            getAddToRankingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue,
                pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>(
                  this, METHODID_ADD_TO_RANKING)))
          .addMethod(
            getFindInRankingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.Score,
                pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>(
                  this, METHODID_FIND_IN_RANKING)))
          .addMethod(
            getSendImageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>(
                  this, METHODID_SEND_IMAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
    private MyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     */
    public void showRanking(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getShowRankingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> addToRanking(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAddToRankingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void findInRanking(pl.edu.pwr.rsi.grpc.interfaces.lib.Score request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindInRankingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.FileUploadRequest> sendImage(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendImageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> showRanking(
        pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getShowRankingMethod(), getCallOptions(), request);
    }

    /**
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue findInRanking(pl.edu.pwr.rsi.grpc.interfaces.lib.Score request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindInRankingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
    private MyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue> findInRanking(
        pl.edu.pwr.rsi.grpc.interfaces.lib.Score request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindInRankingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_RANKING = 0;
  private static final int METHODID_FIND_IN_RANKING = 1;
  private static final int METHODID_ADD_TO_RANKING = 2;
  private static final int METHODID_SEND_IMAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_RANKING:
          serviceImpl.showRanking((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>) responseObserver);
          break;
        case METHODID_FIND_IN_RANKING:
          serviceImpl.findInRanking((pl.edu.pwr.rsi.grpc.interfaces.lib.Score) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.RankingValue>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TO_RANKING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addToRanking(
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>) responseObserver);
        case METHODID_SEND_IMAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendImage(
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.MessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.GrpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getShowRankingMethod())
              .addMethod(getAddToRankingMethod())
              .addMethod(getFindInRankingMethod())
              .addMethod(getSendImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
