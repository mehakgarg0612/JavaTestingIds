package Patterns.AdditionalQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        for(int row = 1 ; row<=5 ; row++){
            for(int column = 1 ; column <=5; column++){
              if(row==3 || column ==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//if(row==3 || column ==3)