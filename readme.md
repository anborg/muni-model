

Steps To modify model objects:

1. Edit the proto file - eg add model , or add se
2. Reinstall the "model-gen" jar files, by running "mvn install"
3. Your impl project must have latest changes.



To create an app

mvn io.quarkus:quarkus-maven-plugin:1.8.1.Final:create -DprojectGroupId=muni -DprojectArtifactId=app-mkm-rest -DprojectVersion=1.0.0 -DclassName="app.CoreResource"



muni-model.proto
muni-service.proto

Add this dependency to your pom

```xml
    <dependency>
      <groupId>muni</groupId>
      <artifactId>model-gen</artifactId>
      <version>${muni-model.version}</version>
    </dependency>
```

For quarkus bean registration add this to application.properties

```properties
quarkus.index-dependency.mygrpc.group-id=muni
quarkus.index-dependency.mygrpc.artifact-id=model-gen
```