/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edwinjoel210.june26.library;

/**
 *
 * @author edwin
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }   

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    } 

    @Override
    public String toString() {
        return "Author {" + "\n\tname=" + name + ", \n\temail=" + email + ", \n\tgender=" + gender + "\n}";
    }
    
    
}
