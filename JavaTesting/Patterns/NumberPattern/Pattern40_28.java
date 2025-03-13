package Patterns.NumberPattern;

public class Pattern40_28 {
    public static void main(String[] args) {


        for(int row =1 ; row<= 4; row++){
            int count = 9;
            for(int column =1 ; column <=row ;column++){
                if(row == column){
                    System.out.print("0");
                }
                else{
                    System.out.print(count);

                }
                count--;
            }
            System.out.println();
        }
    }
}
