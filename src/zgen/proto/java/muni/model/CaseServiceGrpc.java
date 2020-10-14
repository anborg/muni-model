package muni.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: muni-service.proto")
public final class CaseServiceGrpc {

  private CaseServiceGrpc() {}

  public static final String SERVICE_NAME = "muni.model.CaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<muni.model.MuniService.ById,
      muni.model.Model.Case> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = muni.model.MuniService.ById.class,
      responseType = muni.model.Model.Case.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.MuniService.ById,
      muni.model.Model.Case> getGetMethod() {
    io.grpc.MethodDescriptor<muni.model.MuniService.ById, muni.model.Model.Case> getGetMethod;
    if ((getGetMethod = CaseServiceGrpc.getGetMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getGetMethod = CaseServiceGrpc.getGetMethod) == null) {
          CaseServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<muni.model.MuniService.ById, muni.model.Model.Case>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.ById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Case.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("get"))
                      .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Case,
          muni.model.Model.Case> getCreateMethod;

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Case,
          muni.model.Model.Case> getUpdateMethod;

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CaseServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub>() {
              @java.lang.Override
              public CaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CaseServiceBlockingStub(channel, callOptions);
              }
            };
    return CaseServiceBlockingStub.newStub(factory, channel);
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "create",
          requestType = muni.model.Model.Case.class,
          responseType = muni.model.Model.Case.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Case,
          muni.model.Model.Case> getCreateMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Case, muni.model.Model.Case> getCreateMethod;
    if ((getCreateMethod = CaseServiceGrpc.getCreateMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getCreateMethod = CaseServiceGrpc.getCreateMethod) == null) {
          CaseServiceGrpc.getCreateMethod = getCreateMethod =
                  io.grpc.MethodDescriptor.<muni.model.Model.Case, muni.model.Model.Case>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  muni.model.Model.Case.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  muni.model.Model.Case.getDefaultInstance()))
                          .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("create"))
                          .build();
        }
      }
    }
    return getCreateMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "update",
          requestType = muni.model.Model.Case.class,
          responseType = muni.model.Model.Case.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Case,
          muni.model.Model.Case> getUpdateMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Case, muni.model.Model.Case> getUpdateMethod;
    if ((getUpdateMethod = CaseServiceGrpc.getUpdateMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getUpdateMethod = CaseServiceGrpc.getUpdateMethod) == null) {
          CaseServiceGrpc.getUpdateMethod = getUpdateMethod =
                  io.grpc.MethodDescriptor.<muni.model.Model.Case, muni.model.Model.Case>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  muni.model.Model.Case.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  muni.model.Model.Case.getDefaultInstance()))
                          .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("update"))
                          .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub>() {
              @java.lang.Override
              public CaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CaseServiceStub(channel, callOptions);
              }
            };
    return CaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CaseServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub>() {
              @java.lang.Override
              public CaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CaseServiceFutureStub(channel, callOptions);
              }
            };
    return CaseServiceFutureStub.newStub(factory, channel);
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new CaseServiceFileDescriptorSupplier())
                  .addMethod(getGetMethod())
                  .addMethod(getCreateMethod())
                  .addMethod(getUpdateMethod())
                  .build();
        }
      }
    }
    return result;
  }

  /**
   */
  public static abstract class CaseServiceImplBase implements io.grpc.BindableService {

    /**
     *
     */
    public void get(muni.model.MuniService.ById request,
                    io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     *
     */
    public void create(muni.model.Model.Case request,
                       io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     *
     */
    public void update(muni.model.Model.Case request,
                       io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getGetMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      muni.model.MuniService.ById,
                                      muni.model.Model.Case>(
                                      this, METHODID_GET)))
              .addMethod(
                      getCreateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      muni.model.Model.Case,
                                      muni.model.Model.Case>(
                                      this, METHODID_CREATE)))
              .addMethod(
                      getUpdateMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      muni.model.Model.Case,
                                      muni.model.Model.Case>(
                                      this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class CaseServiceStub extends io.grpc.stub.AbstractAsyncStub<CaseServiceStub> {
    private CaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(muni.model.MuniService.ById request,
        io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     */
    public void create(muni.model.Model.Case request,
                       io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     */
    public void update(muni.model.Model.Case request,
                       io.grpc.stub.StreamObserver<muni.model.Model.Case> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CaseServiceBlockingStub> {
    private CaseServiceBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public muni.model.Model.Case get(muni.model.MuniService.ById request) {
      return blockingUnaryCall(
              getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public muni.model.Model.Case create(muni.model.Model.Case request) {
      return blockingUnaryCall(
              getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public muni.model.Model.Case update(muni.model.Model.Case request) {
      return blockingUnaryCall(
              getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CaseServiceFutureStub> {
    private CaseServiceFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceFutureStub(channel, callOptions);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Case> get(
            muni.model.MuniService.ById request) {
      return futureUnaryCall(
              getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Case> create(
            muni.model.Model.Case request) {
      return futureUnaryCall(
              getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Case> update(
            muni.model.Model.Case request) {
      return futureUnaryCall(
              getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((muni.model.MuniService.ById) request,
                  (io.grpc.stub.StreamObserver<muni.model.Model.Case>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((muni.model.Model.Case) request,
                  (io.grpc.stub.StreamObserver<muni.model.Model.Case>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((muni.model.Model.Case) request,
                  (io.grpc.stub.StreamObserver<muni.model.Model.Case>) responseObserver);
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

  private static abstract class CaseServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CaseServiceBaseDescriptorSupplier() {
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return muni.model.MuniService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CaseService");
    }
  }

  private static final class CaseServiceFileDescriptorSupplier
          extends CaseServiceBaseDescriptorSupplier {
    CaseServiceFileDescriptorSupplier() {
    }
  }

  private static final class CaseServiceMethodDescriptorSupplier
          extends CaseServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CaseServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
}
