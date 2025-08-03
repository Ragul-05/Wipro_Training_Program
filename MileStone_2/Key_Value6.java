package MileStone_2;

import java.util.Scanner;

public class Key_Value6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n ; i++){
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            if(!isPrime(i)){
                sum += nums[i];
            }
        }
        System.out.println("The final answer for non-prime number sum is "+sum);
    }
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}
