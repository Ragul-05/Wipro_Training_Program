package MileStone_2;

public class Key_Value1 {
    public static void main(String[] args) {

        /*  You are given three 4-digit numbers (each between 1000 and 9999).
             For each number, find its maximum digit.
             Multiply all the three maximum digits together.
             Add this product with a fourth input number (a positive integer).
             Print the final result.
            Test Cases
            Test Case 1: Input: 1234, 5678, 9823, 10
            Step 1: Max digits → 4, 8, 9 Step 2: Multiply → 4 × 8 × 9 = 288 Step 3: Add with last input (10) → 288 + 10 = 298 Output: 298
            Test Case 2: Input: 4321, 7654, 1111, 25 Step 1: Max digits → 4, 7, 1 Step 2: Multiply → 4 × 7 × 1 = 28 Step 3: Add → 28 + 25 = 53 Output: 53
            Test Case 3: Input: 9876, 2345, 6789, 100 Step 1: Max digits → 9, 5, 9 Step 2: Multiply → 9 × 5 × 9 = 405 Step 3: Add → 405 + 100 = 505 Output: 505
            Test Case 4: Input: 5555, 4444, 9999, 1 Step 1: Max digits → 5, 4, 9 Step 2: Multiply → 5 × 4 × 9 = 180 Step 3: Add → 180 + 1 = 181 Output: 181 */
            int[] inputs = {1234, 5678, 9823, 10}; 
            int product = 1;
            int sum = 0;
            for (int input : inputs) {
                int maxDigit =  0;
                int num = input;                        
                while (num > 0) {
                    maxDigit = Math.max(maxDigit, num % 10);
                    num /= 10;
                }
                product *= maxDigit;                
            }
            int lastInput = inputs[inputs.length - 1];
            sum = product + lastInput;
            System.out.println("The final answers Key = " + sum);   
        }

    }

