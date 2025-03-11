package Patterns.AdditionalQuestions;

public class Pattern2 {
    public static void main(String[] args) {
        for(int row = 1 ; row<=5 ; row++){
            for(int column = 1 ; column <=5; column++){
                if(row==(5/2)+1 || column == (5/2)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
