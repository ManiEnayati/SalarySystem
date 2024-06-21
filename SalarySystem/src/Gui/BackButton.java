package Gui;
import BackEndPart.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButton {

    public static JButton createBackButton(String targetClassName, Color buttonColor, Color hoverColor) {
        JButton backButton = MainPanel.createButton("Back", buttonColor, hoverColor);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(backButton);
                    currentFrame.dispose();

                    Class<?> clazz = Class.forName(targetClassName);
                    clazz.getDeclaredConstructor().newInstance();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        return backButton;
    }
}
