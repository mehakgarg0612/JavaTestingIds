package Github_questions.EasyQuestions;

import java.util.Scanner;

public class CheckWhetherNumberEvenOrOdd {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter positive number");

        if(user.hasNextInt()) {
            int number = user.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even ");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        }
        else{
            System.out.println("You have enter invalid crenditals");
        }
    }
}
