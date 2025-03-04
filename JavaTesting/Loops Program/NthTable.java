import java.util.Scanner;

public class NthTable {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        
        
try{
        int user = input.nextInt();
        // if(user < 0){
        //         System.out.println("You have enter negative integer");
        //         return;
//         }
        
        for(int number = 1; number<=10 ; number ++)
        {
                System.out.println(user + " x " + number + " = " + (user*number));
        }
}
catch(Exception e){
System.out.println("You have enter invlaid input");}

}
}



