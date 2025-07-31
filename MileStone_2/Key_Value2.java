package MileStone_2;

public class Key_Value2 {

    public static int computeResult(int[] input1, int[] input2, int[] input3, int input4) {
        int min1 = findMin(input1);
        int max2 = findMax(input2);
        int min3 = findMin(input3);

        return (min1 * max2 * min3) - input4;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input1 = {4268};
        int[] input2 = {6573};
        int[] input3 = {1543};
        int input4 = 500;

        int result = computeResult(input1, input2, input3, input4);
        System.out.println("Result: " + result);
    }
}
