import java.util.ArrayList;
public class Department extends Organization {
    private Employee manager;
    private String id;
    private static int numberOfEmployees = 0;
    private String name;
    private ArrayList<Employee> employees;


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getManager() {
        return manager;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {
        employees = new ArrayList<>();

    }

    private static void numberOfEmployee (){
        numberOfEmployees++;
    }
}

