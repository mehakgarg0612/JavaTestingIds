import java.util.Scanner;

public class Reverse_order_from_Nto1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Positive integer number");

        try {
        int user = input.nextInt();
        if(user <= 0){
            System.out.println("Yoh have enter invalid number");
            return;
        }

        for(int number = user; number > 0 ; number-- ){
            System.out.println("Reverse order from Nth to 1 :"+ number);
        }
}
catch(Exception e){
    System.out.println("You have enter invalid input");
}
}
}