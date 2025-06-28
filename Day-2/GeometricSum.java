import java.security.spec.ECFieldF2m;
import java.text.DecimalFormat;
import java.util.*;
public class GeometricSum {
    public static void main(String[] args) {
        int n = 3;
        Example ex = new Example();
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.print("" + df.format(ex.geoSum(n,1)));

    }

   
}

class Example {
    static double geoSum(int n, double sum) {
        if (n == 0) {
            return sum;
        } else {
            return geoSum(n - 1, sum + (1 / Math.pow(2, n)));
        }
    }
}
