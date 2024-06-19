import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class AddDepartment {
    private Organization model;
    private AddDepartmentPanel view;

    public AddDepartment() {
        this.model = new Organization();
        this.view = new AddDepartmentPanel();
        this.view.addAddButtonListener(new AddButtonListener());
    }

    public void showView() {
        view.setVisible(true);
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getDepartmentName();
            String ID = view.getDepartmentID();

            Department department = new Department();

            department.setName(name);
            department.setId(ID);
            model.addDepartment(department);

            new AddToFile("Department.txt", name + "\n" + ID + "\n");
            JOptionPane.showMessageDialog(null, "Department Added Successfully!");
            view.close();
            new MainPanel();
        }
    }
}