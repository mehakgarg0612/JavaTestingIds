package Patterns.NumberPattern;

public class Pattern26_14 {
    public static void main(String[] args) {
        for(int row = 7 ; row >= 1 ; row -= 2){
            for(int column = 1; column<=row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }

}
