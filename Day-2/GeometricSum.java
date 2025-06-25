import java.text.DecimalFormat;
import java.util.*;
public class GeometricSum {
    public static void main(String[] args) {
        int n = 3;
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.print("" + df.format(geoSum(n,1)));

    }

    public static double geoSum(int k,double sum){
        if ( k == 0) {
            return sum;
        }
        sum += 1 / Math.pow(2, k);
        return geoSum(k - 1, sum);
    } 
}
