import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoApp {
    private JFrame frame;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInput;
    private JButton addButton, deleteButton;

    public ToDoApp() {
        // 1. Create main frame (window)
        frame = new JFrame("To-Do List App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create top panel (for input + buttons)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        taskInput = new JTextField(20); // input field
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Task");

        panel.add(taskInput);
        panel.add(addButton);
        panel.add(deleteButton);

        // 3. Create task list with scroll
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // 4. Add components to frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 5. Event Handling
        addButton.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskInput.setText(""); // clear input
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a task to delete!");
            }
        });

        // 6. Make frame visible
        frame.setVisible(true);
    }
}
