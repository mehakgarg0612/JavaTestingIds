package Patterns.NumberPattern;

public class Pattern44_32 {
    public static void main(String[] args) {

        int count = 11;
        for(int row = 11 ; row <= 14 ;row++){
            for(int column =row; column<=count;column++){
                System.out.print(column + " ");
            }
            count +=2;
            System.out.println();
        }
    }
}
