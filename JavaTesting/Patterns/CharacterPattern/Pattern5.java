package Patterns.CharacterPattern;

public class Pattern5 {
    public static void main(String[] args) {
        char row,column , columnK;
        for(row = 65; row<=67; row++){
            for(column = 65; column<=( 67-row ); column++){
                System.out.print(column);
            }
            for(columnK = 65; columnK <= row ; columnK++ ){
                System.out.print(columnK);
            }
            System.out.println();
        }
    }
}
