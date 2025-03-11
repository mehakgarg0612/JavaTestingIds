package Patterns.CharacterPattern;

public class Pattern7 {
    public static void main(String[] args) {

        char row1,column1;
        for(row1 = 67 ; row1 >= 65 ; row1--){
            for(column1 = 65 ; column1 <= row1 ; column1++){
                System.out.print(column1);
            }
            System.out.println();
        }

        char row,column;
        for(row = 66 ;  row<=67 ; row++){
            for(column=65 ; column <= row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }


    }
}
