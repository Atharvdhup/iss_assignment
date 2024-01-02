package basicsofjava;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // Path to the file
        Path filePath = Paths.get("example.txt");

        // Writing to a file
        writeToFile(filePath, "Hello, this is a sample text.");

        // Reading from a file
        List<String> lines = readFromFile(filePath);
        System.out.println("Content of the file:");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Method to write content to a file
    private static void writeToFile(Path filePath, String content) {
        try {
            Files.write(filePath, content.getBytes());
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static List<String> readFromFile(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
