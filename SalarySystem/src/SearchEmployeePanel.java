import javax.swing.*;
import java.awt.*;

public class SearchEmployeePanel {

    private JFrame frame;

   public  SearchEmployeePanel(){
        frame = new JFrame("Search Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
         panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        frame.add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Searching For Employee");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(80, 100, 400, 100);
        panel.add(titleLabel);

        int buttonWidth = 500;
        int buttonHeight = 50;

        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JButton findEmployeeIDButton = MainPanel.createButton("1. Find Employee By ID", buttonColor, hoverColor);
        findEmployeeIDButton.setBounds(5, 250 , buttonWidth, buttonHeight);
        findEmployeeIDButton.setForeground(Color.pink);
        panel.add(findEmployeeIDButton);
        findEmployeeIDButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton findEmployeeNameButton = MainPanel.createButton("2. Find Employee By Name", buttonColor, hoverColor);
        findEmployeeNameButton.setBounds(5, 310 , buttonWidth, buttonHeight);
        findEmployeeNameButton.setForeground(Color.pink);
        panel.add(findEmployeeNameButton);
        findEmployeeNameButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton findEmployeeDOTButton = MainPanel.createButton("3. Find Employee By Date Of Birth", buttonColor, hoverColor);
        findEmployeeDOTButton.setBounds(5, 370 , buttonWidth, buttonHeight);
        findEmployeeDOTButton.setForeground(Color.pink);
        panel.add(findEmployeeDOTButton);
        findEmployeeDOTButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton findEmployeeSalaryButton = MainPanel.createButton("4. Find Employee By Salary Type", buttonColor, hoverColor);
        findEmployeeSalaryButton.setBounds(5, 430 , buttonWidth, buttonHeight);
        findEmployeeSalaryButton.setForeground(Color.pink);
        panel.add(findEmployeeSalaryButton);
        findEmployeeSalaryButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton findEmployeeActivityButton = MainPanel.createButton("5. Find Employee By Activity", buttonColor, hoverColor);
        findEmployeeActivityButton.setBounds(5, 490 , buttonWidth, buttonHeight);
        findEmployeeActivityButton.setForeground(Color.pink);
        panel.add(findEmployeeActivityButton);
        findEmployeeActivityButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton backButton = BackButton.createBackButton("EmployeePanel", buttonColor, hoverColor);
        backButton.setBounds(140, 550, 200, 25);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);
    }
}
