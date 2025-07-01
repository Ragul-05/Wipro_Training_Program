/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TastyFruit;

/**
 *
 * @author edwin
 */
public class Apple extends Fruit{
    public Apple() {
        super("Apple", "Sweet", 5);
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is " + taste);
    }
}
