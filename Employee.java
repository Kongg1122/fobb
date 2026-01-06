
package payrollsystem;
public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Methods (2)
    public abstract double calculateSalary(); // overridden in subclasses

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
    
}
