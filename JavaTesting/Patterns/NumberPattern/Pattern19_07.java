package Patterns.NumberPattern;

public class Pattern19_07 {
    public static void main(String[] args) {
        for(int row = 1 ; row <=3; row++){
            for(int column = row ; column>=1;column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
