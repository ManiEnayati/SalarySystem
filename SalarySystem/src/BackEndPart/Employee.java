package BackEndPart;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Employee implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private String nationalID;
    private String phoneNumber;
    private String dateOfBirth;
    private String fatherName;
    private String bloodType;
    private String organization;
    private String department;
    private String salaryType;

    private HashMap<Integer, Salary> salaries;
    private boolean isManager;
    private Activity currentStatus;
    private ArrayList<Activity> statusHistory;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getbloodType() {
        return bloodType;
    }

    public void setbloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryTypes) {
        this.salaryType = salaryTypes;
    }

    public HashMap<Integer, Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(HashMap salaries) {
        this.salaries = salaries;
    }

    public boolean getIsManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public Activity getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Activity currentStatus) {
        this.currentStatus = currentStatus;
    }

    public ArrayList<Activity> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(ArrayList statusHistory) {
        this.statusHistory = statusHistory;
    }
}
