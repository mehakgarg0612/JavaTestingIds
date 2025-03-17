package StringPractice;

public class STringIsPalindrome {
    public static void main(String[] args) {

        String name = "madam";
        String reverse = "";
        for(int start = name.length()-1 ; start >= 0 ; start--){
            reverse += name.charAt(start);
        }

        if(name.equals(reverse)){
            System.out.println("STring is Plaindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
