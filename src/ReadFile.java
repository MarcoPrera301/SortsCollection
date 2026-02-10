package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static String read() {
        Path filePath = Paths.get("numeros.txt");
        try {
            String content = Files.readString(filePath);
            return content;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null;
    }
}
