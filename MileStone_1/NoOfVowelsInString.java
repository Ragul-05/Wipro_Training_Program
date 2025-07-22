package MileStone_1;

import java.util.Scanner;

public class NoOfVowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int vowelsCount = countVowels(inputString);
        System.out.println("Number of vowels in the string \"" + inputString + "\": " + vowelsCount);
    }

    static int countVowels(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(isVowel(ch)){
                count ++;
            }
            
        }
        return count;
    }

    static boolean isVowel(char ch){
        char Lowerch = Character.toLowerCase(ch);
        return Lowerch == 'a' || Lowerch == 'e' || Lowerch == 'i' || Lowerch == 'o' || Lowerch == 'u';
    }
}
