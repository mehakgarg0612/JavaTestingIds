package Patterns.NumberPattern;

public class Pattern48_36 {
    public static void main(String[] args) {
        for(int row = 3; row>=1;row--){

            for(int space = 1 ; space <= row - 1 ; space++){
                System.out.print(" ");
            }
            for(int column = 3; column>=row;column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
