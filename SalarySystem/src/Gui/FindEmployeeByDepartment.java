package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FindEmployeeByDepartment {

    private JFrame frame;
    private JComboBox departmentComboBox;

    public FindEmployeeByDepartment() {

        frame = new JFrame("Search Employee By Department");
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

        JLabel titleLabel = new JLabel("Search Employee By Department");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(30, 70, 500, 100);
        panel.add(titleLabel);


        JLabel nameLabel = new JLabel("Employee Department:");
        nameLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        nameLabel.setBounds(10, 300, 300, 30);
        panel.add(nameLabel);

        HashMap<String, Department> departments = ReadDepartmentsFromFile.readDepartmentsFromFile("Department.txt");
        departmentComboBox = new JComboBox<>();
        for (Department department : departments.values()) { // استفاده از .values() برای پیمایش درون مقادیر hashMap
            departmentComboBox.addItem(department.getName());
        }
        departmentComboBox.setBounds(230, 300, 280, 30);
        panel.add(departmentComboBox);

        JButton search = MainPanel.createButton("Search", buttonColor, hoverColor);
        search.setBounds(5, 350 , 500, 50);
        search.setForeground(Color.pink);
        panel.add(search);
        search.addActionListener(e -> {

            HashMap<String,Employee> employees = ReadEmployeesFromFile.readEmployeesFromFile("Employee.txt");
            String target = (String) departmentComboBox.getSelectedItem();
            ArrayList<Employee> matchingEmployees = new ArrayList<>();

            for (Employee employee : employees.values()) {
                if (employee.getDepartment().equals(target)) {
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


