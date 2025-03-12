package Patterns.NumberPattern;

public class Pattern31_19 {
    public static void main(String[] args) {
        for(int row = 5 ; row >=1; row--){
            for(int column = row ; column <= 5 ; column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }


        for(int row1 = 4; row1 >=1;row1--){
            for(int column1 = 4; column1 >=row1;column1--){
                System.out.print(" ");
            }
            for(int columnK = 1; columnK<=row1;columnK++){
                System.out.print("5");
            }
            System.out.println();
        }
    }
}
