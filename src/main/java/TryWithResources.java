import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));
        try (BufferedReader reader2 = reader1) {
            System.out.println(reader2.readLine());
        }
        */

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        try (reader) {
            System.out.println(reader.readLine());
        }
    }
}
