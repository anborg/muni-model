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
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "muni.model.SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<muni.model.MuniService.SearchReqPerson,
      muni.model.MuniService.SearchRes> getPersonsLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "personsLike",
      requestType = muni.model.MuniService.SearchReqPerson.class,
      responseType = muni.model.MuniService.SearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<muni.model.MuniService.SearchReqPerson,
      muni.model.MuniService.SearchRes> getPersonsLikeMethod() {
    io.grpc.MethodDescriptor<muni.model.MuniService.SearchReqPerson, muni.model.MuniService.SearchRes> getPersonsLikeMethod;
    if ((getPersonsLikeMethod = SearchServiceGrpc.getPersonsLikeMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getPersonsLikeMethod = SearchServiceGrpc.getPersonsLikeMethod) == null) {
          SearchServiceGrpc.getPersonsLikeMethod = getPersonsLikeMethod =
              io.grpc.MethodDescriptor.<muni.model.MuniService.SearchReqPerson, muni.model.MuniService.SearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "personsLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.SearchReqPerson.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  muni.model.MuniService.SearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("personsLike"))
              .build();
        }
      }
    }
    return getPersonsLikeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub>() {
        @java.lang.Override
        public SearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceStub(channel, callOptions);
        }
      };
    return SearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub>() {
        @java.lang.Override
        public SearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub>() {
        @java.lang.Override
        public SearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceFutureStub(channel, callOptions);
        }
      };
    return SearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void personsLike(muni.model.MuniService.SearchReqPerson request,
        io.grpc.stub.StreamObserver<muni.model.MuniService.SearchRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPersonsLikeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPersonsLikeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                muni.model.MuniService.SearchReqPerson,
                muni.model.MuniService.SearchRes>(
                  this, METHODID_PERSONS_LIKE)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchServiceStub> {
    private SearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void personsLike(muni.model.MuniService.SearchReqPerson request,
        io.grpc.stub.StreamObserver<muni.model.MuniService.SearchRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPersonsLikeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public muni.model.MuniService.SearchRes personsLike(muni.model.MuniService.SearchReqPerson request) {
      return blockingUnaryCall(
          getChannel(), getPersonsLikeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<muni.model.MuniService.SearchRes> personsLike(
        muni.model.MuniService.SearchReqPerson request) {
      return futureUnaryCall(
          getChannel().newCall(getPersonsLikeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PERSONS_LIKE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERSONS_LIKE:
          serviceImpl.personsLike((muni.model.MuniService.SearchReqPerson) request,
              (io.grpc.stub.StreamObserver<muni.model.MuniService.SearchRes>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return muni.model.MuniService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getPersonsLikeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
