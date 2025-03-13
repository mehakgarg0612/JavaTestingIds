package Patterns.NumberPattern;

public class Pattern46_34 {
    public static void main(String[] args) {


        int count = 0;
        for(int row = 0 ; row <= 5 ;row++){
            for(int column =row; column<=count;column++){
                System.out.print(column + " ");
            }
            count +=2;
            System.out.println();
        }
    }
}
