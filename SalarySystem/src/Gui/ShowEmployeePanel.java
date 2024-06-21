package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowEmployeePanel {

    private JFrame frame;

    public ShowEmployeePanel(ArrayList<Employee> matchingEmployees) {

        frame = new JFrame("Show Employee");
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


        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        int counter = 0;

        for(Employee employee1 : matchingEmployees) {

            JLabel nameLabel = new JLabel("First Name: " + employee1.getFirstName());
            nameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            nameLabel.setBounds(10, 10 + counter*660, 300, 30);
            panel.add(nameLabel);

            JLabel lastNameLabel = new JLabel("Last Name: " + employee1.getLastName());
            lastNameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            lastNameLabel.setBounds(10, 60+ counter*660, 300, 30);
            panel.add(lastNameLabel);

            JLabel nationalIDLabel = new JLabel("National ID: " + employee1.getNationalID());
            nationalIDLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            nationalIDLabel.setBounds(10, 110 + counter*660, 300, 30);
            panel.add(nationalIDLabel);

            JLabel fatherNamelLabel = new JLabel("Father Name: " + employee1.getFatherName());
            fatherNamelLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            fatherNamelLabel.setBounds(10, 160 + counter*660, 300, 30);
            panel.add(fatherNamelLabel);

            JLabel phoneLabel = new JLabel("Phone Number: " + employee1.getPhoneNumber());
            phoneLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            phoneLabel.setBounds(10, 210 + counter*660, 300, 30);
            panel.add(phoneLabel);

            JLabel dobLabel = new JLabel("Date of Birth: " + employee1.getDateOfBirth());
            dobLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            dobLabel.setBounds(10, 260 + counter*660, 300, 30);
            panel.add(dobLabel);

            JLabel idLabel1 = new JLabel("ID: " + employee1.getId());
            idLabel1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            idLabel1.setBounds(10, 310 + counter*660, 300, 30);
            panel.add(idLabel1);

            JLabel bloodTypeLabel = new JLabel("Blood Type: " + employee1.getbloodType());
            bloodTypeLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            bloodTypeLabel.setBounds(10, 360 + counter*660, 300, 30);
            panel.add(bloodTypeLabel);


            JLabel organizationLabel = new JLabel("Organization: " + employee1.getOrganization());
            organizationLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            organizationLabel.setBounds(10, 410 + counter*660, 300, 30);
            panel.add(organizationLabel);

            JLabel departmentLabel = new JLabel("Department: " + employee1.getDepartment());
            departmentLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            departmentLabel.setBounds(10, 460 + counter*660, 300, 30);
            panel.add(departmentLabel);

            JLabel salaryTypeLabel = new JLabel("Salary Type: " + employee1.getSalaryType());
            salaryTypeLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            salaryTypeLabel.setBounds(10, 510 + counter*660, 300, 30);
            panel.add(salaryTypeLabel);

            JLabel statusLabel = new JLabel("Activity Type: " + employee1.getCurrentStatus());
            statusLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            statusLabel.setBounds(10, 560 + counter*660, 300, 30);
            panel.add(statusLabel);

            JLabel passwordLabel = new JLabel("Is Manger: " + employee1.getIsManager());
            passwordLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            passwordLabel.setBounds(10, 610 + counter*660, 300, 30);
            panel.add(passwordLabel);

            JLabel lineLable = new JLabel("------------------------------------------------------------------------------" );
            lineLable.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            lineLable.setBounds(0, 645 + counter*660, 550, 30);
            panel.add(lineLable);


            counter += 1;
        }

        panel.setPreferredSize(new Dimension(550, counter*800));
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton backButton = BackButton.createBackButton("Gui.SearchEmployeePanel", buttonColor, hoverColor);
        backButton.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        backButton.setForeground(Color.pink);
        backButton.setBounds(10, 670*counter, 500, 50);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 730*counter, 140, 20);
        MainPanel.DateTime(panel, 400, 730*counter , 140, 20);

    }
}
