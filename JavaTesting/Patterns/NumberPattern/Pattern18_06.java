package Patterns.NumberPattern;

public class Pattern18_06 {
    public static void main(String[] args) {

        for(int row = 3; row>=1 ; row--){
            for(int column = row; column<=3 ; column++){
                System.out.print(column);
            }
            System.out.println(  );
        }
    }
}
