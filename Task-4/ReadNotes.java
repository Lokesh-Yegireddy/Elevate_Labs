import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotes {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        // Reading using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Your saved notes:");
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
