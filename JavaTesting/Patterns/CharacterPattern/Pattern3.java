package Patterns.CharacterPattern;

public class Pattern3 {
    public static void main(String[] args) {
        char row,column , columnK;
        for(row = 65; row<=67; row++){
            for(column = 1; column<=( 67-row ); column++){
                System.out.print(" ");
            }
            for(columnK = 65; columnK <= row ; columnK++ ){
                System.out.print(columnK + " ");
            }
            System.out.println();
        }
    }
}
