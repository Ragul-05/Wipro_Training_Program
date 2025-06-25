import java.util.*;
public class AreaAndPerimeter {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for r:");
        float r= sc.nextInt();
        area(r);
        System.out.println();
        perimeter(r);
    }

    static void area(float r){
        double c = 3.14 *(r * r);
        System.out.print("Area of circle : "+c);
    }

    static void perimeter(float r){
         double p = 2 * 3.14 * r;
        System.out.print("Circumference of circle : "+p);
    }
}
