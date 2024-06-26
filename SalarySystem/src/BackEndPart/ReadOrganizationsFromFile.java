package BackEndPart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.Temporal;
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

                Organization organization = new Organization();
                organization.setName(name);
                organization.setId(id);

                organizations.put(id,organization);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return organizations;
    }
}

