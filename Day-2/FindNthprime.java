public class FindNthprime {
    public static void main(String[] args) {
        int prime = 0;
        int n=5;
        int i=2;

        while(n>=0){
            if(isprime(i)){
                prime = i;
                n--;
            }
            i++;
        }
        System.out.print(" "+prime);
    }

    static boolean isprime(int n) {
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
}
