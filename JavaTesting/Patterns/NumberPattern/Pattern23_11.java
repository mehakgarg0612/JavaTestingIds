package Patterns.NumberPattern;

public class Pattern23_11 {
    public static void main(String[] args) {
        for(int row = 3 ; row >=1 ; row--){
            for(int column = 1 ; column<=row ; column++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
