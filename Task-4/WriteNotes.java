import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your note:");
        String note = scanner.nextLine();

        // File path
        String fileName = "notes.txt";

        // Writing using FileWriter (append = true)
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(note + "\n");
            System.out.println("Note saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
