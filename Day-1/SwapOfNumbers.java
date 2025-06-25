import java.util.Scanner;

public class SwapOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for A:");
        int a = sc.nextInt();
        System.out.print("Enter the value for B:");
        int b = sc.nextInt();
        swap(a,b);
    }

    static void swap(int A,int B){
        System.out.println("Before Swap: A = " + A + ", B = " + B);
        A = A ^ B; 
        B = A ^ B; 
        A = A ^ B; 
        System.out.println("After Swap: A = " + A + ", B = " + B);
    }
}
