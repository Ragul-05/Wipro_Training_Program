public class DigitalRoot {
    public static void main(String[] args) {
        int n = 9875;
        int result = digitalRoot(n);
        System.out.println("Digital Root of " + n + " is: " + result);
    }

    public static int digitalRoot(int a) {
        if (a < 10) return a;

        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }

        return digitalRoot(sum);  
    }
}
