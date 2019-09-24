# Java 12 features


## Switch Expressions
New syntax for switch
```
switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
    case TUESDAY                -> System.out.println(7);
    case THURSDAY, SATURDAY     -> System.out.println(8);
    case WEDNESDAY              -> System.out.println(9);
}
```
Switch can return values 
```
int dayNumber = switch (day) {
    case MONDAY -> 1;
    case TUESDAY -> 2;
    ...
}
```
## File.mismatch method
```
public static long mismatch(Path path, Path path2) throws IOException
```
Returns the position of the first mismatch or -1L if there is no mismatch.
## Compact Number Formatting
```
var numberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
numberFormat.setMaximumFractionDigits(1);

System.out.println(numberFormat.format(2592)");
```
## Teeing Collectors
```
Stream.of(1, 2, 3, 4, 5)
    .collect(teeing(
        minBy(Integer::compareTo),
        maxBy(Integer::compareTo),
        Range::ofOptional));
```
## Java Strings New Methods
### indent(int n)
Adjusts the indentation of each line in the string based on the value of ‘n’ and also normalizes line termination characters
### transform(Function f)
Allows us to call a function on the given string.
### Optional describeConstable()
Returns an Optional containing the nominal descriptor for this instance, which is the instance itself. 
### String resolveConstantDesc​(MethodHandles.Lookup lookup)
Resolves this instance as a ConstantDesc, the result of which is the instance itself.
## Pattern Matching for instanceof (Preview)
Instead of:
```
if (obj instanceof String) {
    String s = (String) obj;
    // use s in your code from here
}
```
It can be used:
```
if (obj instanceof String s) {
    // can use s directly here
} 
```
## Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
## Microbenchmark Suite
## JVM Constants API
## One AArch64 Port, Not Two
## Default CDS Archives
## Abortable Mixed Collections for G1
## Promptly Return Unused Committed Memory from G1
