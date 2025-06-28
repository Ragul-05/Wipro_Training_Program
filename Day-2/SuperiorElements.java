import java.util.*;

public class SuperiorElements {

    public static List<Integer> superiorElements(int[] a) {
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = a.length;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                ans.add(a[i]);
            }
            maxi = Math.max(maxi, a[i]);
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2};
        List<Integer> result = superiorElements(a);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
