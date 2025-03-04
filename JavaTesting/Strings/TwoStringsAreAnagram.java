import java.util.*;

public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string"); //komal
        String user = input.nextLine();
        System.out.println("Enter another string"); 
        String user_Input = input.nextLine();

        char[] First_array = user.toCharArray();
        char[] Second_array = user_Input.toCharArray();

        Arrays.sort(First_array);
        Arrays.sort(Second_array);
       
        if(Arrays.equals(First_array, Second_array)){
            System.out.println("Both strings are anagram");
        }
        else{
            System.out.println("Both strings are not anagram ");
        }
    }
    
}
    
