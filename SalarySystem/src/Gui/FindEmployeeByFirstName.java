package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FindEmployeeByFirstName {
    private JFrame frame;
    private JTextField nameField;

    public FindEmployeeByFirstName() {

        frame = new JFrame("Search Employee By First Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel, BorderLayout.CENTER);
        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JLabel titleLabel = new JLabel("Search Employee By First Name");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(50, 60, 500, 100);
        panel.add(titleLabel);


        JLabel nameLabel = new JLabel("Employee First Name:");
        nameLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        nameLabel.setBounds(10, 300, 300, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(215, 300, 290, 30);
        panel.add(nameField);

        JButton search = MainPanel.createButton("Search", buttonColor, hoverColor);
        search.setBounds(5, 350 , 500, 50);
        search.setForeground(Color.pink);
        panel.add(search);
        search.addActionListener(e -> {

            HashMap<String,Employee> employees = ReadEmployeesFromFile.readEmployeesFromFile("Employee.txt");
            String targetName = nameField.getText();
            ArrayList<Employee> matchingEmployees = new ArrayList<>();

            for (Employee employee : employees.values()) {
                if (employee.getFirstName().equals(targetName)) {
                    matchingEmployees.add(employee);
                }
            }
            new ShowEmployeePanel(matchingEmployees);

            frame.dispose();
        });

        JButton backButton = BackButton.createBackButton("Gui.SearchEmployeePanel", buttonColor, hoverColor);
        backButton.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        backButton.setForeground(Color.pink);
        backButton.setBounds(140, 410, 200, 25);
        panel.add(backButton);


        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);

    }

}
