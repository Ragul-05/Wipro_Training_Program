/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edwinjoel210.june26;

/**
 *
 * @author edwin
 */
public class Box {
    private int length;
    private int breadth;
    private int height;
    
    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    int volume() {
        return length * breadth * height;
    }
}
