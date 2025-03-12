package Patterns.NumberPattern;

public class Pattern37_25 {
    public static void main(String[] args) {
        for(int row = 1 ; row<=5; row++){
            for(int column = row ; column <=5; column++){
                if(row<=3){
                    System.out.print(row);
                }
                else{
                    System.out.print(6-row);
                }
            }
            System.out.println();
        }
    }
}
