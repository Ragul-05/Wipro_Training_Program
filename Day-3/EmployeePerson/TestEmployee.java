/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeePerson;

/**
 *
 * @author edwin
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAnnualSalary(500000);
        employee.setInsuranceNumber("3612347569812767");
        employee.setStartYear(2020);
        
        display(employee);
        
    }
    
    static void display(Employee employee) {
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getInsuranceNumber());
        System.out.println(employee.getStartYear());
    }
}
