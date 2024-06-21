package BackEndPart;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileController {

    public FileController(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // true for append mode
            writer.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

