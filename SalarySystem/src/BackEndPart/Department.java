package BackEndPart;

import Gui.MainPanel;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Department extends Organization {
    private Employee manager;
    private String id;
    private  int numberOfEmployees;
    private String name;
    private HashMap<String ,Employee> employees;

    public Department() {

    }

    public void addEmployee(Employee employee) {
        if (employee.getPhoneNumber().length() != 11) {
            JOptionPane.showMessageDialog(null,
                    "Phone Number must be exactly 11 digits long.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd\nHH:mm:ss");
            String currentDateAndTime = time.format(new Date());

            new FileController("Employee.txt", employee.getFirstName() + "\n" + employee.getLastName() +
                    "\n" + employee.getId() + "\n" + employee.getbloodType() + "\n"
                    + employee.getNationalID() + "\n" + employee.getFatherName() + "\n"
                    + employee.getPhoneNumber() + "\n" + employee.getDateOfBirth() + "\n"
                    + employee.getOrganization() + "\n" + employee.getDepartment() + "\n"
                    + employee.getCurrentStatus() +"\n" + employee.getSalaryType() + "\n"
                    +
                    employee.getIsManager()+ "\n" + currentDateAndTime + "\n" + "\n");
            JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
            new MainPanel();


        }

    }

    public Employee getManager() {
        return manager;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfEmployees() {
        try {
            HashMap<String, Employee> employees = ReadEmployeesFromFile.readEmployeesFromFile("Employee.txt");
            return employees != null ? employees.size() : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {

        this.numberOfEmployees = numberOfEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashMap<String, Employee> employees) {
        this.employees = employees;
    }

}

