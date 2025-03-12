package Patterns.NumberPattern;

public class Pattern36_24 {
    public static void main(String[] args) {
        int count = 1;
        for(int row = 1; row<=3;row++){
            count += row;
            for(int column = 1 ; column<5;column++){
                System.out.print("");
            }
            for(int k = count ; k <= row + 1 ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
