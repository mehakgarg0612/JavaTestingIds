package Patterns.NumberPattern;

public class Pattern20_08 {
    public static void main(String[] args) {
        for(int row = 3; row>=1 ; row--){
            for(int column = 3 ; column>=row ; column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
