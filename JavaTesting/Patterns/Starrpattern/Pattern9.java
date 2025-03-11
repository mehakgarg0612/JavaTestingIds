package Patterns.Starrpattern;

public class Pattern9 {
    public static void main(String[] args) {
        for(int row = 1; row<=3 ;row++){
            for(int column = 1; column <= row ; column++){
                System.out.print(" ");
            }
            for(int column_k = 3 ; column_k >=row ; column_k--){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int row = 2 ;  row <= 3 ; row++){
            for(int column = 3 ; column >= row ;  column--) {
                System.out.print(" ");
            }

            for (int column_j = 1; column_j <= row; column_j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
