

public class FindElement {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    
        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            int target = 5;
            if (findelement(arr, target)) {
                System.out.print("Element Found");
            }
        }

        static boolean findelement(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
            return false;
        }
    }

