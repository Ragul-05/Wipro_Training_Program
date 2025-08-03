package MileStone_2;

import java.util.HashMap;

public class First_Duplicate {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 3, 4, 5};
        System.out.println("Output: " + findFirstDuplicate(nums));
    }

    public static int findFirstDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean hasPositive = false;

        for (int num : nums) {
            if (num > 0) {
                hasPositive = true;
                if (map.containsKey(num)) {
                    return num;
                } else {
                    map.put(num, 1);
                }
            }
        }

        if (!hasPositive) return 0;
        return -1;
    }
}

