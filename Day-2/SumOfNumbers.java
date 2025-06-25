import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int count = 0;
        System.out.print(" " + sum(n,count));
    }
    static int sum(int n,int c){
       
        if(n == 0){
            return c;
        }
        else{
            return n % 10 ==0 ? sum(n / 10, c + 1) : sum(n/10,c);

        }
    }
}
