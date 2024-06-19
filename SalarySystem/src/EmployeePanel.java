import javax.swing.*;
import java.awt.*;

public class EmployeePanel {

    private JFrame frame;

    public EmployeePanel(){
        frame = new JFrame("Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); // حذف کادر پنل
        frame.add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Employee section");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setBounds(130, 100, 400, 100); // x, y, width, height
        titleLabel.setForeground(new Color(0x103B57));
        panel.add(titleLabel);

        int buttonWidth = 500;
        int buttonHeight = 50;

        panel.setBackground(new Color(0xececec));

        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);
        JButton findEmployeeButton = MainPanel.createButton("1. Search Employee", buttonColor, hoverColor);
        findEmployeeButton.setBounds(5, 400 , buttonWidth, buttonHeight);
        findEmployeeButton.setForeground(Color.pink);
        panel.add(findEmployeeButton);

        findEmployeeButton.addActionListener(e -> {

            new SearchEmployeePanel();
            frame.dispose();
        });

        JButton addRandomEmployeeButton = MainPanel.createButton("2. Add Random Employee", buttonColor, hoverColor);
        addRandomEmployeeButton.setBounds(5, 460 , buttonWidth, buttonHeight);
        addRandomEmployeeButton.setForeground(Color.pink);
        panel.add(addRandomEmployeeButton);
        addRandomEmployeeButton.addActionListener(e -> {
            RandomEmployee randomEmployee = new RandomEmployee();
            Employee employee = randomEmployee.generateEmployee();
            new RandomEmployeePanel(employee);
            frame.dispose();
        });


        JButton backButton = BackButton.createBackButton("MainPanel", buttonColor, hoverColor);
        backButton.setBounds(140, 520, 200, 25);
        backButton.setForeground(Color.pink);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
        MainPanel.DateTime(panel, 400, 610, 140, 20);
    }
}
