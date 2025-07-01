/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeePerson;

/**
 *
 * @author edwin
 */
public class Employee extends Person{
    private double annualSalary;
    private int startYear;
    private String insuranceNumber;

    public Employee(double annualSalary, int startYear, String insuranceNumber, String name) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(double annualSalary, int startYear, String insuranceNumber) {
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.insuranceNumber = insuranceNumber;
    }
    
    public Employee(){}

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }    
}
