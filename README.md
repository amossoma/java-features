# Java 13 features


## Switch Expressions ([JEP 354](https://openjdk.java.net/jeps/354))
"yield" for switch
```
int dayNumber = switch (day) {
    case MONDAY -> 1;
    case TUESDAY -> 2;
    ...
    default -> {
       ...
       yiekd result; // was "break result;" in java 12
    }
}
```
## Text Blocks (Preview) ([JEP 355](https://openjdk.java.net/jeps/355))
To enable it use switch _--enable-preview_
### Code 1
```
String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
""";
```
### Result 1
```
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
```
### Code 2
```
String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
                  """;
```
### Result 2
```
<html>
    <body>
        <p>Hello, world</p>
    </body>
</html>
```
## Dynamic CDS Archives ([JEP 350](https://openjdk.java.net/jeps/350))
## ZGC: Uncommit Unused Memory ([JEP 351](https://openjdk.java.net/jeps/351))
## Reimplement the Legacy Socket API ([JEP 353](https://openjdk.java.net/jeps/353)) 
