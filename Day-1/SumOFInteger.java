import java.util.Scanner;

public class SumOFInteger {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sx.nextInt();
        sumOfInteger(num);
    }

    static void sumOfInteger(int n){
        int sum = 0;
        int result = n;
        while(result > 0){
            sum += result % 10;
            result /=10;
        }
        System.out.print("The sum of integers :"+ sum);
    }
}
