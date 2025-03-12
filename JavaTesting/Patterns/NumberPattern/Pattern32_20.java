package Patterns.NumberPattern;

public class Pattern32_20 {
    public static void main(String[] args) {

        int count =1;
        for(int row = 1 ;row<=4;row++){
            for(int column =1;column<=row;column++){
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }
    }
}
