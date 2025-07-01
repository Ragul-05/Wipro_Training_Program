/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance1;

/**
 *
 * @author edwin
 */
public class Inheritance1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
