import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example9 {
    public static void main(String[] args) {
        IntStream
                .range(1, 10)
                .takeWhile(index -> index <= 5)
                .forEach(System.out::println);

        IntStream
                .range(1, 10)
                .dropWhile(index -> index <= 5)
                .forEach(System.out::println);

        Stream
                .iterate(1, index -> index < 10, index -> index + 1)
                .forEach(System.out::println);

        List
                .of(
                        Map.of("id", 1),
                        Map.of("id", 2),
                        Map.of("_id", 3))
                .stream()
                .flatMap(map -> map.get("id") != null ? Stream.of(map.get("id")) : Stream.empty())
                .forEach(System.out::println);

        List
                .of(
                        Map.of("id", 1),
                        Map.of("id", 2),
                        Map.of("_id", 3))
                .stream()
                .flatMap(map -> Stream.ofNullable(map.get("id")))
                .forEach(System.out::println);
    }
}
