package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateFile {

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }
    
    public static void generateFile() {
        generateFile(100);
    }

    public static void generateFile(int size) {
        StringBuilder content = new StringBuilder();
        Path path = Paths.get("numeros.txt");

        for (int i = 0; i < size; i++) {
            content.append(generateRandomNumber()).append("\n");
        }

        try {
            Files.write(path, content.toString().getBytes());
            System.out.println("El archivo ha sido creado con exito (" + size + " numeros)");
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
