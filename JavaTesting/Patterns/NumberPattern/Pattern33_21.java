package Patterns.NumberPattern;

public class Pattern33_21 {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++){
            int number = row;
            for(int column = 1 ; column <= row ; column ++){
                System.out.print(number + " ");

                number += (5 - column);
            }
            System.out.println();
        }
    }
}
