package BackEndPart;


import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Gui.*;

import javax.swing.*;

public class Organization implements Serializable {

    private static List<Organization> organizations;

    FileController addDepartment ;
    private String id;
    private String name;
    private HashMap<String,Department> departments = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        new FileController("Department", department.getName() + "\n" + department.getId()+"\n\n");
        JOptionPane.showMessageDialog(null, "Department Added Successfully!");
        new MainPanel();
    }


    public Department getDepartment(String id){
        for (Map.Entry<String, Department> entry : departments.entrySet()) {
            if (entry.getKey().equals(id)) {
                return entry.getValue(); 
            }
        }
        return null;
    }

    public static List<Organization> getOrganizations() {
        return organizations;
    }

    public static void setOrganizations(List<Organization> organizations) {
        Organization.organizations = organizations;
    }

    public static void addOrganization(Organization organization) {
        organizations.add(organization);
    }
}
