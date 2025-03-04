import java.util.Scanner;

public class Product_Of_Digits {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an positive integer number:");
       


        try{
             int user = input.nextInt();
             int IsNegative = (user < 0) ? -1 : 1;
             user = Math.abs(user);
             
             if(user == 0){
                System.out.println("Product is : " + user);
                return;
             }

        int remainder;
        long multiply = 1;
        while(user > 0){
            remainder = user % 10;
            multiply = multiply * remainder;
            user = user/10;
        }

        System.out.println("Product of disgits is: " +( multiply * IsNegative));
}
catch(Exception e){
    System.out.println("you have enter the invalid string");
}
}
}
