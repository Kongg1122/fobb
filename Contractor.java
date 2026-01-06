
package payrollsystem;
public class Contractor extends Employee {
     private double contractAmount;
    private int contractDuration;
    private boolean isRenewable;

    // Constructor
    public Contractor(int id, String name, String department,
                      double contractAmount, int contractDuration, boolean isRenewable) {
        super(id, name, department);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
        this.isRenewable = isRenewable;
    }

    // Overridden method
    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    // Additional method
    public boolean isRenewable() {
        return isRenewable;
    }
    
}
