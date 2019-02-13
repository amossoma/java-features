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
## Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
## Microbenchmark Suite
## JVM Constants API
## One AArch64 Port, Not Two
## Default CDS Archives
## Abortable Mixed Collections for G1
## Promptly Return Unused Committed Memory from G1
