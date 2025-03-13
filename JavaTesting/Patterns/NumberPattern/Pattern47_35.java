package Patterns.NumberPattern;

public class Pattern47_35 {
    public static void main(String[] args) {

    int count = 1;
        for(int row = 1 ; row <= 4 ;row++){
            for(int column = 1 ; column <= 4 - row ; column++){
                System.out.print(" ");
            }
        for(int columnk = 1; columnk<=row;columnk++){
            System.out.print(count + " ");
            count +=1;
        }

        System.out.println();

      }
    }
}
