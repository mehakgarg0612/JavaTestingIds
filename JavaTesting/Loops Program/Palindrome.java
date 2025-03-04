import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");

        try{
        int user = input.nextInt();
        if(user < 0){
          System.out.println("Number is not palindrome (Negative numbers cannot be palindromes).");
          return;
        }

        int number = user;
        int remainder;
        int reverse = 0;

      while (number != 0){
        remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
      }
      System.out.println("Reverse of a number is: "+ reverse);

      if(user == reverse){
        System.out.println("Number is plaindrome");
      }
      else{
        System.out.println("Number is not palindrome");
      }
}
catch(Exception e){
  System.out.println("you have enter an invlaid input");
}
}
}



