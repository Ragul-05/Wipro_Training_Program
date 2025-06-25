import java.util.*;
public class InchesTOMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float inch = sc.nextInt();

        InchesTOMeter(inch);
    }

    static void InchesTOMeter(float inch){
        double meter = 0.0254 * inch;
        System.out.print("Inches to Meter :"+ meter);
    }
}
