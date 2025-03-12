package Patterns.NumberPattern;

public class Pattern34_22 {
    public static void main(String[] args) {
        for(int row= 1 ; row<=3 ; row++){

            int number = 1 +(row-1) * 2;
            for(int column = 1 ; column<= number; column++){
                System.out.print(column);
            }
            System.out.println();
        }

        }
    }

