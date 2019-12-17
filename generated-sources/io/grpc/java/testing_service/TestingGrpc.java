package io.grpc.java.testing_service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: TestingService.proto")
public final class TestingGrpc {

  private TestingGrpc() {}

  public static final String SERVICE_NAME = "testing_service.Testing";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.java.testing_service.TestingRequest,
      io.grpc.java.testing_service.TestingResponse> METHOD_TESTING_REQUEST_HANDLER =
      io.grpc.MethodDescriptor.<io.grpc.java.testing_service.TestingRequest, io.grpc.java.testing_service.TestingResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "testing_service.Testing", "TestingRequestHandler"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.java.testing_service.TestingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.java.testing_service.TestingResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestingStub newStub(io.grpc.Channel channel) {
    return new TestingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestingFutureStub(channel);
  }

  /**
   */
  public static abstract class TestingImplBase implements io.grpc.BindableService {

    /**
     */
    public void testingRequestHandler(io.grpc.java.testing_service.TestingRequest request,
        io.grpc.stub.StreamObserver<io.grpc.java.testing_service.TestingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TESTING_REQUEST_HANDLER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_TESTING_REQUEST_HANDLER,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.java.testing_service.TestingRequest,
                io.grpc.java.testing_service.TestingResponse>(
                  this, METHODID_TESTING_REQUEST_HANDLER)))
          .build();
    }
  }

  /**
   */
  public static final class TestingStub extends io.grpc.stub.AbstractStub<TestingStub> {
    private TestingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingStub(channel, callOptions);
    }

    /**
     */
    public void testingRequestHandler(io.grpc.java.testing_service.TestingRequest request,
        io.grpc.stub.StreamObserver<io.grpc.java.testing_service.TestingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TESTING_REQUEST_HANDLER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestingBlockingStub extends io.grpc.stub.AbstractStub<TestingBlockingStub> {
    private TestingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.java.testing_service.TestingResponse testingRequestHandler(io.grpc.java.testing_service.TestingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TESTING_REQUEST_HANDLER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestingFutureStub extends io.grpc.stub.AbstractStub<TestingFutureStub> {
    private TestingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.java.testing_service.TestingResponse> testingRequestHandler(
        io.grpc.java.testing_service.TestingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TESTING_REQUEST_HANDLER, getCallOptions()), request);
    }
  }

  private static final int METHODID_TESTING_REQUEST_HANDLER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TESTING_REQUEST_HANDLER:
          serviceImpl.testingRequestHandler((io.grpc.java.testing_service.TestingRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.java.testing_service.TestingResponse>) responseObserver);
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

  private static final class TestingDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.java.testing_service.TestingServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestingDescriptorSupplier())
              .addMethod(METHOD_TESTING_REQUEST_HANDLER)
              .build();
        }
      }
    }
    return result;
  }
}
