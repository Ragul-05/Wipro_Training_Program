package MileStone_1;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxElementKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] ele = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ele[i] = sc.nextInt();
        }

        int[] result = minmaxElement(ele);
        int sumOfMin = result[0];
        int sumOfMax = result[1];
        int key = sumOfMax - sumOfMin;

        System.out.println("Sum of Max digits: " + sumOfMax);
        System.out.println("Sum of Min digits: " + sumOfMin);
        System.out.println("Key = " + key);
        
        sc.close();
    }

    static int[] minmaxElement(int[] arr){
        int sumOfMin = 0;
        int sumOfMax = 0;

        for(int num : arr){
            int key = Math.abs(num);
            int min = 9;
            int max = 0;

            while(key > 0){
                int digit = key % 10;
                min = Math.min(min, digit);
                max = Math.max(max, digit);
                key /= 10;
            }

            sumOfMin += min;
            sumOfMax += max;
        }

        return new int[]{sumOfMin, sumOfMax};
    }
}
