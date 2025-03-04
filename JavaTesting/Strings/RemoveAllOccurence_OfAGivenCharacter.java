import java.util.Scanner;

public class RemoveAllOccurence_OfAGivenCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String user = input.nextLine();

        System.out.println("Enter the character you want to remove");
        char remove_character = input.next().charAt(0);
        String result = "";

        for(int start = 0 ; start < user.length() ; start++){

            char character = user.charAt(start);
            if(character != remove_character){
                result += character;

            }

        }
        System.out.println("String after removing '" + remove_character + "': " + result);

    }



    
}
