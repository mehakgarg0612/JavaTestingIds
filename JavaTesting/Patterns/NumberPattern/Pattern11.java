package Patterns.NumberPattern;

public class Pattern11 {
    public static void main(String[] args) {
        for(int row = 1 ; row <=3 ; row++){
            for(int column = 1 ; column <= row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }

        for(int row = 2 ; row >= 1; row--){
            for(int column = 1 ; column <=row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
