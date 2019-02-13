import java.util.List;
import java.util.function.Predicate;

import static java.util.function.Predicate.not;

public class Example2 {
    public static void main(String[] args) {
        var name = "   somebody   ";

        System.out.println("#" + name.strip() + "#");
        System.out.println("#" + name.stripLeading() + "#");
        System.out.println("#" + name.stripTrailing() + "#");

        List
                .of("", "abc", "  ", "def")
                .stream()
                .map(String::strip)
                .filter(not(String::isBlank))
                .forEach(System.out::println);

        "abc\r\ndef\nghi\rjkl"
                .lines()
                .forEach(System.out::println);
    }
}
