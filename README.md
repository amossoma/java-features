# Java 11 features


## Local-Variable Syntax for Lambda Parameters
```
    (var name) -> name.toLowerCase()
    (@SomeAnnotation var name) -> name.toLowerCase()
```
[Example 1](https://github.com/amossoma/java-features/blob/java-11/src/main/java/Example1.java)

## Launch Single-File Source-Code Programs
```
    java HelloWorld.java
```

## HTTP Client
HTTP Client introduced in Java 9, now is a part of Java 11 Standard.

## Remove The Java EE and CORBA Modules

* corba
* transaction
* activation
* xml.bind
* xml.ws
* xml.ws.annotation

## Miscellaneous features
* String
```
    isBlank()
    lines()
    repeat()
    strip()
    stripLeading()
    stripTrainling()
```
* Thread - _destroy()_ and _stop(Throwable)_ methods have been removed
* Predicate
```
    Predicate not(Predicate)
    lines
        .stream()
        .filter(Predicate.not(String::isBlank))
```

## New APIs
* java.lang.invoke.ConstantBootstraps
* java.net.http.HttpClient
* java.net.http.HttpClient$Builder
* java.net.http.HttpClient$Redirect
* java.net.http.HttpClient$Version
* java.net.http.HttpConnectTimeoutException
* java.net.http.HttpHeaders
* java.net.http.HttpRequest
* java.net.http.HttpRequest$BodyPublisher
* java.net.http.HttpRequest$BodyPublishers
* java.net.http.HttpRequest$Builder
* java.net.http.HttpResponse
* java.net.http.HttpResponse$BodyHandler
* java.net.http.HttpResponse$BodyHandlers
* java.net.http.HttpResponse$BodySubscriber
* java.net.http.HttpResponse$BodySubscribers
* java.net.http.HttpResponse$PushPromiseHandler
* java.net.http.HttpResponse$ResponseInfo
* java.net.http.HttpTimeoutException
* java.net.http.WebSocket
* java.net.http.WebSocket$Builder
* java.net.http.WebSocket$Listener
* java.net.http.WebSocketHandshakeException
* java.security.interfaces.XECKey
* java.security.interfaces.XECPrivateKey
* java.security.interfaces.XECPublicKey
* java.security.spec.NamedParameterSpec
* java.security.spec.XECPrivateKeySpec
* java.security.spec.XECPublicKeySpec
* javax.print.attribute.standard.DialogOwner
* jdk.jfr.AnnotationElement
* jdk.jfr.BooleanFlag
* jdk.jfr.Category
* jdk.jfr.Configuration
* jdk.jfr.consumer.RecordedClass
* jdk.jfr.consumer.RecordedClassLoader
* jdk.jfr.consumer.RecordedEvent
* jdk.jfr.consumer.RecordedFrame
* jdk.jfr.consumer.RecordedMethod
* jdk.jfr.consumer.RecordedObject
* jdk.jfr.consumer.RecordedStackTrace
* jdk.jfr.consumer.RecordedThread
* jdk.jfr.consumer.RecordedThreadGroup
* jdk.jfr.consumer.RecordingFile
* jdk.jfr.ContentType
* jdk.jfr.DataAmount
* jdk.jfr.Description
* jdk.jfr.Enabled
* jdk.jfr.Event
* jdk.jfr.EventFactory
* jdk.jfr.EventSettings
* jdk.jfr.EventType
* jdk.jfr.Experimental
* jdk.jfr.FlightRecorder
* jdk.jfr.FlightRecorderListener
* jdk.jfr.FlightRecorderPermission
* jdk.jfr.Frequency
* jdk.jfr.Label
* jdk.jfr.MemoryAddress
* jdk.jfr.MetadataDefinition
* jdk.jfr.Name
* jdk.jfr.Percentage
* jdk.jfr.Period
* jdk.jfr.Recording
* jdk.jfr.RecordingState
* jdk.jfr.Registered
* jdk.jfr.Relational
* jdk.jfr.SettingControl
* jdk.jfr.SettingDefinition
* jdk.jfr.SettingDescriptor
* jdk.jfr.StackTrace
* jdk.jfr.Threshold
* jdk.jfr.Timespan
* jdk.jfr.Timestamp
* jdk.jfr.TransitionFrom
* jdk.jfr.TransitionTo
* jdk.jfr.Unsigned
* jdk.jfr.ValueDescriptor
* jdk.jshell.TypePrinter$AnonymousTypeKind
* jdk.management.jfr.ConfigurationInfo
* jdk.management.jfr.EventTypeInfo
* jdk.management.jfr.FlightRecorderMXBean
* jdk.management.jfr.RecordingInfo
* jdk.management.jfr.SettingDescriptorInfo
* jdk.nio.Channels
* jdk.nio.Channels$SelectableChannelCloser
* jdk.swing.interop.DispatcherWrapper
* jdk.swing.interop.DragSourceContextWrapper
* jdk.swing.interop.DropTargetContextWrapper
* jdk.swing.interop.LightweightContentWrapper
* jdk.swing.interop.LightweightFrameWrapper
* jdk.swing.interop.SwingInterOpUtils

