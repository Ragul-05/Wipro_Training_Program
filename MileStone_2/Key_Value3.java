package MileStone_2;

public class Key_Value3 {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }
    public static int computeSum(int[] arr) {
        int minPrime = Integer.MAX_VALUE;
        int primeSum = 0;
        boolean hasPrime = false;
        int totalSum = 0;
        int minValue = Integer.MAX_VALUE;
        for (int num : arr) {
            totalSum += num;
            minValue = Math.min(minValue, num);
            if (isPrime(num)) {
                hasPrime = true;
                primeSum += num;
                minPrime = Math.min(minPrime, num);
            }
        }
        if (hasPrime) {
            return primeSum - minPrime;  
        } else {
            return totalSum - minValue;  
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 9, 13, 17, 4}; 
        int result = computeSum(arr);
        System.out.println("Result: " + result);
    }
}
