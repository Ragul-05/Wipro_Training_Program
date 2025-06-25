
public class SquareRootBinary {

    public static void main(String[] args) {
        int n=121;
        sqrt(n);
    }
    static void sqrt(int n){
        int low =1 ,high =n;
        while(low<high){
            int mid = (low+high)/2;
            if(mid * mid >n){
                high = mid-1;
            }else if(mid *mid <=n){
                low = mid+1;
            }
        }
        System.out.print(" "+(low-1));
    }
}

