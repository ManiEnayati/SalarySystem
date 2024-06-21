package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import BackEndPart.*;

public class MainPanel extends JFrame {
    private JFrame frame;
    public  MainPanel() {
        frame = new JFrame("Salary System");
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

        int buttonWidth = 500;
        int buttonHeight = 80;

        JButton organizationButton = createButton("Organization", buttonColor, hoverColor);
        organizationButton.setBounds(5, 290, buttonWidth, buttonHeight);
        organizationButton.setForeground(Color.pink);
        panel.add(organizationButton);

        JButton employeeButton = createButton("Employee", buttonColor, hoverColor);
        employeeButton.setBounds(5, 470, buttonWidth, buttonHeight);
        employeeButton.setForeground(Color.pink);
        panel.add(employeeButton);

        JButton departmentButton = createButton("Department", buttonColor, hoverColor);
        departmentButton.setBounds(5, 380 , buttonWidth, buttonHeight);
        departmentButton.setForeground(Color.pink);
        panel.add(departmentButton);

        JLabel textLabel = new JLabel("SALARY SYSTEM", JLabel.CENTER);
        textLabel.setFont(new Font("Arial", Font.TYPE1_FONT, 30));
        textLabel.setBounds(50, 150, 400, 30); // x, y, width, height
        panel.add(textLabel);

        DateTimeHour(panel, 400, 610, 140, 20);
        DateTime(panel, 400, 610, 140, 20);

            organizationButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new OrganizationPanel();
                    frame.dispose();
                }
            });

        departmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DepartmentPanel();
                frame.dispose();
            }
        });

        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new EmployeePanel();
                frame.dispose();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
}

    public static JButton createButton(String text, Color buttonColor, Color hoverColor) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isPressed()) {
                    g.setColor(buttonColor.darker());
                } else if (getModel().isRollover()) {
                    g.setColor(hoverColor);
                } else {
                    g.setColor(buttonColor);
                }
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                super.paintComponent(g);
            }

            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(buttonColor);
                g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setForeground(Color.black);
        button.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setOpaque(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return button;

    }

    public static void DateTimeHour(JPanel panel, int x, int y, int width, int height) {
        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        timeLabel.setForeground(Color.BLACK);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setBounds(x, y, width, height);
        panel.add(timeLabel);
        Timer timer = new Timer(1000, e -> {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            timeLabel.setText(time);
        });
        timer.start();
    }
    public static void DateTime(JPanel panel, int x, int y, int width, int height) {
        JLabel dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dateLabel.setForeground(Color.BLACK);
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dateLabel.setBounds(x, y + 20, width, height);
        panel.add(dateLabel);
        Timer timer = new Timer(1000, e -> {
            String date = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
            dateLabel.setText(date);
        });
        timer.start();
    }

}