import java.util.Scanner;

class Print_Num1toN{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // it takes the input from user
System.out.println("Enter integer number");   

if(! input.hasNextInt()){   // input.hasNextInt() → ✅ Returns true
    System.out.println("You have enter Invalid credentials. Please enter valid crendtials");
    return;

}
int user = input.nextInt(); // input.nextInt() → ✅ Reads 5 safely

if(user <= 0){
    System.out.println("You have enter negative or zero number");
    return;
}
        System.out.println("Number from 1 to " + user + " : ");
        for(int number = 1; number <= user; number++){
System.out.println( number);

        }
    }
}