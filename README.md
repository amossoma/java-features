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
## Java 9 Module System
## Process API Improvements
Better controlling and managing processes. Two new interfaces:
```
    java.lang.ProcessHandle
    java.lang.ProcessHandle.Info
```
## Try With Resources Improvement
It's possible to use previously declared variable.
```
    ...
    try(variable) {
    ...
    }
    ...
```
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
## Reactive Streams
New reactive API
```
    java.util.concurrent.Flow
    java.util.concurrent.Flow.Publisher
    java.util.concurrent.Flow.Subscriber
    java.util.concurrent.Flow.Processor
```
## Diamond Operator for Anonymous Inner Class
```
new InnerClass<Integer>() {
...
}
```
## Optional Class Improvements
## Stream API Improvements
## Enhanced @Deprecated annotation
New parameters for annotation:
```
    @Deprecated(since = "2.8", forRemoval = true)
```
## HTTP 2 Client
## Multi-Resolution Image API
## Miscellaneous Java 9 Features
