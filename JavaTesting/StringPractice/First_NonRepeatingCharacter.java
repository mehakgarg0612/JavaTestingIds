package StringPractice;

public class First_NonRepeatingCharacter {

    public static void main(String[] args) {
         String name = "swiss";

         for(int i =0 ; i <name.length() ; i++){
             char ch = name.charAt(i);
             if(name.indexOf(ch) == name.lastIndexOf(ch)){
                 System.out.println(ch);
                 break;
             }
         }
    }
}
