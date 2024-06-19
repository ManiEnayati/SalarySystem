import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class AddEmployee {
    private Department model;
    private AddEmployeePanel view;

    public AddEmployee() {
        this.model = new Department();
        this.view = new AddEmployeePanel();
        this.view.AddAddButtonListener(new AddButtonListener());
    }

    public void showView() {
        view.setVisible(true);
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getEmployeeName();
            String lastName = view.getEmployeeLastName();
            String id = view.getEmployeeID();
            String phoneNumber = view.getEmployeePhoneNumber();
            String nationalID = view.getEmployeeNationalID();
            String fatherName = view.getEmployeeFatherName();
            String date = view.getEmployeeDateOfBirth();
            String password = view.getEmployeePassword();
            String organization = view.getSelectedOrganization();
            String department = view.getSelectedDepartment();
            String salaryType = view.getSelectedSalaryType();
            String activityType = view.getSelectedActivityType();
            boolean isManager = view.getSelectedIsManger();


            if (phoneNumber.length() != 11) {
                // نمایش پیام خطا
                JOptionPane.showMessageDialog(null,
                        "Phone Number must be exactly 11 digits long.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return; // توقف عملیات و بازگشت از متد
            }

            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd\nHH:mm:ss");
            String currentDateAndTime = time.format(new Date());

            Employee employee = new Employee();

            employee.setFirstName(name);
            employee.setLastName(lastName);
            employee.setId(id);
            employee.setPhoneNumber(phoneNumber);
            employee.setFatherName(fatherName);
            employee.setNationalID(nationalID);
            employee.setDateOfBirth(date);
            employee.setPassword(password);
            employee.setOrganization(organization);
            employee.setDepartment(department);
            employee.setCurrentStatus(Activity.valueOf(activityType));
            employee.setStatuses(salaryType);
            employee.setManager(isManager);
            model.addEmployee(employee);

            new AddToFile("Employee.txt", name + "\n" + lastName + "\n" + id + "\n" + password + "\n" + nationalID + "\n" + fatherName + "\n" + phoneNumber + "\n" + date + "\n" + organization + "\n" + department + "\n" + activityType +"\n" + salaryType + "\n" + isManager + "\n" + currentDateAndTime + "\n");
            JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
            view.close();
            new MainPanel();
        }
    }
}