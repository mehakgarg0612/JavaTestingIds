package Patterns.NumberPattern;

public class Pattern43_31 {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row);
                if (column < row) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

            for (int row1 = 2; row1 >= 1; row1--) {
                for (int column1 = 1; column1 <= row1; column1++) {
                    System.out.print(row1);
                    if (column1 < row1) {
                        System.out.print("*");
                    }

                }
                System.out.println();
            }
        }
    }

