package Patterns.NumberPattern;

public class Pattern28_16 {
    public static void main(String[] args) {
        for(int row = 1; row<=4 ; row++){
            for(int column = 1; column <= row ; column++){
                if(column == 1 || column == 3){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
