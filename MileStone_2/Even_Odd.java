package MileStone_2;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        if(n4 % 2 == 0){
            int[] numbers = {n1,n2,n3};
            int oddSum = 0;
            int evenSum = 0;
            for(int num : numbers){
                while(num > 0){
                    int digit = num % 10;
                    if(digit % 2 ==0){
                        evenSum += digit;
                    }
                    else{
                        oddSum += digit;
                    }
                    num /= 10;
                }
            }
            int sol = Math.abs(evenSum - oddSum);
            System.out.println("The final answer is " + sol);
        }
        else{
            System.out.println("If n4 is an odd number,No other calculation is performed....");
        }
    }
}