package Patterns.NumberPattern;
// SITE : CODE TO FUN

//123
//12
//1

public class Pattern13_01CTF {
    public static void main(String[] args) {
        for(int row = 3 ; row >= 1 ; row--){
            for(int column = 1 ; column <= row ; column++ ){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
