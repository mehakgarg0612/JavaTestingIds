package Patterns.NumberPattern;

//123
//23
//3


public class Pattern14_02 {
    public static void main(String[] args) {
        for(int row = 1 ; row <=3 ; row ++){
            for(int column = row ; column<=3 ; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}