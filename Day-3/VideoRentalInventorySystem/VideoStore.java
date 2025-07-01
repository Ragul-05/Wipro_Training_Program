/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoRentalInventorySystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edwin
 */
public class VideoStore {

    protected List<Video> videos;
    
    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(String name) {
        Video video = new Video(name);
        videos.add(video);
        System.out.println(name + " added sucessfully");
    }

    public void doCheckout(String name) {

        boolean status = false;

        for (int i = 0; i < videos.size(); i++) {
            Video currentMovie = videos.get(i);

            if (currentMovie.getName().equalsIgnoreCase(name)) {
                currentMovie.doCheckout();
                System.out.println("Video " + currentMovie.getName() + " checkedout successfully");
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println(name + " not found in inventory");
        }
    }
    
    public void doReturn(String name) {
        boolean status = false;

        for (int i = 0; i < videos.size(); i++) {
            Video currentMovie = videos.get(i);

            if (currentMovie.getName().equalsIgnoreCase(name)) {
                currentMovie.doReturn();
                System.out.println("Video " + currentMovie.getName() + " returned successfully");
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println(name + " not found in inventory");
        }
    }
    
    public void movieRating(String name, int rating) {
        boolean status = false;

        for (int i = 0; i < videos.size(); i++) {
            Video currentMovie = videos.get(i);

            if (currentMovie.getName().equalsIgnoreCase(name)) {
                currentMovie.setRating(rating);
                System.out.println("Video" + currentMovie.getName() + " " + currentMovie.getRating() + " rating set successfully");
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println(name + " not found in inventory");
        }
    }
    
    public void listInventory() {
        System.out.println("-".repeat(46));
        System.out.printf("| %-20s | %-10s | %-6s |\n", "Movie", "Status", "Rating");
        System.out.println("-".repeat(46));
        for (int i = 0; i < videos.size(); i++) {
            Video currentMovie = videos.get(i);
            String name = currentMovie.getName();
            boolean checkout = currentMovie.getCheckout();
            int rating = currentMovie.getRating();
//            System.out.println("| " + name + "\t| " + checkout + "\t| " + rating + "\t|");
            System.out.printf("| %-20s | %-10s | %-6d |\n", name, checkout, rating);
        }
        
        System.out.println("-".repeat(46));    
        
    }

}
