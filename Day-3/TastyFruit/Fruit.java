/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TastyFruit;

/**
 *
 * @author edwin
 */
public class Fruit {
    protected String name;
    protected String taste;
    protected int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    
    public void eat() {
        System.out.println(name + " is " + taste);
    }
}
