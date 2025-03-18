package StringPractice;

public class RemovDuplicateCharacterFromString {
    public static void main(String[] args) {

        String name = "Polllika";
        String name2 = "";

        for(int i = 0 ; i <name.length() ; i++){

           if(name2.indexOf(name.charAt(i)) == -1){
               name2 += name.charAt(i);
           }
        }
        System.out.println(name2);

    }
}
