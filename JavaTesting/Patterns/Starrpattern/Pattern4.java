package Patterns.Starrpattern;

//  *  *  *  *
//    *  *  *
//     *  *
//      *

public class Pattern4 {
        public static void main(String[] args) {
            for(int row = 1; row<=4 ;row++){
                for(int column = 1; column <= row ; column++){
                    System.out.print(" ");
                }
                for(int column_k = 4 ; column_k >=row ; column_k--){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

