package Patterns.NumberPattern;

public class Pattern30_18 {
    public static void main(String[] args) {
        for(int row = 1 ; row <=9 ; row++){
            for(int column = row ; column <= row ; column += 2){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
