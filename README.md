# Java 10 features


## Local Variable Type Inference
```
    var name = "John"
    var index = 1
    var users = List.of("John", "Mike")
```
[Example 1](https://github.com/amossoma/java-features/blob/java-10/src/main/java/Example1.java)

## Unmodifiable Collections
```
    List.copyOf
    Set.copyOf
    Map.copyOf
    Collectors.to

```
[Example 2](https://github.com/amossoma/java-features/blob/java-10/src/main/java/Example2.java)

## Optional*.orElseThrow()
Throws NoSuchElementException if no value is present.
```
    Optional.orElseThrow()
    OptionalDouble.orElseThrow()
    OptionalInt.orElseThrow()
    OptionalLong.orElseThrow()
```
[Example 3](https://github.com/amossoma/java-features/blob/java-10/src/main/java/Example3.java)

## Performance Improvements

* Parallel Full GC for G1
* Application Class-Data Sharing (AppCDS) _,,allows a set of classes to be pre-processed into a shared archive file that can then be memory-mapped at runtime to reduce startup time which can also reduce dynamic memory footprint when multiple JVMs share the same archive file''_. AppCDS was a commercial feature in Oracle JDK for JDK 8 and JDK 9.
* Experimental Java-Based JIT Compiler

## Container Awareness (_linux only_)
JVMs are now aware of being run in a Docker container. Java flags:
```
    -XX:-UseContainerSupport
    -XX:ActiveProcessorCount
    -XX:InitialRAMPercentage
    -XX:MaxRAMPercentage
    -XX:MinRAMPercentage
``` 

## Root Certificates
Oracle has open-sourced the root certificates in Oracle’s Java SE Root CA program in order to make OpenJDK builds more attractive to developers and to reduce the differences between those builds and Oracle JDK builds.

## Deprecations 
* java.security.acl
* java.security.Certificate
* java.security.Identity
* java.security.IdentityScope
* java.security.Signer

## Removals
* _javah_ tool -> _javac -h_
* _policytool_ tool
* _-Xprof_ java option

## Time-Based Release Versioning
Oracle has moved to the time-based release of Java:

* A new Java release every six months. The March 2018 release is JDK 10, the September 2018 release is JDK 11, ...
* Support for the feature release will last only for six months, i.e., until next feature release
* Long-term support release will be marked as LTS. Support for such release will be for three years
* Java 11 will be an LTS release

[[link](http://openjdk.java.net/jeps/322)]