package Patterns.NumberPattern;
//   1
//  1 2
// 1 2 3

public class Pattern3o {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
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
