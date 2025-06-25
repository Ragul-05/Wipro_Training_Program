import java.util.*;
public class AvgerageOfNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for A:");
        float a = sc.nextInt();
        System.out.print("Enter the value for B:");
        float b = sc.nextInt();
        System.out.print("Enter the value for C:");
        float c = sc.nextInt();

        avg(a,b,c);
    }

    static void avg(double A,double B,double C){
        double avgScore = 0;
        avgScore = (A+B+C) /3;
        System.out.print("The average of three numbers"+avgScore);
    }
}
