

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
    //largest_three_numbers();
    //positive_negative_zero();
    // char_vowel_consonant();
    //leap_year();------------------- doubt------------
    Perfect_Square();
    }


public static void largest_three_numbers(){
    int num1 = 90;
    int num2 = 20;
int num3 = 100;
if(num1>num2 && num1>num3)
    {
    System.out.println("Num1 is greater: " + num1);
    }
else if (num2>num1 && num2>num3) {
System.out.println("Num1 is greater: " + num2);
}
else {
System.out.println("Num3 is greater: " + num3);

}
}


public static void positive_negative_zero(){
int num = 9; 
if(num < 0){
System.out.println("negative number: " + num);
}
else if (num > 0){
System.out.println("positive number : " + num);
}
else{
System.out.println("number is zero: " + num);
}
}


public static void char_vowel_consonant() {
    char name = 'a';
    if (name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u' || name == 'A' || name == 'E'
            || name == 'I' || name == 'O' || name == 'U') {
        System.out.println("character is vowel");
    } else {
        System.out.println("Character is consonant");
    }
}


public static void leap_year(){
    int year = 2025;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }


public static void Perfect_Square(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int num = input.nextInt();
    System.out.println(num*num);
}









}















