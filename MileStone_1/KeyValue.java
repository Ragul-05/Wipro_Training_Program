package MileStone_1;

public class KeyValue {

    public static int getHundredsDigit(int num) {
        return (num / 100) % 10;
    }

    public static int getTensDigit(int num) {
        return (num / 10) % 10;
    }

    public static int getLargestDigit(int num) {
        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        int input1 = 3252, input2 = 2451, input3 = 1354;

        int hundreds = getHundredsDigit(input1);
        int tens = getTensDigit(input2);
        int maxDigit = getLargestDigit(input3);

        int key = (hundreds * tens) * maxDigit;
        System.out.println("The final answers Key = " + key);
    }
}
