import java.util.Scanner;

public class minToYearAndDays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        minToYr(min);
    }

    static void minToYr(double min){
        double yrs = (min / 525600);
        System.out.println(yrs);
    }
}
