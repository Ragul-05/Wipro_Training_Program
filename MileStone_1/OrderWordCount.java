package MileStone_1;

public class OrderWordCount {
    public static void main(String[] args) {
        String inputString = " Hello World This is a Test String";
        String[] words = inputString.trim().split(" ");
        int count = 0;

        for (String word : words) {
            if (isOrdered(word)) {
                count++;
            }
        }

        System.out.println("Ordered word count: " + count);
    }

    static boolean isOrdered(String word) {
        word = word.trim().toLowerCase();
        char[] singleChar = word.toCharArray();
        for (int i = 0; i < singleChar.length - 1; i++) {
            if (singleChar[i] > singleChar[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
