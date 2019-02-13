import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List.copyOf(List.of(1,2,3))
                .stream()
                .forEach(System.out::println);

        List.of(1,2,3)
                .stream()
                .collect(Collectors.toUnmodifiableList());


        Set.copyOf(Set.of(1,2,3))
                .stream()
                .forEach(System.out::println);

        Set.of(1,2,3)
                .stream()
                .collect(Collectors.toUnmodifiableSet());

        Map.copyOf(Map.of(1, 1, 2, 2, 3, 3))
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        Map.of(1, 1, 2, 2, 3, 3)
                .entrySet()
                .stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
