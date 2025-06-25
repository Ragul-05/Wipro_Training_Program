import java.util.*;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table number :");
        int n = sc.nextInt();
        System.out.print("Enter the range of number to mltiply :");
        int r = sc.nextInt();
        multiply(n,r);
    }

    static void multiply(int num,int end){
        int i = 1;
        while(i <= end){
            System.out.print(num + " * " + i +" " +" = " + (num * i) + "\n");
            i++;
        }
    }
}