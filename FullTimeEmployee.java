
package payrollsystem;
public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;
    private int leaveDays;
    
    public FullTimeEmployee(int id, String name, String department,
                            double monthlySalary, double bonus, int leaveDays) {
        super(id, name, department);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.leaveDays = leaveDays;
    }

    // Overridden method
    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    // Additional method
    public int getLeaveDays() {
        return leaveDays;
    }
}
