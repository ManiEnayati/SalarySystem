package BackEndPart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Gui.*;

public class ReadDepartmentsFromFile {
    public static HashMap<String ,Department> readDepartmentsFromFile(String fileName) {
        HashMap<String,Department> departments = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;
                String id = reader.readLine();
                reader.readLine();

                Department department = new Department();
                department.setName(name);
                department.setId(id);

                departments.put(id, department);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return departments;
    }
}