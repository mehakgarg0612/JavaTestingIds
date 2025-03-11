package Patterns.CharacterPattern;

public class Pattern2 {
    public static void main(String[] args) {

        char row1,column1;
        for(row1 = 67 ; row1 >= 65 ; row1--){
            for(column1 = 65 ; column1 <= row1 ; column1++){
                System.out.print(column1);
            }
            System.out.println();
        }
    }
}
