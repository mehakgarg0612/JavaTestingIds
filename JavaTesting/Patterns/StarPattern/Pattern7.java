package Patterns.StarPattern;

//***
//**
//*
//**
//***

public class Pattern7 {
    public static void main(String[] args) {
        for(int row = 1; row <= 4 ; row++){
            for(int column = 4 ; column >= row ; column--){
                System.out.print(" * ");
            }
            System.out.println();
        }


        for(int row1 = 1 ; row1 <= 3 ;row1++){
            for(int column2 = 1; column2 <= row1 + 1 ; column2++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
