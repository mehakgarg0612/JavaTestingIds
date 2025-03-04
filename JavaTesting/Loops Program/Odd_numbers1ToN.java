import java.util.*;

public class Odd_numbers1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive  integer from 1 to N number:");

        if(! input.hasNextInt()){
            System.out.println("You have enter invalid input. Please enter integer.");
            return;

        }
        int user = input.nextInt();
        if(user <= 0){
            System.out.println("You have enter negative or zero number");
            return;}

        if(user > 10000){
            System.out.println("You have enter long integer, Execution may be slow.");
            return;
        }
        if(user == 1){
            System.out.println("There is only one  odd number");
            return;
        }
    

        System.out.println("All odd numbers up to " + user + ":");
        for (int number = 1; number <= user; number += 2) { 
            System.out.println(number);
        }
    }
}



