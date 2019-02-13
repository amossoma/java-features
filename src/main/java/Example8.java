import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example8 {
    public static void main(String[] args) {
        System.out.println(
                IntStream
                        .of(1, 2, 3, 4, 5)
                        .boxed()
                        .map(Example8::findById)
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .collect(Collectors.joining(", ")));

        System.out.println(
                IntStream
                        .of(1, 2, 3, 4, 5)
                        .boxed()
                        .map(Example8::findById)
                        .flatMap(Optional::stream)
                        .collect(Collectors.joining(", ")));

        Optional.of("Test").ifPresentOrElse(System.out::println, () -> System.out.println("Nothing"));
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Nothing"));

        Optional.of("Test").or(() -> Optional.of("Test 2")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("Test 2")).ifPresent(System.out::println);
    }

    private static Optional<String> findById(int i) {
        return i % 2 == 0 ? Optional.empty() : Optional.of("Test " + i);
    }
}
