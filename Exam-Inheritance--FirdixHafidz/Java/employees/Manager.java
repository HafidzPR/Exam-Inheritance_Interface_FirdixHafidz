package employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method dari Employee
        System.out.println("Department: " + department);
    }
}
