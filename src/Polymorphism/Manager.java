package Polymorphism;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int employeeId, double bonus) {
        super(name, employeeId);
        this.bonus = bonus;
    }

    @Override
    public double calculateEarnings() {
        // Override the calculateEarnings method for managers to include the bonus
        return super.calculateEarnings() + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        // Override the displayEmployeeInfo method to include bonus information
        super.displayEmployeeInfo();
        System.out.println("Bonus: $" + bonus);
    }

}
