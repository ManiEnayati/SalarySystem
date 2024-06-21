package BackEndPart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Gui.*;

public class ReadOrganizationsFromFile {

    public static HashMap<String,Organization> readOrganizationsFromFile(String fileName) {
        HashMap<String,Organization> organizations = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line;
                String id = reader.readLine();
                reader.readLine();

                Department department = new Department();
                department.setName(name);
                department.setId(id);

                organizations.put(id,department);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return organizations;
    }
}

