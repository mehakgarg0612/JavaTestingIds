import java.util.*;
public class Prime_number{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Positive integer");
  

  try {
     int  user = input.nextInt();
    if(user <= 1){
        System.out.println(user + " is not a prime number");
        return;
    }
    
    int temporary_no = 0;
    for(int number = 2 ; number <= user -1; number ++){
        if(user% number == 0){
        temporary_no = temporary_no + 1;
    }
<<<<<<< HEAD
}
if(temporary_no > 0){
    System.out.println("Number is not prime number");
}
else{
    System.out.println("Number is prime number");
}
    }
}


 

=======
    }
   if (temporary_no > 0){
        System.out.println(user+ "  is not a prime number");
    }
    else{
        System.out.println(user + " is a prime number");

}
  }
catch(Exception e)
{
    System.out.println("You have enter invalid input");
}
}
}
>>>>>>> 2d7ac3d063a48823d2fdf817d666dfd35a14415c

    

