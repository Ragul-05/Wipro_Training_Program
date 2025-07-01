/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance1;

/**
 *
 * @author edwin
 */
public class Bird extends Animal{
    //eat
    //sleep
    //fly
    
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }
    
    public void fly() {
        System.out.println("Bird is flying");
    }
}
