package MileStone_2;

public class Key_Value4 {
    public static void main(String[] args) {
        int[] inputs = {2521, 3475, 9876, 34};  
        int product = 1;
        for (int i = 0; i < inputs.length - 1; i++) {
            int num = inputs[i];
            int minDigit = 9;    
            while (num > 0) {
                int digit = num % 10;
                minDigit = Math.min(minDigit, digit);
                num /= 10;
            }
            product *= minDigit;  
        }
        int lastInput = inputs[inputs.length - 1]; 
        int result = product + lastInput;
        System.out.println("The final answer Key = " + result); 
    }
}