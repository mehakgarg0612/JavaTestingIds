import java.util.Scanner;

public class Number_OfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String user = input.nextLine();
       user =  user.toLowerCase();

       if(user.trim().equals("")){
        System.out.println("The string is: (empty string)");
       }
        

        int Vowels = 0;
        int Consonants = 0;

        for(int start = 0 ; start < user.length() ; start++){
            char ch = user.charAt(start);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                Vowels = Vowels +1;
            }
            else if(ch >= 'a' && ch <='z'){
                Consonants = Consonants + 1;
            }
        }
        System.out.println("Total number of vowels : " + Vowels);
        System.out.println("Total number of consonants : " + Consonants);
    }
    
}

