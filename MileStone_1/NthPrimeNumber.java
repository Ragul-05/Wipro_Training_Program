package MileStone_1;
import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value for Nth prime number:");
        int n = sc.nextInt();
        int nthPrime = findNthPrime(n);
        int[] updatedArray = addPrimeToArray(arr, nthPrime);
        System.out.println("Updated array with Nth prime number:");
        for (int num : updatedArray) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    static int findNthPrime(int n) {
        if (n < 1) return -1; 
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
                if(count == n){
                    return num;
                }
            }
             num++;
        }
        return num;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if( num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int[] addPrimeToArray(int[] arr, int prime) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i]+prime;
        }
        return newArr;
    }
}
