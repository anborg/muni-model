package muni.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: muni-service.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "muni.model.PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<muni.model.MuniService.ById,
      muni.model.Model.Person> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = muni.model.MuniService.ById.class,
      responseType = muni.model.Model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.MuniService.ById,
      muni.model.Model.Person> getGetMethod() {
    io.grpc.MethodDescriptor<muni.model.MuniService.ById, muni.model.Model.Person> getGetMethod;
    if ((getGetMethod = PersonServiceGrpc.getGetMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetMethod = PersonServiceGrpc.getGetMethod) == null) {
          PersonServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<muni.model.MuniService.ById, muni.model.Model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.ById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.MuniService.CreatePersonReq,
      muni.model.Model.Person> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = muni.model.MuniService.CreatePersonReq.class,
      responseType = muni.model.Model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.MuniService.CreatePersonReq,
      muni.model.Model.Person> getCreateMethod() {
    io.grpc.MethodDescriptor<muni.model.MuniService.CreatePersonReq, muni.model.Model.Person> getCreateMethod;
    if ((getCreateMethod = PersonServiceGrpc.getCreateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getCreateMethod = PersonServiceGrpc.getCreateMethod) == null) {
          PersonServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<muni.model.MuniService.CreatePersonReq, muni.model.Model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.CreatePersonReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Person,
      muni.model.Model.Person> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = muni.model.Model.Person.class,
      responseType = muni.model.Model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Person,
      muni.model.Model.Person> getUpdateMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Person, muni.model.Model.Person> getUpdateMethod;
    if ((getUpdateMethod = PersonServiceGrpc.getUpdateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getUpdateMethod = PersonServiceGrpc.getUpdateMethod) == null) {
          PersonServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<muni.model.Model.Person, muni.model.Model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefAdd",
      requestType = muni.model.Model.Xref.class,
      responseType = muni.model.Model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefAddMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Xref, muni.model.Model.Xref> getXrefAddMethod;
    if ((getXrefAddMethod = PersonServiceGrpc.getXrefAddMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefAddMethod = PersonServiceGrpc.getXrefAddMethod) == null) {
          PersonServiceGrpc.getXrefAddMethod = getXrefAddMethod =
              io.grpc.MethodDescriptor.<muni.model.Model.Xref, muni.model.Model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefAdd"))
              .build();
        }
      }
    }
    return getXrefAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefUpdate",
      requestType = muni.model.Model.Xref.class,
      responseType = muni.model.Model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefUpdateMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Xref, muni.model.Model.Xref> getXrefUpdateMethod;
    if ((getXrefUpdateMethod = PersonServiceGrpc.getXrefUpdateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefUpdateMethod = PersonServiceGrpc.getXrefUpdateMethod) == null) {
          PersonServiceGrpc.getXrefUpdateMethod = getXrefUpdateMethod =
              io.grpc.MethodDescriptor.<muni.model.Model.Xref, muni.model.Model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefUpdate"))
              .build();
        }
      }
    }
    return getXrefUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefSync",
      requestType = muni.model.Model.Xref.class,
      responseType = muni.model.Model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.Model.Xref,
      muni.model.Model.Xref> getXrefSyncMethod() {
    io.grpc.MethodDescriptor<muni.model.Model.Xref, muni.model.Model.Xref> getXrefSyncMethod;
    if ((getXrefSyncMethod = PersonServiceGrpc.getXrefSyncMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefSyncMethod = PersonServiceGrpc.getXrefSyncMethod) == null) {
          PersonServiceGrpc.getXrefSyncMethod = getXrefSyncMethod =
              io.grpc.MethodDescriptor.<muni.model.Model.Xref, muni.model.Model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.Model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefSync"))
              .build();
        }
      }
    }
    return getXrefSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      muni.model.MuniService.PersonList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = muni.model.MuniService.PersonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      muni.model.MuniService.PersonList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, muni.model.MuniService.PersonList> getGetAllMethod;
    if ((getGetAllMethod = PersonServiceGrpc.getGetAllMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetAllMethod = PersonServiceGrpc.getGetAllMethod) == null) {
          PersonServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, muni.model.MuniService.PersonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.PersonList.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub>() {
        @java.lang.Override
        public PersonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceStub(channel, callOptions);
        }
      };
    return PersonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub>() {
        @java.lang.Override
        public PersonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceBlockingStub(channel, callOptions);
        }
      };
    return PersonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub>() {
        @java.lang.Override
        public PersonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceFutureStub(channel, callOptions);
        }
      };
    return PersonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(muni.model.MuniService.ById request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public void create(muni.model.MuniService.CreatePersonReq request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(muni.model.Model.Person request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public void xrefAdd(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnimplementedUnaryCall(getXrefAddMethod(), responseObserver);
    }

    /**
     */
    public void xrefUpdate(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnimplementedUnaryCall(getXrefUpdateMethod(), responseObserver);
    }

    /**
     */
    public void xrefSync(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnimplementedUnaryCall(getXrefSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<muni.model.MuniService.PersonList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.MuniService.ById,
                muni.model.Model.Person>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.MuniService.CreatePersonReq,
                muni.model.Model.Person>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.Model.Person,
                muni.model.Model.Person>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getXrefAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.Model.Xref,
                muni.model.Model.Xref>(
                  this, METHODID_XREF_ADD)))
          .addMethod(
            getXrefUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.Model.Xref,
                muni.model.Model.Xref>(
                  this, METHODID_XREF_UPDATE)))
          .addMethod(
            getXrefSyncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.Model.Xref,
                muni.model.Model.Xref>(
                  this, METHODID_XREF_SYNC)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                muni.model.MuniService.PersonList>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractAsyncStub<PersonServiceStub> {
    private PersonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(muni.model.MuniService.ById request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public void create(muni.model.MuniService.CreatePersonReq request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(muni.model.Model.Person request,
        io.grpc.stub.StreamObserver<muni.model.Model.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public void xrefAdd(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getXrefAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void xrefUpdate(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getXrefUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void xrefSync(muni.model.Model.Xref request,
        io.grpc.stub.StreamObserver<muni.model.Model.Xref> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getXrefSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<muni.model.MuniService.PersonList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public muni.model.Model.Person get(muni.model.MuniService.ById request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public muni.model.Model.Person create(muni.model.MuniService.CreatePersonReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public muni.model.Model.Person update(muni.model.Model.Person request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public muni.model.Model.Xref xrefAdd(muni.model.Model.Xref request) {
      return blockingUnaryCall(
          getChannel(), getXrefAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public muni.model.Model.Xref xrefUpdate(muni.model.Model.Xref request) {
      return blockingUnaryCall(
          getChannel(), getXrefUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public muni.model.Model.Xref xrefSync(muni.model.Model.Xref request) {
      return blockingUnaryCall(
          getChannel(), getXrefSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public muni.model.MuniService.PersonList getAll(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Person> get(
        muni.model.MuniService.ById request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Person> create(
        muni.model.MuniService.CreatePersonReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Person> update(
        muni.model.Model.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Xref> xrefAdd(
        muni.model.Model.Xref request) {
      return futureUnaryCall(
          getChannel().newCall(getXrefAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Xref> xrefUpdate(
        muni.model.Model.Xref request) {
      return futureUnaryCall(
          getChannel().newCall(getXrefUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.Model.Xref> xrefSync(
        muni.model.Model.Xref request) {
      return futureUnaryCall(
          getChannel().newCall(getXrefSyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.MuniService.PersonList> getAll(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_XREF_ADD = 3;
  private static final int METHODID_XREF_UPDATE = 4;
  private static final int METHODID_XREF_SYNC = 5;
  private static final int METHODID_GET_ALL = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((muni.model.MuniService.ById) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Person>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((muni.model.MuniService.CreatePersonReq) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Person>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((muni.model.Model.Person) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Person>) responseObserver);
          break;
        case METHODID_XREF_ADD:
          serviceImpl.xrefAdd((muni.model.Model.Xref) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Xref>) responseObserver);
          break;
        case METHODID_XREF_UPDATE:
          serviceImpl.xrefUpdate((muni.model.Model.Xref) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Xref>) responseObserver);
          break;
        case METHODID_XREF_SYNC:
          serviceImpl.xrefSync((muni.model.Model.Xref) request,
              (io.grpc.stub.StreamObserver<muni.model.Model.Xref>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<muni.model.MuniService.PersonList>) responseObserver);
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return muni.model.MuniService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getXrefAddMethod())
              .addMethod(getXrefUpdateMethod())
              .addMethod(getXrefSyncMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
