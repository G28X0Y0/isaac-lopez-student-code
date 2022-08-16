package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public void raiseSalary(double percent){
        double wholeConvert = percent / 100 + 1;
        annualSalary = annualSalary * wholeConvert;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
