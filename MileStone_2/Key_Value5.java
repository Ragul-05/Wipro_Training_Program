package MileStone_2;

public class Key_Value5 {
    public static void main(String[] args) {
        int[] arr = {10, 7, 3, 4, 13, 9}; 

        int largestPrime = Integer.MIN_VALUE;
        int sumOfPrimes = 0;
        boolean hasPrime = false;

        for (int num : arr) {
            if (isPrime(num)) {
                hasPrime = true;
                sumOfPrimes += num;
                if (num > largestPrime) {
                    largestPrime = num;
                }
            }
        }

        int result;
        if (hasPrime) {
            result = sumOfPrimes - largestPrime;
        } else {
            int max = Integer.MIN_VALUE;
            int total = 0;
            for (int num : arr) {
                total += num;
                if (num > max) {
                    max = num;
                }
            }
            result = total - max;
        }

        System.out.println("Result: " + result);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

