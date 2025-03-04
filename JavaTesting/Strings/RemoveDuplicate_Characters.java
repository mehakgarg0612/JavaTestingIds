import java.util.Scanner;

public class RemoveDuplicate_Characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String user = input.nextLine();

        user = user.toLowerCase();
        String result = "";
        for(int start = 0; start <user.length() ; start++){
            char character = user.charAt(start);

            if(result.indexOf(character) == -1){
                result += character;
            }
        }
        System.out.println(result);
    }
}
