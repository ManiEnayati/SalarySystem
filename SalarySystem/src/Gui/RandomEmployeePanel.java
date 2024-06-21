package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;

public class RandomEmployeePanel {

    private JFrame frame;

    public RandomEmployeePanel(Employee employee){
        frame = new JFrame("Add  Random Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel, BorderLayout.CENTER);
        panel.setBackground(new Color(0xececec));
        panel.setPreferredSize(new Dimension(550, 950));


        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);


        JLabel titleLabel = new JLabel("Adding Random Employee");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(80, 30,  400, 50);
        panel.add(titleLabel);

        // ایجاد و تنظیم لیبل‌ها برای نمایش مشخصات کارمند
        JLabel nameLabel = new JLabel("First Name: " + employee.getFirstName());
        nameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        nameLabel.setBounds(10, 100, 300, 30);
        panel.add(nameLabel);

        JLabel lastNameLabel = new JLabel("Last Name: " + employee.getLastName());
        lastNameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        lastNameLabel.setBounds(10, 150, 300, 30);
        panel.add(lastNameLabel);

        JLabel nationalIDLabel = new JLabel("National ID: " + employee.getNationalID());
        nationalIDLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        nationalIDLabel.setBounds(10, 200, 300, 30);
        panel.add(nationalIDLabel);

        JLabel fatherNamelLabel = new JLabel("Father Name: " + employee.getFatherName());
        fatherNamelLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        fatherNamelLabel.setBounds(10, 250, 300, 30);
        panel.add(fatherNamelLabel);

        JLabel phoneLabel = new JLabel("Phone Number: " + employee.getPhoneNumber());
        phoneLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        phoneLabel.setBounds(10, 300, 300, 30);
        panel.add(phoneLabel);

        JLabel dobLabel = new JLabel("Date of Birth: " + employee.getDateOfBirth());
        dobLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        dobLabel.setBounds(10, 350, 300, 30);
        panel.add(dobLabel);

        JLabel idLabel = new JLabel("ID: " + employee.getId());
        idLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        idLabel.setBounds(10, 400, 300, 30);
        panel.add(idLabel);

        JLabel passwordLabel = new JLabel("Blood Type: " + employee.getbloodType());
        passwordLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        passwordLabel.setBounds(10, 450, 300, 30);
        panel.add(passwordLabel);

        JLabel organizationLabel = new JLabel("Organization: " + employee.getOrganization());
        organizationLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        organizationLabel.setBounds(10, 500, 300, 30);
        panel.add(organizationLabel);

        JLabel departmentLabel = new JLabel("Department: " + employee.getDepartment());
        departmentLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        departmentLabel.setBounds(10, 550, 300, 30);
        panel.add(departmentLabel);

        JLabel salaryTypeLabel = new JLabel("Salary Type: " + employee.getSalaryType());
        salaryTypeLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        salaryTypeLabel.setBounds(10, 600, 300, 30);
        panel.add(salaryTypeLabel);

        JLabel statusLabel = new JLabel("Activity Type: " + employee.getCurrentStatus());
        statusLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        statusLabel.setBounds(10, 650, 300, 30);
        panel.add(statusLabel);

        JButton jButton1 = MainPanel.createButton("Add Random Employee", buttonColor, hoverColor);
        jButton1.setBounds(5, 700, 500, 50);
        jButton1.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        jButton1.setForeground(Color.pink);
        panel.add(jButton1);
        jButton1.addActionListener(e -> {
            RandomEmployee randomEmployee = new RandomEmployee();
            randomEmployee.saveRandomEmployeeToFile(employee);
            new EmployeePanel();
            frame.dispose();
        });


        JButton jButton2 = MainPanel.createButton("New Random Employee", buttonColor, hoverColor);
        jButton2.setBounds(5, 760, 500, 50);
        jButton2.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        jButton2.setForeground(Color.pink);
        panel.add(jButton2);
        jButton2.addActionListener(e -> {
            RandomEmployee randomEmployee = new RandomEmployee();
            Employee employee1 = randomEmployee.generateEmployee();
            new RandomEmployeePanel(employee1);
            frame.dispose();
        });


        JButton backButton = BackButton.createBackButton("Gui.EmployeePanel", buttonColor, hoverColor);
        backButton.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        backButton.setForeground(Color.pink);
        backButton.setBounds(140, 820, 200, 25);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 880, 140, 20);
        MainPanel.DateTime(panel, 400, 880, 140, 20);


    }
}
