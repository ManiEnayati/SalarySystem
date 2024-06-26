package BackEndPart;

import java.io.*;
import java.util.List;

class FileController {

    public FileController(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // true for append mode
            writer.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Save the organizations list to a file
    public static void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(Organization.getOrganizations());
            System.out.println("Organizations saved successfully to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the organizations list from a file
    @SuppressWarnings("unchecked")
    public static void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Organization.setOrganizations((List<Organization>) ois.readObject());
            System.out.println("Organizations loaded successfully from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

