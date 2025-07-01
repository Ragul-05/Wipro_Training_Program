/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edwinjoel210.june26;

/**
 *
 * @author edwin
 */
public class June26 {

    public static void main(String[] args) {
        calc();
        volume();
    }
    
    static void calc() {
        Calculator cal = new Calculator();
        System.out.println(cal.powerInt(2, 5));
        System.out.println(cal.powerDouble(2.5, 5.67));
    }
    
    static void volume() {
        Box b = new Box(2, 4, 6);
        System.out.println(b.volume());
    
    }
}
