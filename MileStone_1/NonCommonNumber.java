package MileStone_1;

import java.util.HashSet;
import java.util.Set;

public class NonCommonNumber {
    public static void main(String[] args) {
    int[] inp1 = {123,45,7890,67,2,90};
    int[] inp2 = {45,7890,123};
    int result = getSingleDigitSumOfNonCommonNumber(inp1,inp2);
    System.out.println("Single digit sum of non-common numbers: " + result);
    
    }

    static int getSingleDigitSumOfNonCommonNumber(int[] arr1, int[] arr2){
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num : arr2){
            uniqueElements.add(num);
        }
        int sum = 0;
        for(int num : arr1){
            if(!uniqueElements.contains(num)){
                sum += num;
            }
        }
        return getSingleDigitSum(sum);
    }

    static int getSingleDigitSum(int num){
        while(num >=10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    
}
