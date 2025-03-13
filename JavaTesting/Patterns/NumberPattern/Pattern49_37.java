package Patterns.NumberPattern;

public class Pattern49_37 {
    public static void main(String[] args) {

        for(int row = 1;row<=3; row++){

            for(int column = row; column>=1; column--){
                System.out.print(column);
            }

            for(int column = 2; column <= row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }

    }
}
