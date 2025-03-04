import java.util.*;

public class StringIsPalindrome_OrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");

        String user = input.nextLine();

        String reverse = "";

        if(user.trim().equals("")){
            System.out.println("Reverse of the string is: (empty string)");
            return;
        }
        for(int start = user.length() -1 ; start >= 0 ; start--){
            reverse += user.charAt(start);
        }
        System.out.println("The reverse of string is : " + reverse);

        if(reverse.equals(user)){
            System.out.println("String is plaindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        

    }
    
}
