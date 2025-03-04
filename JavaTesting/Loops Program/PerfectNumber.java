
public class PerfectNumber {
    public static void main(String[] args){
        //  Scanner input = new Scanner(System.in);     //6
        // System.out.println("Enter an integer number:"); 
        // int user = input.nextInt(); //6
       for(int i =1;i<=100;i++)
       { 
        if(i < 0){    // skip
                    System.out.println("Number is not perfect (Negative numbers cannot be perfect).");
                     }
        int number2 = i;  // 6 

         int sum = 0;
            
        for(int number = 1 ; number<=i - 1 ; number++){ // 1 1<=5 2
            if (number2%number==0){  // 6%1 == 0
               sum = sum + number;  // 0 = 0 +1
            }
         }
         if(sum == i){   //1==6
            System.out.println(i+"  It's a perfect number");
            }
            // else{
            //     System.out.println(i+ "It's not a perfect number"); 
            // }
        }
    }
}
