package MileStone_1;
public class KeyValueDigits1 {
    /*public static void main(String[] args) {
        int input1 = 5243, input2 = 2376, input3 = 2912;

        int t1 = input1 / 1000, t2 = input2 / 1000, t3 = input3 / 1000;
        int h1 = (input1 / 100) % 10, h2 = (input2 / 100) % 10, h3 = (input3 / 100) % 10;
        int te1 = (input1 / 10) % 10, te2 = (input2 / 10) % 10, te3 = (input3 / 10) % 10;
        int u1 = input1 % 10, u2 = input2 % 10, u3 = input3 % 10;

        int thousands = Math.max(t1, Math.max(t2, t3));
        int hundreds = Math.max(h1, Math.max(h2, h3));
        int tens = Math.max(te1, Math.max(te2, te3));
        int units = Math.max(u1, Math.max(u2, u3));

        int key = thousands * 1000 + hundreds * 100 + tens * 10 + units;
        System.out.println("Key Value: " + key);  
    }*/

    public static void main(String[] args) {
        String[] inputs = {"5243", "2376", "2912"};
        int[] lonKey = new int[inputs.length+1];
        for(String num : inputs){
            for(int i = 0; i< lonKey.length; i++){
                lonKey[i] = Math.max(lonKey[i], num.charAt(i) - '0');
            }
        }
        for(int i = 0; i < lonKey.length; i++){
            System.out.print(lonKey[i]);
        }
        System.out.println();
    }
}
