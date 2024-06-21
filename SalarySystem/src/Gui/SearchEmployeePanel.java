package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;

public class SearchEmployeePanel {

    private JFrame frame;

   public  SearchEmployeePanel(){

        frame = new JFrame("Search Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JLabel titleLabel = new JLabel("Searching For Employee");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(90, 100, 700, 100);
        panel.add(titleLabel);

        int buttonWidth = 500;
        int buttonHeight = 50;

        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);


        JButton findEmployeeNameButton = MainPanel.createButton("1. Find Employee By First Name", buttonColor, hoverColor);
        findEmployeeNameButton.setBounds(10, 250 , buttonWidth, buttonHeight);
        findEmployeeNameButton.setForeground(Color.pink);
        panel.add(findEmployeeNameButton);
        findEmployeeNameButton.addActionListener(e -> {

             new FindEmployeeByFirstName();
             frame.dispose();
        });

        JButton findEmployeeLastNameButton = MainPanel.createButton("2. Find Employee By Last Name", buttonColor, hoverColor);
        findEmployeeLastNameButton.setBounds(10, 310 , buttonWidth, buttonHeight);
        findEmployeeLastNameButton.setForeground(Color.pink);
        panel.add(findEmployeeLastNameButton);
        findEmployeeLastNameButton.addActionListener(e -> {

             new FindEmployeeByLastName();
             frame.dispose();
        });

        JButton findEmployeeNationalIDButton = MainPanel.createButton("3. Find Employee By National ID", buttonColor, hoverColor);
        findEmployeeNationalIDButton.setBounds(10, 370 , buttonWidth, buttonHeight);
        findEmployeeNationalIDButton.setForeground(Color.pink);
        panel.add(findEmployeeNationalIDButton);
        findEmployeeNationalIDButton.addActionListener(e -> {

             new FindEmployeeByNationalID();
             frame.dispose();
        });

        JButton findEmployeeFatherNameButton = MainPanel.createButton("4. Find Employee By Father Name", buttonColor, hoverColor);
        findEmployeeFatherNameButton.setBounds(10, 430 , buttonWidth, buttonHeight);
        findEmployeeFatherNameButton.setForeground(Color.pink);
        panel.add(findEmployeeFatherNameButton);
        findEmployeeFatherNameButton.addActionListener(e -> {

             new FindEmployeeByFatherName();
             frame.dispose();
        });


        JButton findEmployeePhoneNumberButton = MainPanel.createButton("5. Find Employee By Phone Number", buttonColor, hoverColor);
        findEmployeePhoneNumberButton.setBounds(10, 490 , buttonWidth, buttonHeight);
        findEmployeePhoneNumberButton.setForeground(Color.pink);
        panel.add(findEmployeePhoneNumberButton);
        findEmployeePhoneNumberButton.addActionListener(e -> {

             new FindEmployeeByPhoneNumber();
             frame.dispose();
        });

        JButton findEmployeeDOTButton = MainPanel.createButton("6. Find Employee By Date Of Birth", buttonColor, hoverColor);
        findEmployeeDOTButton.setBounds(10, 550 , buttonWidth, buttonHeight);
        findEmployeeDOTButton.setForeground(Color.pink);
        panel.add(findEmployeeDOTButton);
        findEmployeeDOTButton.addActionListener(e -> {

             new FindEmployeeByDateOfBirth();
             frame.dispose();
        });


        JButton findEmployeeIDButton = MainPanel.createButton("7. Find Employee By ID", buttonColor, hoverColor);
        findEmployeeIDButton.setBounds(10, 610 , buttonWidth, buttonHeight);
        findEmployeeIDButton.setForeground(Color.pink);
        panel.add(findEmployeeIDButton);
        findEmployeeIDButton.addActionListener(e -> {

             new FindEmployeeByID();
             frame.dispose();
        });

        JButton findEmployeeBloodTypeButton = MainPanel.createButton("8. Find Employee By Blood Type", buttonColor, hoverColor);
        findEmployeeBloodTypeButton.setBounds(10, 670 , buttonWidth, buttonHeight);
        findEmployeeBloodTypeButton.setForeground(Color.pink);
        panel.add(findEmployeeBloodTypeButton);
        findEmployeeBloodTypeButton.addActionListener(e -> {

             new FindEmployeeByBloodType();
             frame.dispose();
        });

        JButton findEmployeeOrganizationButton = MainPanel.createButton("9. Find Employee By Organization", buttonColor, hoverColor);
        findEmployeeOrganizationButton.setBounds(10, 730 , buttonWidth, buttonHeight);
        findEmployeeOrganizationButton.setForeground(Color.pink);
        panel.add(findEmployeeOrganizationButton);
        findEmployeeOrganizationButton.addActionListener(e -> {

             new FindEmployeeByOrganization();
             frame.dispose();
        });

        JButton findEmployeeDepartmentButton = MainPanel.createButton("10. Find Employee By Department", buttonColor, hoverColor);
        findEmployeeDepartmentButton.setBounds(10, 790 , buttonWidth, buttonHeight);
        findEmployeeDepartmentButton.setForeground(Color.pink);
        panel.add(findEmployeeDepartmentButton);
        findEmployeeDepartmentButton.addActionListener(e -> {

             new FindEmployeeByDepartment();
             frame.dispose();
        });

        JButton findEmployeeSalaryButton = MainPanel.createButton("11. Find Employee By Salary Type", buttonColor, hoverColor);
        findEmployeeSalaryButton.setBounds(10, 850 , buttonWidth, buttonHeight);
        findEmployeeSalaryButton.setForeground(Color.pink);
        panel.add(findEmployeeSalaryButton);
        findEmployeeSalaryButton.addActionListener(e -> {

             new FindEmployeeBySalaryType();
             frame.dispose();
        });


        JButton findEmployeeActivityButton = MainPanel.createButton("12. Find Employee By Activity", buttonColor, hoverColor);
        findEmployeeActivityButton.setBounds(10, 910 , buttonWidth, buttonHeight);
        findEmployeeActivityButton.setForeground(Color.pink);
        panel.add(findEmployeeActivityButton);
        findEmployeeActivityButton.addActionListener(e -> {

             new FindEmployeeByActivityType();
             frame.dispose();
        });

        JButton findEmployeeManagerButton = MainPanel.createButton("13. Find Employee By Is Manager", buttonColor, hoverColor);
        findEmployeeManagerButton.setBounds(10, 970 , buttonWidth, buttonHeight);
        findEmployeeManagerButton.setForeground(Color.pink);
        panel.add(findEmployeeManagerButton);
        findEmployeeManagerButton.addActionListener(e -> {

             new FindEmployeeByManeger();
             frame.dispose();
        });

        JButton numberOfEmployeeButton = MainPanel.createButton("14. Display The Total Number Of Employees", buttonColor, hoverColor);
        numberOfEmployeeButton.setBounds(10, 1030 , buttonWidth, buttonHeight);
        numberOfEmployeeButton.setForeground(Color.pink);
        panel.add(numberOfEmployeeButton);
        numberOfEmployeeButton.addActionListener(e -> {
             new NumberOfEmployeesPanel();
             frame.dispose();
        });


        JButton backButton = BackButton.createBackButton("Gui.EmployeePanel", buttonColor, hoverColor);
        backButton.setBounds(150, 1090, 200, 25);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        panel.setPreferredSize(new Dimension(550, 1160));
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 1090, 140, 20);
        MainPanel.DateTime(panel, 400, 1090, 140, 20);
    }
}
