import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        try {
            Optional.empty().orElseThrow();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        try {
            OptionalDouble.empty().orElseThrow();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        try {
            OptionalInt.empty().orElseThrow();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        try {
            OptionalLong.empty().orElseThrow();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
