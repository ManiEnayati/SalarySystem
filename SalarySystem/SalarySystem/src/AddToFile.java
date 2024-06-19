import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class AddToFile{
    public AddToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // true for append mode
            writer.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
