package Patterns.NumberPattern;

public class Pattern39_27 {
    public static void main(String[] args) {
        for(int row = 1; row<=3;row++){
            for(int column = 1; column<=row; column++) {
                System.out.print(column);
            }

               for(int column = row -1 ; column >=1 ;column--){
                    System.out.print(column);
                }
            System.out.println();
            }

        }
    }

