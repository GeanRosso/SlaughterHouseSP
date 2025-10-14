package slaughterhouseService;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StationTwoServiceGrpc {

  private StationTwoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.slaughterhouseService.StationTwoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cutRequest,
          CutResponse> getCutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cut",
      requestType = cutRequest.class,
      responseType = CutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cutRequest,
          CutResponse> getCutMethod() {
    io.grpc.MethodDescriptor<cutRequest, CutResponse> getCutMethod;
    if ((getCutMethod = StationTwoServiceGrpc.getCutMethod) == null) {
      synchronized (StationTwoServiceGrpc.class) {
        if ((getCutMethod = StationTwoServiceGrpc.getCutMethod) == null) {
          StationTwoServiceGrpc.getCutMethod = getCutMethod =
              io.grpc.MethodDescriptor.<cutRequest, CutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StationTwoServiceMethodDescriptorSupplier("Cut"))
              .build();
        }
      }
    }
    return getCutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StationTwoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceStub>() {
        @java.lang.Override
        public StationTwoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationTwoServiceStub(channel, callOptions);
        }
      };
    return StationTwoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StationTwoServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceBlockingV2Stub>() {
        @java.lang.Override
        public StationTwoServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationTwoServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StationTwoServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StationTwoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceBlockingStub>() {
        @java.lang.Override
        public StationTwoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationTwoServiceBlockingStub(channel, callOptions);
        }
      };
    return StationTwoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StationTwoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationTwoServiceFutureStub>() {
        @java.lang.Override
        public StationTwoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationTwoServiceFutureStub(channel, callOptions);
        }
      };
    return StationTwoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void cut(cutRequest request,
                     io.grpc.stub.StreamObserver<CutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCutMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StationTwoService.
   */
  public static abstract class StationTwoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StationTwoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StationTwoService.
   */
  public static final class StationTwoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StationTwoServiceStub> {
    private StationTwoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationTwoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationTwoServiceStub(channel, callOptions);
    }

    /**
     */
    public void cut(cutRequest request,
                    io.grpc.stub.StreamObserver<CutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StationTwoService.
   */
  public static final class StationTwoServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StationTwoServiceBlockingV2Stub> {
    private StationTwoServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationTwoServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationTwoServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public CutResponse cut(cutRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StationTwoService.
   */
  public static final class StationTwoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StationTwoServiceBlockingStub> {
    private StationTwoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationTwoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationTwoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CutResponse cut(cutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StationTwoService.
   */
  public static final class StationTwoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StationTwoServiceFutureStub> {
    private StationTwoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationTwoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationTwoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CutResponse> cut(
        cutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CUT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CUT:
          serviceImpl.cut((cutRequest) request,
              (io.grpc.stub.StreamObserver<CutResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
                    cutRequest,
                    CutResponse>(
                service, METHODID_CUT)))
        .build();
  }

  private static abstract class StationTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StationTwoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StationTwoService");
    }
  }

  private static final class StationTwoServiceFileDescriptorSupplier
      extends StationTwoServiceBaseDescriptorSupplier {
    StationTwoServiceFileDescriptorSupplier() {}
  }

  private static final class StationTwoServiceMethodDescriptorSupplier
      extends StationTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StationTwoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StationTwoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StationTwoServiceFileDescriptorSupplier())
              .addMethod(getCutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
