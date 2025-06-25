import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    static boolean isPalindrome(String s){
        int l = 0;
        int r =s.length() - 1;
        while(l < r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
            
        }
        return true;
    }
}
