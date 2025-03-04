import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

       // Num_1_To_10();
        //Even_numbers_1_to_20();
       // Sum_n_natural_num();
       //Sum_n_natural_num2();
        //Factorial();
       // Multiplication();
        Prime_numbers();

    }
    


public static void Num_1_To_10(){
    for(int i = 0; i <= 10; i++){
System.out.println("numbers from 1 to 10 : " + i);

    }
}



public static void Even_numbers_1_to_20(){
    for (int i = 1; i<=20;i++){
        if(i%2 == 0){
            System.out.println(i);
        }
    }

}

public static void Sum_n_natural_num(){
    int sum = 0;
    for(int i = 1; i<=10;i++){
        sum += i;
        
    }
    System.out.println("Sum of n natural numbers " + sum);
}

public static void Sum_n_natural_num2() {
    Scanner input = new Scanner(System.in);
     System.out.println("Enter number");
     int N = input.nextInt();
    int sum = 0;
    for (int i = 1; i <= N; i++) {
        sum += i;

    }
    System.out.println("Sum of n natural numbers " + sum);
}

public static void Factorial(){
    int mul = 1;
    for (int i = 1; i <=5 ; i++){
        mul *= i;

    }
    System.out.println("Factorial of n natural numbers " + mul);
}

/*public static void Reverse_a_number(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int num = input.nextInt();

}*/


public static void Multiplication(){
    int mul = 1;
    int n = 7;
    for (int i = 1 ; i <=10 ; i++){
        // mul = i;
System.out.println("Multiplication : " + (n + "x" + i + "=" + n*i));

    }
    
}

public static void Prime_numbers(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int a = input.nextInt();
    if (a <= 0){
        System.out.println("not prime");
    }
    if (a>0){
        for(int i = 2; a < i ; i++){
            if(a%i == 0){
                System.out.println("not prime");
            }
            
        }
    
                System.out.println(" prime");
            
    }
}

}
