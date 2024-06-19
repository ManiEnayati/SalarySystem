import javax.swing.*;
import java.awt.*;

public class OrganizationPanel extends JFrame {

    private AddDepartment addDepartment;
    private JFrame frame;

    public  OrganizationPanel(){
        frame = new JFrame("Organization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        frame.add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Organization section");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(110, 100, 400, 50);
        panel.add(titleLabel);

        int buttonWidth = 500;
        int buttonHeight = 50;

        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JButton addDepartmentButton = MainPanel.createButton("1. Add Department", buttonColor, hoverColor);
        addDepartmentButton.setBounds(5, 400, buttonWidth, buttonHeight);
        addDepartmentButton.setForeground(Color.pink);
        panel.add(addDepartmentButton);
        addDepartmentButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addDepartmentButton.addActionListener(e -> {
            if (addDepartment == null) {
                addDepartment = new AddDepartment();
            }
            addDepartment.showView();
            frame.dispose();
        });

        JButton backButton = BackButton.createBackButton("MainPanel", buttonColor, hoverColor);
        backButton.setBounds(140, 460, 200, 25);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);
    }
}
