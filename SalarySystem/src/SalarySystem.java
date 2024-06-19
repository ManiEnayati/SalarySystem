import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalarySystem {
    private JFrame frame;
    public SalarySystem() {
        frame = new JFrame("Salary System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        frame.add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("LogIn");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(215, 150, 400, 50);
        panel.add(titleLabel);

        int buttonWidth = 500;
        int buttonHeight = 50;

        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JButton signUpButton = MainPanel.createButton("SingUp", buttonColor, hoverColor);
        signUpButton.setBounds(5, 340, buttonWidth, buttonHeight);
        signUpButton.setForeground(Color.pink);
        panel.add(signUpButton);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new LogInPanel();
                frame.dispose();
            }
        });

        JButton LogInButton = MainPanel.createButton("Login", buttonColor, hoverColor);
        LogInButton.setBounds(5, 400, buttonWidth, buttonHeight);
        LogInButton.setForeground(Color.pink);
        panel.add(LogInButton);
        LogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new LogInPanel();
                frame.dispose();
            }
        });

        frame.setVisible(true);

        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);
    }
}
