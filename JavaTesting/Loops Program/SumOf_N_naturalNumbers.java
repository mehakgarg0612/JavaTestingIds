import java.util.Scanner;

public class SumOf_N_naturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an positive integer number:");

        if(! input.hasNextInt()){
            System.out.println("You have enter invalid credentials. Please enter integer.");
            return;
        }
        int user = input.nextInt();

        if(user < 0){
           System.out.println("You have enter negative or zero number");
           return;
        }
        // if(user == 0){    // not necessary to write
        //     System.out.println("Your output will be " + user);
        //     return;
        // }
        int sum = 0;
        for(int number =1 ; number<=user ; number++){
            sum = sum + number;

        }
        System.out.println("Sum of all natural numbers: " + sum);
}
}
