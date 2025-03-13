package Patterns.NumberPattern;

public class Pattern42_30 {
    public static void main(String[] args) {
        int count = 0;
        for(int row =1 ;row<=3;row++){
           for(int column = row ; column<=3;column++){
               System.out.print(" ");
           }

           for(int k = count + 1 ; k>=1; k--){
               System.out.print(k);
           }
           count++;
            System.out.println();
        }


    }
}
