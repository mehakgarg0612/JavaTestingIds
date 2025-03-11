package Patterns.Starrpattern;
//    *
//  * *
//* * *

public class Pattern5 {

    public static void  starPattern(){
        for(int row = 1 ;  row <= 3 ; row++){
            for(int column = 3 ; column >= row ;  column--) {
                System.out.print(" ");
            }

            for (int column_j = 1; column_j <= row; column_j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern5.starPattern();
    }
}


/*class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=3;i++){
            for(int j = 3; j >= i ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/