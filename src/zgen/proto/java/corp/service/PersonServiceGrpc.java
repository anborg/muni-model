package corp.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: person-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "corp.model.PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<corp.model.ById,
      corp.model.Person> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = corp.model.ById.class,
      responseType = corp.model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.ById,
      corp.model.Person> getGetMethod() {
    io.grpc.MethodDescriptor<corp.model.ById, corp.model.Person> getGetMethod;
    if ((getGetMethod = PersonServiceGrpc.getGetMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetMethod = PersonServiceGrpc.getGetMethod) == null) {
          PersonServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<corp.model.ById, corp.model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.ById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Person,
      corp.model.Person> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = corp.model.Person.class,
      responseType = corp.model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Person,
      corp.model.Person> getCreateMethod() {
    io.grpc.MethodDescriptor<corp.model.Person, corp.model.Person> getCreateMethod;
    if ((getCreateMethod = PersonServiceGrpc.getCreateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getCreateMethod = PersonServiceGrpc.getCreateMethod) == null) {
          PersonServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<corp.model.Person, corp.model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Person,
      corp.model.Person> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = corp.model.Person.class,
      responseType = corp.model.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Person,
      corp.model.Person> getUpdateMethod() {
    io.grpc.MethodDescriptor<corp.model.Person, corp.model.Person> getUpdateMethod;
    if ((getUpdateMethod = PersonServiceGrpc.getUpdateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getUpdateMethod = PersonServiceGrpc.getUpdateMethod) == null) {
          PersonServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<corp.model.Person, corp.model.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Person.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefAdd",
      requestType = corp.model.Xref.class,
      responseType = corp.model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefAddMethod() {
    io.grpc.MethodDescriptor<corp.model.Xref, corp.model.Xref> getXrefAddMethod;
    if ((getXrefAddMethod = PersonServiceGrpc.getXrefAddMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefAddMethod = PersonServiceGrpc.getXrefAddMethod) == null) {
          PersonServiceGrpc.getXrefAddMethod = getXrefAddMethod =
              io.grpc.MethodDescriptor.<corp.model.Xref, corp.model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefAdd"))
              .build();
        }
      }
    }
    return getXrefAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefUpdate",
      requestType = corp.model.Xref.class,
      responseType = corp.model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefUpdateMethod() {
    io.grpc.MethodDescriptor<corp.model.Xref, corp.model.Xref> getXrefUpdateMethod;
    if ((getXrefUpdateMethod = PersonServiceGrpc.getXrefUpdateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefUpdateMethod = PersonServiceGrpc.getXrefUpdateMethod) == null) {
          PersonServiceGrpc.getXrefUpdateMethod = getXrefUpdateMethod =
              io.grpc.MethodDescriptor.<corp.model.Xref, corp.model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefUpdate"))
              .build();
        }
      }
    }
    return getXrefUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xrefSync",
      requestType = corp.model.Xref.class,
      responseType = corp.model.Xref.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Xref,
      corp.model.Xref> getXrefSyncMethod() {
    io.grpc.MethodDescriptor<corp.model.Xref, corp.model.Xref> getXrefSyncMethod;
    if ((getXrefSyncMethod = PersonServiceGrpc.getXrefSyncMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getXrefSyncMethod = PersonServiceGrpc.getXrefSyncMethod) == null) {
          PersonServiceGrpc.getXrefSyncMethod = getXrefSyncMethod =
              io.grpc.MethodDescriptor.<corp.model.Xref, corp.model.Xref>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "xrefSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Xref.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("xrefSync"))
              .build();
        }
      }
    }
    return getXrefSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      corp.service.PersonServices.PersonList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = corp.service.PersonServices.PersonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      corp.service.PersonServices.PersonList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, corp.service.PersonServices.PersonList> getGetAllMethod;
    if ((getGetAllMethod = PersonServiceGrpc.getGetAllMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetAllMethod = PersonServiceGrpc.getGetAllMethod) == null) {
          PersonServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, corp.service.PersonServices.PersonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.service.PersonServices.PersonList.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.service.PersonServices.SearchReqPerson,
      corp.service.PersonServices.SearchRes> getPersonsLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "personsLike",
      requestType = corp.service.PersonServices.SearchReqPerson.class,
      responseType = corp.service.PersonServices.SearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.service.PersonServices.SearchReqPerson,
      corp.service.PersonServices.SearchRes> getPersonsLikeMethod() {
    io.grpc.MethodDescriptor<corp.service.PersonServices.SearchReqPerson, corp.service.PersonServices.SearchRes> getPersonsLikeMethod;
    if ((getPersonsLikeMethod = PersonServiceGrpc.getPersonsLikeMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getPersonsLikeMethod = PersonServiceGrpc.getPersonsLikeMethod) == null) {
          PersonServiceGrpc.getPersonsLikeMethod = getPersonsLikeMethod =
              io.grpc.MethodDescriptor.<corp.service.PersonServices.SearchReqPerson, corp.service.PersonServices.SearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "personsLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.service.PersonServices.SearchReqPerson.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.service.PersonServices.SearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("personsLike"))
              .build();
        }
      }
    }
    return getPersonsLikeMethod;
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
  public interface AsyncService {

    /**
     */
    default void get(corp.model.ById request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    default void create(corp.model.Person request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void update(corp.model.Person request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    default void xrefAdd(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getXrefAddMethod(), responseObserver);
    }

    /**
     */
    default void xrefUpdate(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getXrefUpdateMethod(), responseObserver);
    }

    /**
     */
    default void xrefSync(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getXrefSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    default void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<corp.service.PersonServices.PersonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    default void personsLike(corp.service.PersonServices.SearchReqPerson request,
        io.grpc.stub.StreamObserver<corp.service.PersonServices.SearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPersonsLikeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PersonService.
   */
  public static abstract class PersonServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PersonServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PersonService.
   */
  public static final class PersonServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PersonServiceStub> {
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
    public void get(corp.model.ById request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public void create(corp.model.Person request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(corp.model.Person request,
        io.grpc.stub.StreamObserver<corp.model.Person> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public void xrefAdd(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getXrefAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void xrefUpdate(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getXrefUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void xrefSync(corp.model.Xref request,
        io.grpc.stub.StreamObserver<corp.model.Xref> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getXrefSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<corp.service.PersonServices.PersonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void personsLike(corp.service.PersonServices.SearchReqPerson request,
        io.grpc.stub.StreamObserver<corp.service.PersonServices.SearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPersonsLikeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PersonService.
   */
  public static final class PersonServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PersonServiceBlockingStub> {
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
    public corp.model.Person get(corp.model.ById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public corp.model.Person create(corp.model.Person request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.model.Person update(corp.model.Person request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public corp.model.Xref xrefAdd(corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getXrefAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.model.Xref xrefUpdate(corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getXrefUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.model.Xref xrefSync(corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getXrefSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public corp.service.PersonServices.PersonList getAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.service.PersonServices.SearchRes personsLike(corp.service.PersonServices.SearchReqPerson request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPersonsLikeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PersonService.
   */
  public static final class PersonServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PersonServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Person> get(
        corp.model.ById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *TODO change to CreateReq - generic?
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Person> create(
        corp.model.Person request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Person> update(
        corp.model.Person request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Xref - will be included in Person, so no GET. Not "resty"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Xref> xrefAdd(
        corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getXrefAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Xref> xrefUpdate(
        corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getXrefUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Xref> xrefSync(
        corp.model.Xref request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getXrefSyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.service.PersonServices.PersonList> getAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.service.PersonServices.SearchRes> personsLike(
        corp.service.PersonServices.SearchReqPerson request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPersonsLikeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_XREF_ADD = 3;
  private static final int METHODID_XREF_UPDATE = 4;
  private static final int METHODID_XREF_SYNC = 5;
  private static final int METHODID_GET_ALL = 6;
  private static final int METHODID_PERSONS_LIKE = 7;

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
        case METHODID_GET:
          serviceImpl.get((corp.model.ById) request,
              (io.grpc.stub.StreamObserver<corp.model.Person>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((corp.model.Person) request,
              (io.grpc.stub.StreamObserver<corp.model.Person>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((corp.model.Person) request,
              (io.grpc.stub.StreamObserver<corp.model.Person>) responseObserver);
          break;
        case METHODID_XREF_ADD:
          serviceImpl.xrefAdd((corp.model.Xref) request,
              (io.grpc.stub.StreamObserver<corp.model.Xref>) responseObserver);
          break;
        case METHODID_XREF_UPDATE:
          serviceImpl.xrefUpdate((corp.model.Xref) request,
              (io.grpc.stub.StreamObserver<corp.model.Xref>) responseObserver);
          break;
        case METHODID_XREF_SYNC:
          serviceImpl.xrefSync((corp.model.Xref) request,
              (io.grpc.stub.StreamObserver<corp.model.Xref>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<corp.service.PersonServices.PersonList>) responseObserver);
          break;
        case METHODID_PERSONS_LIKE:
          serviceImpl.personsLike((corp.service.PersonServices.SearchReqPerson) request,
              (io.grpc.stub.StreamObserver<corp.service.PersonServices.SearchRes>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.ById,
              corp.model.Person>(
                service, METHODID_GET)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Person,
              corp.model.Person>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Person,
              corp.model.Person>(
                service, METHODID_UPDATE)))
        .addMethod(
          getXrefAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Xref,
              corp.model.Xref>(
                service, METHODID_XREF_ADD)))
        .addMethod(
          getXrefUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Xref,
              corp.model.Xref>(
                service, METHODID_XREF_UPDATE)))
        .addMethod(
          getXrefSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Xref,
              corp.model.Xref>(
                service, METHODID_XREF_SYNC)))
        .addMethod(
          getGetAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              corp.service.PersonServices.PersonList>(
                service, METHODID_GET_ALL)))
        .addMethod(
          getPersonsLikeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.service.PersonServices.SearchReqPerson,
              corp.service.PersonServices.SearchRes>(
                service, METHODID_PERSONS_LIKE)))
        .build();
  }

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return corp.service.PersonServices.getDescriptor();
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
              .addMethod(getPersonsLikeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
