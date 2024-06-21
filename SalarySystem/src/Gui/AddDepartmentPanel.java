package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddDepartmentPanel {

        private JFrame frame;
        private JTextField nameField;
        private JTextField idField;
        private JButton addButton;

        public AddDepartmentPanel() {
            frame = new JFrame("Add Department");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(530, 700);
            frame.setLayout(new BorderLayout());
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(null);
            frame.add(panel, BorderLayout.CENTER);

            JLabel titleLabel = new JLabel("Adding Department");
            titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
            titleLabel.setForeground(new Color(0x103B57));
            titleLabel.setBounds(120, 50, 400, 50);
            panel.add(titleLabel);

            JLabel nameLabel = new JLabel("Department Name:");
            nameLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            nameLabel.setBounds(10, 300, 300, 30);
            panel.add(nameLabel);

            nameField = new JTextField();
            nameField.setBounds(200, 300, 300, 30);
            panel.add(nameField);

            JLabel idLabel = new JLabel("Department ID:");
            idLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            idLabel.setBounds(10, 350, 300, 30);
            panel.add(idLabel);

            idField = new JTextField();
            idField.setBounds(200, 350, 300, 30);
            panel.add(idField);

            panel.setBackground(new Color(0xececec));

            Color buttonColor = new Color(0x0b1f01);
            Color hoverColor = new Color(0x51613f);
            addButton = MainPanel.createButton("Add Department", buttonColor, hoverColor);
            addButton.setBounds(5, 500, 500, 50);
            addButton.setForeground(Color.pink);
            panel.add(addButton);
            addButton.addActionListener(e -> {

                Department department = new Department();
                department.setId(getDepartmentID());
                department.setName(getDepartmentName());

                Organization addDepartment = new Organization();
                addDepartment.addDepartment(department);
                frame.dispose();
            });


            JButton backButton = BackButton.createBackButton("Gui.MainPanel", buttonColor, hoverColor);
            backButton.setBounds(140, 560, 200, 25);
            backButton.setForeground(Color.pink);
            panel.add(backButton);

            frame.setVisible(true);
            MainPanel.DateTimeHour(panel, 400, 610, 140, 20);
            MainPanel.DateTime(panel, 400, 610, 140, 20);
        }

        public String getDepartmentName() {
            return nameField.getText();
        }

        public String getDepartmentID() {
            return idField.getText();
        }

        public void setVisible(boolean visible) {
            frame.setVisible(visible);
        }
}

