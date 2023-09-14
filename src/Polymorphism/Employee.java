package Polymorphism;

import java.security.PublicKey;

public class Employee {
    public String name;

    public int employeeId;
    public double hourlyRate=0;
    public int hoursWorked=0;

    // Constructor for full-time employees
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Constructor for part-time employees
    public Employee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    // Method to calculate earnings for a full-time employee
    public double calculateEarnings() {
        return 4000.0; // Assuming a fixed monthly salary for full-time employees
    }
    public void welcomeMessage(){
        System.out.println("Welcome from the employee class");
    }

    // Method to calculate earnings for a part-time employee
    public double calculateEarnings(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);

        if (hourlyRate > 0 && hoursWorked > 0) {
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Earnings: $" + calculateEarnings(hourlyRate, hoursWorked));
        } else {
            System.out.println("Employee type: Full-Time");
            System.out.println("Earnings: $" + calculateEarnings());
        }
    }


}
