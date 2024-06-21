package BackEndPart;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import Gui.*;


public class RandomEmployee {
    private ArrayList<String> firstNames;
    private ArrayList<String> lastNames;
    private ArrayList<String> fatherNames;
    private ArrayList<String> departments1;
    private ArrayList<String> organizations1;
    private Random random;

    public RandomEmployee() {
        firstNames = new ArrayList<>();
        lastNames = new ArrayList<>();
        fatherNames = new ArrayList<>();
        departments1 = new ArrayList<>();
        organizations1 = new ArrayList<>();
        random = new Random();

        firstNames.add("Mohamad");
        firstNames.add("Mohsen");
        firstNames.add("Mahdi");
        firstNames.add("Mani");
        firstNames.add("Saleh");
        firstNames.add("Soniya");
        firstNames.add("Fatemeh");
        firstNames.add("Karim");
        firstNames.add("Bahram");
        firstNames.add("Reza");
        firstNames.add("Hosein");
        firstNames.add("Ali");
        firstNames.add("Amir");
        firstNames.add("Zahra");
        firstNames.add("Mina");
        firstNames.add("Maryam");
        firstNames.add("Zeinab");
        firstNames.add("Sajjad");
        firstNames.add("Morteza");

        lastNames.add("Mohammadi");
        lastNames.add("Amiri");
        lastNames.add("Zamani");
        lastNames.add("Rasooli");
        lastNames.add("Khoda parast");
        lastNames.add("Khasaf");
        lastNames.add("Khaki");
        lastNames.add("Hoseini");
        lastNames.add("Torabi");
        lastNames.add("Niazi");
        lastNames.add("Nazari");
        lastNames.add("jafari");
        lastNames.add("Choopan");
        lastNames.add("Yaghoobi");
        lastNames.add("Dastoor");
        lastNames.add("Parvizi");
        lastNames.add("Karimi");
        lastNames.add("Damirchi");
        lastNames.add("Sahand");
        lastNames.add("Emarati");
        lastNames.add("Jahani");
        lastNames.add("Babaei");

        fatherNames.add("Amir");
        fatherNames.add("Mahdi");
        fatherNames.add("Ali");
        fatherNames.add("Behrad");
        fatherNames.add("Mohammad");
        fatherNames.add("Karim");
        fatherNames.add("Mohammad");
        fatherNames.add("Reza");
        fatherNames.add("Hosein");
        fatherNames.add("Mani");
        fatherNames.add("Sajjad");
        fatherNames.add("Mohsen");

        HashMap<String,Department> departments = ReadDepartmentsFromFile.readDepartmentsFromFile("Department.txt");
        for (Department department : departments.values()) {
            departments1.add(department.getName());
        }

        HashMap<String,Organization> organizations = ReadOrganizationsFromFile.readOrganizationsFromFile("Organization.txt");
        for (Organization organization : organizations.values()) {
            organizations1.add(organization.getName());
        }
    }

    public Employee generateEmployee() {

        Employee employee = new Employee();

        employee.setFirstName(generateFirstName());
        employee.setLastName(generateLastName());
        employee.setId(generateID());
        employee.setNationalID(generateNationalID());
        employee.setPhoneNumber(generatePhoneNumber());
        employee.setDateOfBirth(generateDateOfBirth());
        employee.setFatherName(generateFatherName());
        employee.setDepartment(generateRandomDepartment());
        employee.setOrganization(generateRandomOrganization());
        employee.setbloodType(generateBloodType());
        employee.setCurrentStatus(generateActivity());
        employee.setSalaryType(generateSalaryType());
        employee.setManager(generateManager());

        return employee;
    }

    public String generateFirstName() {
        int index = random.nextInt(firstNames.size());
        return firstNames.get(index);
    }

    public String generateLastName() {
        int index = random.nextInt(lastNames.size());
        return lastNames.get(index);
    }

    public String generatePhoneNumber() {
        return String.format("%010d", random.nextInt(1000000000));
    }

    public String generateDateOfBirth() {
        int year = 1970 + random.nextInt(20);
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(28);
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }

    public String generateID() {
        return String.format("%010d", random.nextInt(1000000000));
    }

    public String generateRandomDepartment() {
        int index = random.nextInt(departments1.size());
        return departments1.get(index);
    }

    public String generateRandomOrganization() {
        int index = random.nextInt(organizations1.size());
        return organizations1.get(index);
    }

    public Activity generateActivity() {
        Activity[] activities = Activity.values();
        return activities[random.nextInt(activities.length)];
    }
    public String generateSalaryType() {
        String[] salaryTypes = {"PerHour", "Commission", "Fixed", "FixedCommission"};
        return salaryTypes[random.nextInt(salaryTypes.length)];
    }

    public String generateNationalID(){
        return String.format("%010d", random.nextInt(1000000000));
    }

    public String generateFatherName(){
        int index = random.nextInt(fatherNames.size());
        return fatherNames.get(index);
    }
    public String generateBloodType(){
        String[] bloodType = {"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"};
        return bloodType[random.nextInt(bloodType.length)];
    }

    public boolean generateManager(){
        Random random = new Random();
        return random.nextBoolean();
    }


    public void saveRandomEmployeeToFile(Employee employee) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\nHH:mm:ss");
        String currentDateAndTime = sdf.format(new Date());

        new FileController("Employee.txt", employee.getFirstName() + "\n"
                + employee.getLastName() + "\n" + employee.getId() + "\n"
                + employee.getbloodType() + "\n" + employee.getNationalID() + "\n"
                + employee.getFatherName() + "\n" + employee.getPhoneNumber() + "\n"
                + employee.getDateOfBirth() + "\n" + employee.getOrganization() + "\n"
                + employee.getDepartment() + "\n" + employee.getCurrentStatus() +"\n"
                + employee.getSalaryType() + "\n" + employee.getIsManager() + "\n"
                + currentDateAndTime + "\n\n");
        JOptionPane.showMessageDialog(null, "Employee Added Successfully!");

    }


}
