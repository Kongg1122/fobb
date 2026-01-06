
package payrollsystem;
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    private int weeksWorked;

    // Constructor
    public PartTimeEmployee(int id, String name, String department,
                            double hourlyRate, int hoursWorked, int weeksWorked) {
        super(id, name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.weeksWorked = weeksWorked;
    }

    // Overridden method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked * weeksWorked;
    }

    // Additional method
    public int getHoursWorked() {
        return hoursWorked;
    }
}
