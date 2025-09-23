import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    private List<StudentDto> students = new ArrayList<>();

    // Start menu & loop
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("nvalid choice! Try again.");
            }
        }
    }

    // Add student
    private void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new StudentDto(id, name, marks));
        System.out.println("Student added successfully!");
    }

    // View students
    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (StudentDto s : students) {
            System.out.println(s);
        }
    }

    // Update student
    private void updateStudent(Scanner sc) {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (StudentDto s : students) {
            if (s.getId() == id) {
                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();
                System.out.print("Enter New Marks: ");
                double newMarks = sc.nextDouble();

                s.setName(newName);
                s.setMarks(newMarks);
                System.out.println("Student updated successfully!");

                // Display updated student details
                System.out.println("Updated Details: " + s);

                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    // Delete student
    private void deleteStudent(Scanner sc) {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        StudentDto toRemove = null;
        for (StudentDto s : students) {
            if (s.getId() == id) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found!");
        }
    }
}
