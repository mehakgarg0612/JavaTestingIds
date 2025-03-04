import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //Reverse_a_number();
        Armstrong();

    }

    public static void Reverse_a_number() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int num2 = num;
        int rev = 0;
        int rem;

        while (num2 > 0) {
            rem = num2 % 10;
            rev = rev * 10 + rem;
            num2 = num2 / 10;
        }
        System.out.println("reverse number is : " + rev);

    }

    public static void Armstrong() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int num2 = num;
        int sum = 0;
        int rem;

        while (num2 > 0) {
            rem = num2 % 10;
            sum += rem*rem*rem;
            num2 = num2 / 10;
        }
        System.out.println("sum is : " + sum);
        if(sum == num){
            System.out.println("Armstrong it is");
        }
        else{
            System.out.println("not armstrong");
        }

    }

public static void Fibonacci_series()
{
    Scanner input = new Scanner(System.in);
    System.out.println("enter number");
    int num = input.nextInt();
    

}