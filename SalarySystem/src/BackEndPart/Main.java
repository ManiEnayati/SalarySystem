package BackEndPart;


import javax.swing.*;
import Gui.*;

public class Main {
    public static void main(String[] args ) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainPanel();

            }
        });
    }
}
