# Java 9 features


## Java 9 REPL (JShell)
```
    amos@ncc-1701e:~$ jshell
    |  Welcome to JShell -- Version 11.0.1
    |  For an introduction type: /help intro
    
    jshell> System.out.println("Hello World!!!");
    Hello World!!!
    
    jshell>
```

## Factory Methods for Immutable List, Set, Map and Map.Entry
```
    List.of(...)
    Set.of(...)
    Map.of(...)
```
[Example 1](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example1.java)

## Private methods in Interfaces
```
    public interface SomeInterface {
        ...
        private void privateMethod() {
            System.out.println("Hello World!!!");
        }
        ...
    }
```
[Example 2](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example3.java)

## Java 9 Module System
Divides everything into modules (like OSGI). Modules are described in module-info.java
```
    module com.greetings {
        requires org.astro;
    }
```
To show java modules type: 
```
    java --list-modules
```

## Process API Improvements
Better controlling and managing processes. Two new interfaces:
```
    java.lang.ProcessHandle
    java.lang.ProcessHandle.Info
```
[Example 3](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example3.java)

## Try With Resources Improvement
It's possible to use previously declared variable.
```
    ...
    try(variable) {
    ...
    }
    ...
```
[Example 4](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example4.java)

## CompletableFuture API Improvements
New methods: 
```
    Executor defaultExecutor()
    CompletableFuture<U> newIncompleteFuture()
    CompletableFuture<T> copy()
    CompletionStage<T> minimalCompletionStage()
    CompletableFuture<T> completeAsync(Supplier<? extends T> supplier, Executor executor)
    CompletableFuture<T> completeAsync(Supplier<? extends T> supplier)
    CompletableFuture<T> orTimeout(long timeout, TimeUnit unit)
    CompletableFuture<T> completeOnTimeout(T value, long timeout, TimeUnit unit)
```
[Example 5](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example5.java)

## Reactive Streams
New reactive API
```
    java.util.concurrent.Flow
    java.util.concurrent.Flow.Publisher
    java.util.concurrent.Flow.Subscriber
    java.util.concurrent.Flow.Processor
```
[Example 6](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example6.java)

## Diamond Operator for Anonymous Inner Class
```
    new InnerClass<Integer>() {
    ...
    }
```
[Example 7](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example7.java)

## Optional Class Improvements
New methods for Optional class
```
    stream()
    ifPresentOrElse()
    or()
```
[Example 8](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example8.java)

## Stream API Improvements
```
    takeWhile()
    dropWhile()
    iterate()
    ofNullable()
```
[Example 9](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example9.java)

## Enhanced @Deprecated annotation
New parameters for annotation:
```
    @Deprecated(since = "2.8", forRemoval = true)
```

## HTTP 2 Client
[Example 10](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example10.java)

## Multi-Resolution Image API
[Example 11](https://github.com/amossoma/java-features/blob/java-9/src/main/java/Example11.java)

## Miscellaneous Java 9 Features
* Improved Javadoc (HTML5, Search) [[link](http://openjdk.java.net/jeps/299)]
* Garbage Collector improvements [[link](https://openjdk.java.net/jeps/248), [link](https://openjdk.java.net/jeps/318)]
* API for walking in Stack [[link](http://openjdk.java.net/jeps/259)]
* Filter Incoming Serialization Data [[link](https://openjdk.java.net/jeps/290)]
* Deprecate the Applet API [[link](https://openjdk.java.net/jeps/289)]
* Indify String Concatenation [[link](https://openjdk.java.net/jeps/280)]
* Enhanced Method Handles [[link](http://openjdk.java.net/jeps/193)]
* Java Platform Logging API and Service [[link](https://openjdk.java.net/jeps/264)]
* Compact Strings [[link](https://openjdk.java.net/jeps/254)]
* Parser API for Nashorn [[link](https://openjdk.java.net/jeps/236)]
