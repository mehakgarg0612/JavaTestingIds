package Patterns.NumberPattern;

public class Pattern41_29 {
    public static void main(String[] args) {
        for(int row = 1; row<=3; row++){
            for(int column = 1;column<=row;column++){
                System.out.print(column);
            }

        for(int space = 1 ; space <= 2*(3-row); space++){
            System.out.print(" ");
        }

        for(int column = row ; column >= 1 ; column--) {
            System.out.print(column);
        }
            System.out.println();
        }
    }
}
