package Patterns.AdditionalQuestions;

public class Pattern6 {
    public static void main(String[] args) {
        for(int row = 1 ;row<=4 ;row++){
            for(int column = 1 ;column<=4 ;column++) {
                if (row == 1 || row == 4 || column == 1 || column == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
