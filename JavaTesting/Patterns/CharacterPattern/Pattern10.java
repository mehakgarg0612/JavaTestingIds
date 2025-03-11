package Patterns.CharacterPattern;

public class Pattern10 {
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

        char row1,column1,columnK1;

        for( row1 =66 ; row1 >= 65;row1-- ){
            for(column1 = 1; column1 <= (67 - row1);column1++){
                System.out.print(" ");
            }
            for(columnK1 = 65 ; columnK1 <= row1 ; columnK1++){
                System.out.print(columnK1 + " ");
            }
            System.out.println();
        }
    }
}
