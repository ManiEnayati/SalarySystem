import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadEmployeesFromFile {

    public static ArrayList<Employee> readEmployeesFromFile(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;
                String lastName = reader.readLine();
                String id = reader.readLine();
                String password = reader.readLine();
                String nationalID = reader.readLine();
                String fatherName = reader.readLine();
                String phoneNumber = reader.readLine();
                String dateOfBirth = reader.readLine();
                String department = reader.readLine();
                String organization = reader.readLine();

                Employee employee = new Employee();
                employee.setFirstName(name);
                employee.setLastName(lastName);
                employee.setId(id);
                employee.setPassword(password);
                employee.setNationalID(nationalID);
                employee.setFatherName(fatherName);
                employee.setPhoneNumber(phoneNumber);
                employee.setDateOfBirth(dateOfBirth);
                employee.setOrganization(organization);
                employee.setDepartment(department);

                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}