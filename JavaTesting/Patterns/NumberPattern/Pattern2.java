package Patterns.NumberPattern;

//123
//12
//1
public class Pattern2 {
    public static void main(String[] args) {
        for(int row = 3 ; row >= 1; row--){
            for(int column = 1 ; column <=row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
