package Gui;
import BackEndPart.*;

import javax.swing.*;
import java.awt.*;

public class NumberOfEmployeesPanel {

    private JFrame frame;

    public NumberOfEmployeesPanel() {
        frame = new JFrame("Show Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 700);
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

        Department department = new Department();
        int numOfEmployees = department.getNumberOfEmployees();

        JLabel nameLabel = new JLabel("Number Of Employees: " + numOfEmployees );

        nameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        nameLabel.setBounds(10, 100, 300, 30);
        panel.add(nameLabel);

        JButton backButton = BackButton.createBackButton("Gui.SearchEmployeePanel", buttonColor, hoverColor);
        backButton.setBounds(5, 150, 500, 50);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);

    }
}
