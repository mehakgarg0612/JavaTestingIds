package Patterns.NumberPattern;

public class Pattern16_04 {
    public static void main(String[] args) {
        for(int row = 1 ;row<=3;row++){
            for(int column = 3 ; column>=row ; column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
