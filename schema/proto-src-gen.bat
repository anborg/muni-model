

:: onetme execution
:: cd %GOPATH%\src
:: git clone https://github.com/grpc-ecosystem/grpc-gateway.git
:: go get github.com/grpc-ecosystem/grpc-gateway/..
:: For "allow_proto3_optional", ref: https://chromium.googlesource.com/external/github.com/protocolbuffers/protobuf/+/refs/tags/v3.13.0/docs/field_presence.md

set PROJ_DIR=C:\data\proj-mkm\muni-model
set INPUT_DIR=%PROJ_DIR%\schema\proto
set SRCGEN_DIR=%PROJ_DIR%\src\zgen\proto\java
set PROTOC_HOME=C:\apps\google\protoc-3.13.0
set PROTOC_BIN=%PROTOC_HOME%\bin\protoc.exe
set PROTOC_INCLUDE=%PROTOC_HOME%\include
set PLUGIN_CONFIG=%PROTOC_HOME%\protoc-gen-grpc-java-1.32.1.exe
:: set PROTOC_JAVA_BIN=C:\apps\google\protoc-3.13.0\bin\protoc-gen-grpc-java-1.32.1.exe

:: Add this if OPtioal required --experimental_allow_proto3_optional
%PROTOC_BIN% -I%PROTOC_INCLUDE%\ -I%GOPATH%\src\github.com\grpc-ecosystem\grpc-gateway\third_party\googleapis   --plugin=%PLUGIN_CONFIG% --grpc-java_out=%SRCGEN_DIR% --proto_path=%INPUT_DIR% --java_out=%SRCGEN_DIR% %INPUT_DIR%\muni-service.proto %INPUT_DIR%\muni-model.proto
echo off
echo !!!!!!!!!!!!!!!!!!!!!!!!! DO NOT FORGET !!!!!!!!!!!!!!!!!!!!!!!!!!
echo !!                                                              !!
echo !!  Add @JsonSerialize(using = SerializerGeneric.class)         !!
echo !!      @JsonDeserialize(using = DeserializeSearchRequest.class)!!
echo !!      public  static final class SearchRequest extends        !!
echo !!                                                              !!
echo !!!!!!!!!!!!!!!!! Add Json annotation to api objects     !!!!!!!!!
pause