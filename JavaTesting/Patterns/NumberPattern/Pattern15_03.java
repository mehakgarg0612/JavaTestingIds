package Patterns.NumberPattern;

//321
//21
//1

public class Pattern15_03 {
    public static void main(String[] args) {
        for(int row = 3 ; row>=1 ; row--){
            for(int column = row ; column >= 1 ;column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
