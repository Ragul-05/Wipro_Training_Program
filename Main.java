import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            StringBuilder transformed = new StringBuilder();

            for (int i = 0; i < reversed.length(); i++) {
                char ch = reversed.charAt(i);
                if (i % 2 == 0 && i != 0) {
                    ch += 5;
                }
                transformed.append(ch);
            }

            result.append(transformed).append(" ");
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}
 