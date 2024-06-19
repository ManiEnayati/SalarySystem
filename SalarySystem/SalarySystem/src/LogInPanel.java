import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LogInPanel {

    private JTextField employeeIDField = new JTextField();
    private JTextField employeePasswordField = new JTextField();
    private JFrame frame;

    public LogInPanel() {
        frame = new JFrame("Log In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel, BorderLayout.CENTER);
        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JLabel titleLabel = new JLabel("Log In");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(215, 100,  400, 50);
        panel.add(titleLabel);

        JLabel idLabel = new JLabel("Employee ID:");
        idLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        idLabel.setBounds(10, 300, 300, 30);
        panel.add(idLabel);

        employeeIDField  = new JTextField();
        employeeIDField.setBounds(200, 300, 300, 30);
        panel.add(employeeIDField);

        JLabel passwordLabel = new JLabel("Employee Password:");
        passwordLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        passwordLabel.setBounds(10, 350, 300, 30);
        panel.add(passwordLabel);


        employeePasswordField = new JTextField();
        employeePasswordField.setBounds(200, 350, 300, 30);
        panel.add(employeePasswordField);

        int buttonWidth = 500;
        int buttonHeight = 50;

        JButton loginButton = MainPanel.createButton("Login", buttonColor, hoverColor);
        loginButton.setBounds(5, 400, buttonWidth, buttonHeight);
        loginButton.setForeground(Color.pink);
        panel.add(loginButton);
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton backButton = BackButton.createBackButton("SalarySystem", buttonColor, hoverColor);
        backButton.setBounds(140, 470, 200, 25);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Employee> employees = ReadEmployeesFromFile.readEmployeesFromFile("Employee.txt");

                int answer = 0;

                for (Employee employee : employees) {
                    if (getEmployeeID() != null && getEmployeePassword() != null
                            && getEmployeeID().equals(employee.getId())
                            && getEmployeePassword().equals(employee.getPassword())) {
                        answer++;
                        break;
                    }
                }

                if(answer != 0){
                    JOptionPane.showMessageDialog(null, "Employee Found!");
                    new MainPanel();
                    frame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Employee Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);

    }

    public String getEmployeeID() {
        return employeeIDField.getText();
    }

    public String getEmployeePassword() {
        return employeePasswordField.getText();
    }
}
