package Patterns.AdditionalQuestions;

public class Pattern7 {
    public static void main(String[] args) {
        for(int row = 1; row<=3; row++){
            for(int column = 1 ; column<=3 ;column++){
                if(row == column|| row + column == 6){
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
