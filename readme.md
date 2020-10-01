mvn install:install-file -DgroupId=com.google.protobuf -DartifactId=protoc -Dversion=3.13.0 -Dclassifier=${os.detected.classifier} -Dpackaging=exe -Dfile=C:/apps/google/protoc-3.13.0/bin/protoc.exe

mvn install:install-file -DgroupId=io.grpc -DartifactId=protoc-gen-grpc-java -Dversion=1.32.1 -Dclassifier=${os.detected.classifier} -Dpackaging=exe -Dfile=C:/apps/google/protoc-3.13.0/bin/protoc-gen-grpc-java-1.32.1.exe



protoc -I=./ --java_out=./ hello.proto


protoc --proto_path=src --java_out=zgen/proto/java schema/proto/muni.proto


Install log 
```log

C:\dev_space\api-muni>mvn install
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom (4.3 kB at 6.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar (20 kB at 146 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] Detecting the operating system and CPU architecture
[INFO] ------------------------------------------------------------------------
[INFO] os.detected.name: windows
[INFO] os.detected.arch: x86_64
[INFO] os.detected.version: 10.0
[INFO] os.detected.version.major: 10
[INFO] os.detected.version.minor: 0
[INFO] os.detected.classifier: windows-x86_64
[INFO]
[INFO] -------------------------< muni.api:api-muni >--------------------------
[INFO] Building model 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.11.1/protobuf-java-3.11.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.11.1/protobuf-java-3.11.1.pom (5.6 kB at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.11.1/protobuf-java-util-3.11.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.11.1/protobuf-java-util-3.11.1.pom (4.8 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.1-android/guava-28.1-android.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.1-android/guava-28.1-android.pom (8.7 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.pom (2.4 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-g
uava.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-gu
ava.pom (2.3 kB at 13 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-compat-qual/2.5.5/checker-compat-qual-2.5.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-compat-qual/2.5.5/checker-compat-qual-2.5.5.pom (2.7 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.pom (2.8 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.18/animal-sniffer-annotations-1.18.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.18/animal-sniffer-annotations-1.18.pom (2.6 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.3/error_prone_annotations-2.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.3/error_prone_annotations-2.3.3.pom (1.8 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.6/gson-2.8.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.6/gson-2.8.6.pom (2.5 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.11.1/protobuf-java-3.11.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-g
uava.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.1-android/guava-28.1-android.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.11.1/protobuf-java-util-3.11.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-gu
ava.jar (2.2 kB at 4.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-compat-qual/2.5.5/checker-compat-qual-2.5.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar (4.6 kB at 7.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-compat-qual/2.5.5/checker-compat-qual-2.5.5.jar (5.9 kB at 7.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.18/animal-sniffer-annotations-1.18.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar (8.8 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.3/error_prone_annotations-2.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.18/animal-sniffer-annotations-1.18.jar (3.5 kB at 3.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.6/gson-2.8.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.3.3/error_prone_annotations-2.3.3.jar (13 kB at 11 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.11.1/protobuf-java-util-3.11.1.jar (74 kB at 51 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.8.6/gson-2.8.6.jar (240 kB at 99 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.11.1/protobuf-java-3.11.1.jar (1.7 MB at 402 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/28.1-android/guava-28.1-android.jar (2.6 MB at 453 kB/s)
[INFO]
[INFO] --- build-helper-maven-plugin:3.0.0:add-source (add-source) @ api-muni ---
[INFO] Source directory: C:\dev_space\api-muni\src\zgen\proto\java added.
[INFO]
[INFO] --- protobuf-maven-plugin:0.6.1:compile (default) @ api-muni ---
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.13.0/protoc-3.13.0-windows-x86_64.exe
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.13.0/protoc-3.13.0-windows-x86_64.exe (3.7 MB at 1.0 MB/s)
[INFO] Compiling 1 proto file(s) to C:\dev_space\api-muni\src\main\java
[INFO]
[INFO] --- protobuf-maven-plugin:0.6.1:compile-custom (default) @ api-muni ---
[INFO] Compiling 1 proto file(s) to C:\dev_space\api-muni\src\main\java
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ api-muni ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ api-muni ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\dev_space\api-muni\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ api-muni ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\dev_space\api-muni\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ api-muni ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ api-muni ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ api-muni ---
[INFO] Building jar: C:\dev_space\api-muni\target\api-muni-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ api-muni ---
[INFO] Installing C:\dev_space\api-muni\target\api-muni-1.0-SNAPSHOT.jar to C:\Users\PNataraj\.m2\repository\muni\api\api-muni\1.0-SNAPSHOT\api-muni-1.0-SNAPSHOT.jar
[INFO] Installing C:\dev_space\api-muni\pom.xml to C:\Users\PNataraj\.m2\repository\muni\api\api-muni\1.0-SNAPSHOT\api-muni-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  23.056 s
[INFO] Finished at: 2020-09-30T23:38:13-04:00
[INFO] ------------------------------------------------------------------------


```