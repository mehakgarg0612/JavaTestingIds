package Patterns.AdditionalQuestions;

public class Pattern5 {
    public static void main(String[] args) {
        for(int row = 1 ;row<=5 ;row++){
            for(int column = 1; column<=5 ; column++){
                if(row==column || (row+column == 6)){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
