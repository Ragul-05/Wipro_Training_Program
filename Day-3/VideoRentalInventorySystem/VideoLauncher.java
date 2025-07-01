/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoRentalInventorySystem;

import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class VideoLauncher {
    
    static Scanner sc = new Scanner(System.in);
    static VideoStore vs = new VideoStore();
    
    public static void main(String[] args) {        
        do {            
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            
            System.out.println("1. Add Videos\n2. Check Out Video\n3. Return Video\n4. Receive Rating\n5. List Inventory\n6. Exit\n\n");
            System.out.print("Enter you choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    addVideo();
                    break;
                case 2:
                    checkoutVideo();
                    break;
                case 3:
                    returnVideo();
                    break;
                case 4:
                    receiveRating();
                    break;
                case 5:
                    listInventory();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong Input");
            }
            
        } while (true);
    }
    
    static void addVideo() {
        System.out.print("Enter the video name : ");
        String name = sc.nextLine();
        vs.addVideo(name);   
    }
    
    static void checkoutVideo() {
        System.out.print("Enter the video name : ");
        String name = sc.nextLine();
        vs.doCheckout(name);
    }
    
    static void returnVideo() {
        System.out.print("Enter the video name : ");
        String name = sc.nextLine();
        vs.doReturn(name);
    }
    
    static void receiveRating() {
        System.out.print("Enter the video name : ");
        String name = sc.nextLine();
        System.out.print("Enter the rating : ");
        int rating = sc.nextInt();
        sc.nextLine();
        vs.movieRating(name, rating);
    }
    
    static void listInventory() {
        vs.listInventory();
    }
    
    
}
