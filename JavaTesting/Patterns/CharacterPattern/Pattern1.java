package Patterns.CharacterPattern;

public class Pattern1 {
    public static void main(String[] args) {
        char row,column;
        for(row = 65 ;  row<=67 ; row++){
            for(column=65 ; column <= row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
