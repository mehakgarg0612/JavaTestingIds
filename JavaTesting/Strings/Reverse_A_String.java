package Strings;

import java.util.*;

public class Reverse_A_String {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String user = input.nextLine();
    String reverse = "";

    if(user.trim().equals("")){
        System.out.println("Reverse of the string is: (empty string)");
        return;
    }
    for(int start = user.length() - 1; start >= 0 ; start--){
        reverse += user.charAt(start); // use String concatenation(+) to add char to string
        

    }
    System.out.println("Reverse of a string is :"+ reverse);


}
}
