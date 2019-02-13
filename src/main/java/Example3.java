import java.io.IOException;
import java.time.ZoneId;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
    private static final String NOT_PRESENT = "Not present";

    public static void main(String[] args) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("/bin/sh");
        Process process = builder.start();
        ProcessHandle.Info info = process.info();
        System.out.printf("Process ID : %s%n", process.pid());
        System.out.printf("Command name : %s%n", info.command().orElse(NOT_PRESENT));
        System.out.printf("Command line : %s%n", info.commandLine().orElse(NOT_PRESENT));
        System.out.printf("Start time: %s%n", info
                .startInstant()
                .map(instant -> instant
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime()
                        .toString())
                .orElse(NOT_PRESENT));

        System.out.printf("Arguments : %s%n", info
                .arguments()
                .map(arguments -> Stream
                        .of(arguments)
                        .collect(Collectors.joining(" ")))
                .orElse(NOT_PRESENT));

        System.out.printf("User : %s%n", info.user().orElse(NOT_PRESENT));
    }
}