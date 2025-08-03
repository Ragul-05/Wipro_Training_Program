package MileStone_2;

import java.util.Scanner;

public class Key_Value7 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();  

        int min1 = findSmallestDigit(input1);
        int max2 = findLargestDigit(input2);
        int max3 = findLargestDigit(input3);

        int result = (min1 * max2 * max3) + input4;
        System.out.println("Output: " + result);
    }

    public static int findSmallestDigit(int num) {
        int min = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit < min) {
                min = digit;
            }
            num /= 10;
        }
        return min;
    }

    public static int findLargestDigit(int num) {
        int max = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }
        return max;
    }
}