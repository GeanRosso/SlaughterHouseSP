package grpc.slaughterhouseService.generate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StationThreeServiceGrpc {

  private StationThreeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.slaughterhouseService.StationThreeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<packSingleProductRequest,
          PackSingleProductResponse> getPackSingleProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PackSingleProduct",
      requestType = packSingleProductRequest.class,
      responseType = PackSingleProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<packSingleProductRequest,
          PackSingleProductResponse> getPackSingleProductMethod() {
    io.grpc.MethodDescriptor<packSingleProductRequest, PackSingleProductResponse> getPackSingleProductMethod;
    if ((getPackSingleProductMethod = StationThreeServiceGrpc.getPackSingleProductMethod) == null) {
      synchronized (StationThreeServiceGrpc.class) {
        if ((getPackSingleProductMethod = StationThreeServiceGrpc.getPackSingleProductMethod) == null) {
          StationThreeServiceGrpc.getPackSingleProductMethod = getPackSingleProductMethod =
              io.grpc.MethodDescriptor.<packSingleProductRequest, PackSingleProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PackSingleProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  packSingleProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PackSingleProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StationThreeServiceMethodDescriptorSupplier("PackSingleProduct"))
              .build();
        }
      }
    }
    return getPackSingleProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<packHalfAnimalRequest,
          PackHalfAnimalResponse> getPackHalfAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PackHalfAnimal",
      requestType = packHalfAnimalRequest.class,
      responseType = PackHalfAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<packHalfAnimalRequest,
          PackHalfAnimalResponse> getPackHalfAnimalMethod() {
    io.grpc.MethodDescriptor<packHalfAnimalRequest, PackHalfAnimalResponse> getPackHalfAnimalMethod;
    if ((getPackHalfAnimalMethod = StationThreeServiceGrpc.getPackHalfAnimalMethod) == null) {
      synchronized (StationThreeServiceGrpc.class) {
        if ((getPackHalfAnimalMethod = StationThreeServiceGrpc.getPackHalfAnimalMethod) == null) {
          StationThreeServiceGrpc.getPackHalfAnimalMethod = getPackHalfAnimalMethod =
              io.grpc.MethodDescriptor.<packHalfAnimalRequest, PackHalfAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PackHalfAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  packHalfAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PackHalfAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StationThreeServiceMethodDescriptorSupplier("PackHalfAnimal"))
              .build();
        }
      }
    }
    return getPackHalfAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StationThreeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceStub>() {
        @Override
        public StationThreeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationThreeServiceStub(channel, callOptions);
        }
      };
    return StationThreeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StationThreeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceBlockingV2Stub>() {
        @Override
        public StationThreeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationThreeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StationThreeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StationThreeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceBlockingStub>() {
        @Override
        public StationThreeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationThreeServiceBlockingStub(channel, callOptions);
        }
      };
    return StationThreeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StationThreeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StationThreeServiceFutureStub>() {
        @Override
        public StationThreeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StationThreeServiceFutureStub(channel, callOptions);
        }
      };
    return StationThreeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void packSingleProduct(packSingleProductRequest request,
                                   io.grpc.stub.StreamObserver<PackSingleProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPackSingleProductMethod(), responseObserver);
    }

    /**
     */
    default void packHalfAnimal(packHalfAnimalRequest request,
                                io.grpc.stub.StreamObserver<PackHalfAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPackHalfAnimalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StationThreeService.
   */
  public static abstract class StationThreeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return StationThreeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StationThreeService.
   */
  public static final class StationThreeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StationThreeServiceStub> {
    private StationThreeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StationThreeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationThreeServiceStub(channel, callOptions);
    }

    /**
     */
    public void packSingleProduct(packSingleProductRequest request,
                                  io.grpc.stub.StreamObserver<PackSingleProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPackSingleProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void packHalfAnimal(packHalfAnimalRequest request,
                               io.grpc.stub.StreamObserver<PackHalfAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPackHalfAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StationThreeService.
   */
  public static final class StationThreeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StationThreeServiceBlockingV2Stub> {
    private StationThreeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StationThreeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationThreeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public PackSingleProductResponse packSingleProduct(packSingleProductRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPackSingleProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public PackHalfAnimalResponse packHalfAnimal(packHalfAnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPackHalfAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StationThreeService.
   */
  public static final class StationThreeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StationThreeServiceBlockingStub> {
    private StationThreeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StationThreeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationThreeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public PackSingleProductResponse packSingleProduct(packSingleProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPackSingleProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public PackHalfAnimalResponse packHalfAnimal(packHalfAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPackHalfAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StationThreeService.
   */
  public static final class StationThreeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StationThreeServiceFutureStub> {
    private StationThreeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StationThreeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StationThreeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PackSingleProductResponse> packSingleProduct(
        packSingleProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPackSingleProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PackHalfAnimalResponse> packHalfAnimal(
        packHalfAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPackHalfAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PACK_SINGLE_PRODUCT = 0;
  private static final int METHODID_PACK_HALF_ANIMAL = 1;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PACK_SINGLE_PRODUCT:
          serviceImpl.packSingleProduct((packSingleProductRequest) request,
              (io.grpc.stub.StreamObserver<PackSingleProductResponse>) responseObserver);
          break;
        case METHODID_PACK_HALF_ANIMAL:
          serviceImpl.packHalfAnimal((packHalfAnimalRequest) request,
              (io.grpc.stub.StreamObserver<PackHalfAnimalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
          getPackSingleProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
                    packSingleProductRequest,
                    PackSingleProductResponse>(
                service, METHODID_PACK_SINGLE_PRODUCT)))
        .addMethod(
          getPackHalfAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
                    packHalfAnimalRequest,
                    PackHalfAnimalResponse>(
                service, METHODID_PACK_HALF_ANIMAL)))
        .build();
  }

  private static abstract class StationThreeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StationThreeServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServiceProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StationThreeService");
    }
  }

  private static final class StationThreeServiceFileDescriptorSupplier
      extends StationThreeServiceBaseDescriptorSupplier {
    StationThreeServiceFileDescriptorSupplier() {}
  }

  private static final class StationThreeServiceMethodDescriptorSupplier
      extends StationThreeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StationThreeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StationThreeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StationThreeServiceFileDescriptorSupplier())
              .addMethod(getPackSingleProductMethod())
              .addMethod(getPackHalfAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
