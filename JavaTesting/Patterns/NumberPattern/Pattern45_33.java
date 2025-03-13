package Patterns.NumberPattern;

public class Pattern45_33 {
    public static void main(String[] args) {

        int count = 1;
        for(int row = 1 ; row <= 4 ;row++){
            for(int column =row; column<=count;column++){
                System.out.print(column + " ");
            }
            count +=2;
            System.out.println();
        }
    }
}
