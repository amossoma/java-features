import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        Set<Integer> set = Set.of(1, 2, 3, 4, 5);

        Map<String, Integer> smallMap = Map.of(
                "K1", 1,
                "K2", 2
        );

        Map<String, Integer> bigMap = Map.ofEntries(
                Map.entry("K1", 1),
                Map.entry("K2", 2),
                Map.entry("K3", 3),
                Map.entry("K4", 4),
                Map.entry("K5", 5),
                Map.entry("K6", 6),
                Map.entry("K7", 7),
                Map.entry("K8", 8),
                Map.entry("K9", 9),
                Map.entry("K10", 10),
                Map.entry("K11", 11),
                Map.entry("K12", 12),
                Map.entry("K13", 13),
                Map.entry("K14", 14),
                Map.entry("K15", 15)
        );
    }

}