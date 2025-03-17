package Strings;

import java.util.Scanner;

public class ConvertA_StringToTitleCase { // first letter of each word capitalized
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String user = input.nextLine();
    String result = "";
    
    for(String word : user.split(" ")){
        if(!word.isEmpty()){
            result += word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";

        }
    }
        System.out.println(result);
    }
}
    
