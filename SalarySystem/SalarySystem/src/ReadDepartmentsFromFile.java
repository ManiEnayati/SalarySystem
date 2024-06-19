import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadDepartmentsFromFile {
    public static ArrayList<Department> readDepartmentsFromFile(String fileName) {
        ArrayList<Department> departments = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;
                String id = reader.readLine();

                Department department = new Department();
                department.setName(name);
                department.setId(id);

                departments.add(department);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return departments;
    }
}