import java.util.*;
public class FarenheitToCeleius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float faren = sc.nextInt();
        farenToCel(faren);
    }

    static void farenToCel(float faren){
        double celeius = (faren - 32) * (0.55555555);
        System.out.print("Farenheit to Celeius :"+ celeius);
    }
}
