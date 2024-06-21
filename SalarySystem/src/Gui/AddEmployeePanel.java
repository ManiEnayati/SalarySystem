package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;


public class AddEmployeePanel {

    private JFrame frame;
    private JTextField nameField;
    private JTextField lastnameField;
    private JTextField idField;
    private JComboBox<String> bloodTypeJComboBox;
    private JTextField phoneNumberField;
    private JTextField fatherNameField;
    private JTextField dateOfBirthField;
    private JTextField nationalIDField;
    private JButton addButton;
    private JComboBox<String> departmentComboBox;
    private JComboBox<String> organizationComboBox;
    private JComboBox<String> salaryTypeComboBox;
    private JComboBox<String> activityTypeComboBox;
    private JComboBox<Boolean> managerComboBox;

    public AddEmployeePanel() {

        frame = new JFrame("Add Employee");
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
        panel.setPreferredSize(new Dimension(550, 950));


        Color buttonColor = new Color(0x0b1f01);
        Color hoverColor = new Color(0x51613f);

        JLabel titleLabel = new JLabel("Adding Employee");
        titleLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 30));
        titleLabel.setForeground(new Color(0x103B57));
        titleLabel.setBounds(130, 30,  400, 50);
        panel.add(titleLabel);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);

        JLabel nameLabel = new JLabel("First Name:");
        nameLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        nameLabel.setBounds(10, 100, 300, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 100, 300, 30);
        panel.add(nameField);

        JLabel lastnameLabel = new JLabel("Last Name:");
        lastnameLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        lastnameLabel.setBounds(10, 150, 300, 30);
        panel.add(lastnameLabel);

        lastnameField = new JTextField();
        lastnameField.setBounds(200, 150, 300, 30);
        panel.add(lastnameField);

        JLabel NationalIDLabel = new JLabel("National ID:");
        NationalIDLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        NationalIDLabel.setBounds(10, 200, 300, 30);
        panel.add(NationalIDLabel);

        nationalIDField = new JTextField();
        nationalIDField.setBounds(200, 200, 300, 30);
        panel.add(nationalIDField);

        JLabel FatheNameLabel = new JLabel("Father Name:");
        FatheNameLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        FatheNameLabel.setBounds(10, 250, 300, 30);
        panel.add(FatheNameLabel);

        fatherNameField = new JTextField();
        fatherNameField.setBounds(200, 250, 300, 30);
        panel.add(fatherNameField);

        JLabel PhoneNumberLabel = new JLabel("Phone Number:");
        PhoneNumberLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        PhoneNumberLabel.setBounds(10, 300, 300, 30);
        panel.add(PhoneNumberLabel);

        phoneNumberField = new JTextField(10);
        phoneNumberField.setBounds(200, 300, 300, 30);
        panel.add(phoneNumberField);

        JLabel DateOfBirth = new JLabel("Date Of Birth:");
        DateOfBirth.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        DateOfBirth.setBounds(10, 350, 300, 30);
        panel.add(DateOfBirth);

        dateOfBirthField = new JTextField();
        dateOfBirthField.setBounds(200, 350, 300, 30);
        panel.add(dateOfBirthField);

        JLabel IDLabel = new JLabel("ID:");
        IDLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        IDLabel.setBounds(10, 400, 300, 30);
        panel.add(IDLabel);

        idField = new JTextField();
        idField.setBounds(200, 400, 300, 30);
        panel.add(idField);

        JLabel bloodTypeLabel = new JLabel("Blood Type:");
        bloodTypeLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        bloodTypeLabel.setBounds(10, 450, 300, 30);
        panel.add(bloodTypeLabel);

        ArrayList<String> bloodType = new ArrayList<>();
        bloodType.add("O+");
        bloodType.add("O-");
        bloodType.add("AB+");
        bloodType.add("AB-");
        bloodType.add("A+");
        bloodType.add("A-");
        bloodType.add("B+");
        bloodType.add("B-");

        bloodTypeJComboBox = new JComboBox<>(bloodType.toArray(new String[0]));
        bloodTypeJComboBox.setBounds(200, 450, 300, 30);
        panel.add(bloodTypeJComboBox);

        JLabel organizationLabel = new JLabel("Organization:");
        organizationLabel.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        organizationLabel.setBounds(10, 500, 300, 30);
        panel.add(organizationLabel);

        HashMap<String,Organization> organizations = ReadOrganizationsFromFile.readOrganizationsFromFile("Organization.txt");
        organizationComboBox = new JComboBox<>();
        for (Organization organization : organizations.values()) {
            organizationComboBox.addItem(organization.getName());
        }        organizationComboBox.setBounds(200, 500, 300, 30);
        panel.add(organizationComboBox);


        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        departmentLabel.setBounds(10, 550, 300, 30);
        panel.add(departmentLabel);

        HashMap<String,Department> departments = ReadDepartmentsFromFile.readDepartmentsFromFile("Department.txt");
        departmentComboBox = new JComboBox<>();
        for (Department department : departments.values()) {
            departmentComboBox.addItem(department.getName());
        }
        departmentComboBox.setBounds(200, 550, 300, 30);
        panel.add(departmentComboBox);

        JLabel salaryTypeLable = new JLabel("Salary Type:");
        salaryTypeLable.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        salaryTypeLable.setBounds(10, 600, 300, 30);
        panel.add(salaryTypeLable);

        ArrayList<String> salaryType = new ArrayList<>();

        salaryType.add("Commission");
        salaryType.add("FixedCommission");
        salaryType.add("Fixed");
        salaryType.add("PerHour");

        salaryTypeComboBox = new JComboBox<>(salaryType.toArray(new String[0]));
        salaryTypeComboBox.setBounds(200, 600, 300, 30);
        panel.add(salaryTypeComboBox);

        JLabel activityTypeList = new JLabel("Activity Type:");
        activityTypeList.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        activityTypeList.setBounds(10,  650, 300, 30);
        panel.add(activityTypeList);

        ArrayList<String> activityList = new ArrayList<>();
        for (Activity activity : Activity.values()) {
            activityList.add(activity.toString());
        }
        activityTypeComboBox = new JComboBox<>(activityList.toArray(new String[0]));
        activityTypeComboBox.setBounds(200, 650, 300, 30);
        panel.add(activityTypeComboBox);

        JLabel mangerLable = new JLabel("Is Manger:");
        mangerLable.setFont(new Font("Book Antiqua", Font.TYPE1_FONT, 20));
        mangerLable.setBounds(10, 700, 300, 30);
        panel.add(mangerLable);

        managerComboBox = new JComboBox<>();
        managerComboBox.addItem(Boolean.TRUE);
        managerComboBox.addItem(Boolean.FALSE);
        managerComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (Boolean.TRUE.equals(value)) {
                    setText("Manager");
                } else if (Boolean.FALSE.equals(value)) {
                    setText("Not a Manager");
                }
                return this;
            }
        });
        managerComboBox.setBounds(200, 700, 300, 30);
        panel.add(managerComboBox);



        addButton = MainPanel.createButton("Add Employee", buttonColor, hoverColor);
        addButton.setBounds(5, 750, 500, 50);
        addButton.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        addButton.setForeground(Color.pink);
        panel.add(addButton);
        addButton.addActionListener(e -> {

            Employee employee = new Employee();

            employee.setFirstName(getEmployeeName());
            employee.setLastName(getEmployeeLastName());
            employee.setId(getEmployeeID());
            employee.setPhoneNumber(getEmployeePhoneNumber());
            employee.setFatherName(getEmployeeFatherName());
            employee.setNationalID(getEmployeeNationalID());
            employee.setDateOfBirth(getEmployeeDateOfBirth());
            employee.setbloodType(getEmployeeBloodType());
            employee.setOrganization(getSelectedOrganization());
            employee.setDepartment(getSelectedDepartment());
            employee.setCurrentStatus(Activity.valueOf(getSelectedActivityType()));
            employee.setSalaryType(getSelectedSalaryType());
            employee.setManager(getSelectedIsManger());

            Department addEmployee= new Department();
            addEmployee.addEmployee(employee);
        });


        JButton backButton = BackButton.createBackButton("Gui.DepartmentPanel", buttonColor, hoverColor);
        backButton.setFont(new Font("Book Antiqua", Font.BOLD, 16));
        backButton.setForeground(Color.pink);
        backButton.setBounds(140, 810, 200, 25);
        panel.add(backButton);

        frame.setVisible(true);
        MainPanel.DateTimeHour(panel, 400, 880, 140, 20);
        MainPanel.DateTime(panel, 400, 880, 140, 20);

    }

    public String getEmployeeName() {
        return nameField.getText();
    }

    public String getEmployeeLastName() {
        return lastnameField.getText();
    }

    public String getEmployeePhoneNumber() {
        return phoneNumberField.getText();
    }

    public String getEmployeeDateOfBirth() {
        return dateOfBirthField.getText();
    }

    public String getEmployeeID() {
        return idField.getText();
    }

    public String getEmployeeFatherName() {
        return fatherNameField.getText();
    }

    public String getEmployeeNationalID() {
        return nationalIDField.getText();
    }

    public String getEmployeeBloodType() {
        return (String) bloodTypeJComboBox.getSelectedItem();
    }

    public String getSelectedSalaryType(){
        return (String) salaryTypeComboBox.getSelectedItem();
    }

    public String getSelectedActivityType(){
        return (String) activityTypeComboBox.getSelectedItem();
    }

    public String getSelectedDepartment() {
        return (String) departmentComboBox.getSelectedItem();
    }

    public String getSelectedOrganization() {
        return (String) organizationComboBox.getSelectedItem();
    }

    public boolean getSelectedIsManger(){
        return (boolean) managerComboBox.getSelectedItem();
    }

    public void AddAddButtonListener (ActionListener listener) {

        addButton.addActionListener(listener);
    }

    public void close() {
        frame.dispose();
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
