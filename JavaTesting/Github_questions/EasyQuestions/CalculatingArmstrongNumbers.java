package Github_questions.EasyQuestions;

import java.util.Scanner;

public class CalculatingArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        if (input.hasNextInt()) {
            int user = input.nextInt();

            if (user <= 0) {
                System.out.println("You have enter a negative or zero number");
            } else {
                int remainder;
                int sum = 0;
                int number = user;
                while (number > 0) {
                    remainder = number % 10;
                    sum = sum + remainder * remainder * remainder;
                    number = number / 10;
                }


                if (sum == user) {
                    System.out.println("It's an armstrong number");
                } else {
                    System.out.println("Not an armstrong number");
                }
            }
        }
        else {
            System.out.println("you have enter invalid credentials");
        }
    }
}
