import java.util.*;
public class Even_numbers1ToN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integer from 1 to N number");

        if(!input.hasNextInt()){
            System.out.println("You have enter invalid credentials. Please enter integer.");
            return;
        }
        int user = input.nextInt();

        if(user <= 0){
            System.out.println("You have enter negative or zero number");
            return;
        }
        if(user > 1000000){
            System.out.println("You have enter long integer, Execution may be slow.");
        }
        if(user == 1){
            System.out.println("There will be no even number between range 1");
            return;
        }
        System.out.println("Even number from 1 to " + user + ":");
        for(int number = 1; number <= user; number++){  // for (int number = 2; number <= user; number += 2) { // Optimized: Increment by 2
            if(number%2 == 0){
                System.out.println(number);
            }
}

    }
}