
package payrollsystem;
import java.util.ArrayList;
public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Object creation
        employees.add(new FullTimeEmployee(1, "Alice", "HR", 4000, 500, 20));
        employees.add(new PartTimeEmployee(2, "Bob", "IT", 20, 15, 4));
        employees.add(new Contractor(3, "Charlie", "Finance", 6000, 6, true));

        // Polymorphic processing
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Salary: $" + emp.calculateSalary());
            System.out.println("----------------------------");
        }
    }
    
}
