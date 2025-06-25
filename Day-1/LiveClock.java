import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LiveClock {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Live Clock:");

        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\r" + time.format(formatter)); 
            Thread.sleep(1000); 
        }
    }
}
