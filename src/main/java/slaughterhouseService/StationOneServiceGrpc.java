package slaughterhouseService;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StationOneServiceGrpc {

  private StationOneServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.slaughterhouseService.StationOneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<registerAnimalRequest,
          registerAnimalResponse> getRegisterAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAnimal",
      requestType = registerAnimalRequest.class,
      responseType = registerAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<registerAnimalRequest,
          registerAnimalResponse> getRegisterAnimalMethod() {
    io.grpc.MethodDescriptor<registerAnimalRequest, registerAnimalResponse> getRegisterAnimalMethod;
    if ((getRegisterAnimalMethod = StationOneServiceGrpc.getRegisterAnimalMethod) == null) {
      synchronized (StationOneServiceGrpc.class) {
        if ((getRegisterAnimalMethod = StationOneServiceGrpc.getRegisterAnimalMethod) == null) {
          StationOneServiceGrpc.getRegisterAnimalMethod = getRegisterAnimalMethod =
              io.grpc.MethodDescriptor.<registerAnimalRequest, registerAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registerAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registerAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StationOneServiceMethodDescriptorSupplier("RegisterAnimal"))
              .build();
        }
      }
    }
    return getRegisterAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StationOneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationOneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationOneServiceStub>() {
        @java.lang.Override
        public StationOneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationOneServiceStub(channel, callOptions);
        }
      };
    return StationOneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StationOneServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationOneServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationOneServiceBlockingV2Stub>() {
        @java.lang.Override
        public StationOneServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationOneServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StationOneServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StationOneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationOneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationOneServiceBlockingStub>() {
        @java.lang.Override
        public StationOneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationOneServiceBlockingStub(channel, callOptions);
        }
      };
    return StationOneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StationOneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationOneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationOneServiceFutureStub>() {
        @java.lang.Override
        public StationOneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationOneServiceFutureStub(channel, callOptions);
        }
      };
    return StationOneServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerAnimal(registerAnimalRequest request,
                                io.grpc.stub.StreamObserver<registerAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAnimalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StationOneService.
   */
  public static abstract class StationOneServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StationOneServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StationOneService.
   */
  public static final class StationOneServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StationOneServiceStub> {
    private StationOneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationOneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationOneServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerAnimal(registerAnimalRequest request,
                               io.grpc.stub.StreamObserver<registerAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StationOneService.
   */
  public static final class StationOneServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StationOneServiceBlockingV2Stub> {
    private StationOneServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationOneServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationOneServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public registerAnimalResponse registerAnimal(registerAnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRegisterAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StationOneService.
   */
  public static final class StationOneServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StationOneServiceBlockingStub> {
    private StationOneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationOneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationOneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public registerAnimalResponse registerAnimal(registerAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StationOneService.
   */
  public static final class StationOneServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StationOneServiceFutureStub> {
    private StationOneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationOneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationOneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<registerAnimalResponse> registerAnimal(
        registerAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ANIMAL = 0;

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
        case METHODID_REGISTER_ANIMAL:
          serviceImpl.registerAnimal((registerAnimalRequest) request,
              (io.grpc.stub.StreamObserver<registerAnimalResponse>) responseObserver);
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
          getRegisterAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
                    registerAnimalRequest,
                    registerAnimalResponse>(
                service, METHODID_REGISTER_ANIMAL)))
        .build();
  }

  private static abstract class StationOneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StationOneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StationOneService");
    }
  }

  private static final class StationOneServiceFileDescriptorSupplier
      extends StationOneServiceBaseDescriptorSupplier {
    StationOneServiceFileDescriptorSupplier() {}
  }

  private static final class StationOneServiceMethodDescriptorSupplier
      extends StationOneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StationOneServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StationOneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StationOneServiceFileDescriptorSupplier())
              .addMethod(getRegisterAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
