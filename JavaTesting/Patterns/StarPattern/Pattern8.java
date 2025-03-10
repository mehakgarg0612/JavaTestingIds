package Patterns.StarPattern;

public class Pattern8 {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" ");
            }

            for (int column_k = 4; column_k >= row; column_k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        for(int row2 = 1 ; row2 <= 4 ; row2++){
            for(int column2 = 4; column2 >=1 ; column2--){
                System.out.print(" ");
            }
            for(int column2_k = 1 ; column2_k <= row2 ; column2_k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

