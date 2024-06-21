package BackEndPart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Gui.*;

public class ReadEmployeesFromFile {

    public static HashMap<String,Employee> readEmployeesFromFile(String fileName) {
        HashMap<String,Employee> employees = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;
                String lastName = reader.readLine();
                String id = reader.readLine();
                String bloodType = reader.readLine();
                String nationalID = reader.readLine();
                String fatherName = reader.readLine();
                String phoneNumber = reader.readLine();
                String dateOfBirth = reader.readLine();
                String organization = reader.readLine();
                String department = reader.readLine();
                String activityType = reader.readLine();
                String salaryType = reader.readLine();
                String isManger = reader.readLine();
                String currentDateAndTime = reader.readLine();
                currentDateAndTime = reader.readLine();
                reader.readLine();


                Employee employee = new Employee();
                employee.setFirstName(name);
                employee.setLastName(lastName);
                employee.setId(id);
                employee.setbloodType(bloodType);
                employee.setNationalID(nationalID);
                employee.setFatherName(fatherName);
                employee.setPhoneNumber(phoneNumber);
                employee.setDateOfBirth(dateOfBirth);
                employee.setOrganization(organization);
                employee.setDepartment(department);
                employee.setCurrentStatus(Activity.valueOf(activityType));
                employee.setManager(Boolean.parseBoolean(isManger));
                employee.setSalaryType(salaryType);

                employees.put(id,employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}