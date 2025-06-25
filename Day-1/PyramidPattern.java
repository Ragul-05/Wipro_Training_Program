import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid pattern: ");
        int rows = sc.nextInt();
        printPyramid(rows);
        sc.close();
    }

    static void printPyramid(int rows){
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
