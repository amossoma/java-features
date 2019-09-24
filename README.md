# Java 13 features


## Switch Expressions ([https://openjdk.java.net/jeps/354](JEP 354))
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
## Text Blocks (Preview) ([https://openjdk.java.net/jeps/355](JEP 355))
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
## Dynamic CDS Archives ([https://openjdk.java.net/jeps/350](JEP 350))
## ZGC: Uncommit Unused Memory ([https://openjdk.java.net/jeps/351](JEP 351))
## Reimplement the Legacy Socket ([https://openjdk.java.net/jeps/353](API JEP 353)) 
