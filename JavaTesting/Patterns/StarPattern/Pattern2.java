package Patterns.StarPattern;
//
// * * * *
// * * *
// * *
// *

public class Pattern2 {
    public static void main(String[] args) {
        for(int row = 4 ; row >= 1 ; row --){
            for(int column = 1 ; column <= row ; column++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
