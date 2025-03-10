package Github_questions.EasyQuestions;

import java.util.Scanner;

public class GivenYearIsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        if (input.hasNextInt()) {
            int user = input.nextInt();
            if (user > 0) {
                if ((user % 4 == 0 && user % 100 != 0) || user % 400 == 0) {
                    System.out.println("Leap year");

                }
                else {
                    System.out.println("Not a leap year");

                }
            }
            else{
                System.out.println("you have enter negative number");
            }
        }
        else{
            System.out.println(" Invalid credentials");
        }
    }
}
