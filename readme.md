

Steps To modify model objects:

1. Edit the proto file
2. Regenerate java objects by running "mvn install"
3. Edit the Junit tests to modify



To create an app

mvn io.quarkus:quarkus-maven-plugin:1.8.1.Final:create -DprojectGroupId=muni -DprojectArtifactId=app-mkm-rest -DprojectVersion=1.0.0 -DclassName="app.CoreResource"