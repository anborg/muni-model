// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: case-service.proto

package corp.service;

public final class CaseServices {
  private CaseServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022case-service.proto\022\ncorp.model\032\034google" +
      "/api/annotations.proto\032\025google/api/http." +
      "proto\032\033google/protobuf/empty.proto\032\037goog" +
      "le/protobuf/timestamp.proto\032\0230_corp-mode" +
      "ls.proto2\324\002\n\013CaseService\022L\n\003get\022\020.corp.m" +
      "odel.ById\032\020.corp.model.Case\"!\202\323\344\223\002\033\022\031/mk" +
      "app/rest/v1/cases/{id}\022P\n\006create\022\020.corp." +
      "model.Case\032\020.corp.model.Case\"\"\202\323\344\223\002\034\"\024/m" +
      "kapp/rest/v1/cases:\004case\022O\n\006update\022\020.cor" +
      "p.model.Case\032\020.corp.model.Case\"!\202\323\344\223\002\033\"\023" +
      "/mkapp/rest/v1/case:\004case\022T\n\006getAll\022\026.go" +
      "ogle.protobuf.Empty\032\024.corp.model.CaseLis" +
      "t\"\034\202\323\344\223\002\026\022\024/mkapp/rest/v1/casesB!\n\014corp." +
      "serviceB\014CaseServicesP\000\210\001\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          corp.model.Model.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    corp.model.Model.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
