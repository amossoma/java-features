import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {


    public static void main(String[] args) {
        System.out.println(List
                .of("abc", "def")
                .stream()
                .map((@NotNull var test) -> test.toLowerCase())
                .collect(Collectors.joining(", ")));
    }

}