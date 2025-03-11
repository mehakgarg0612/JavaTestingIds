package Patterns.NumberPattern;

// 1 2 3
//  1 2
//   1

public class Pattern4 {
    public static void main(String[] args) {
        for (int row = 3; row >= 1; row--) {
            for (int column = 1; column <= 3 - row; column++) {
                System.out.print(" ");
            }
            for (int columnK = 1; columnK <= row; columnK++) {
                System.out.print(columnK + " ");
            }
            System.out.println();
        }
    }
}
