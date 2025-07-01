/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoRentalInventorySystem;

/**
 *
 * @author edwin
 */
public class Video {
    protected String videoName;
    protected boolean checkout;
    protected int rating;
    
    public Video(String videoName) {
        this.videoName = videoName;
        this.checkout = false;
        this.rating = 0;
    }

    public void doCheckout(){
        this.checkout = true;
    }
    
    public void doReturn() {
        this.checkout = false;
    }
    
    public String getName() {
        return this.videoName;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getRating() {
        return this.rating;
    }
    
    public boolean getCheckout() {
        return this.checkout;
    }
    
    public void setName(String name) {
        this.videoName = name;
    }
    
}
