/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edwinjoel210.june26.library;

/**
 *
 * @author edwin
 */
public class Library {
    public static void main(String[] args) {
        Author author = new Author("Ouroboros", "OB@tva.com", 'M');
        Book book = new Book("TVA Book", author, 200, 50);
        
        System.out.println(book.toString());
           
    }
}
