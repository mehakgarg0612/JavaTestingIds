package StringPractice;

public class RemoveAllOccurencesOfAGivenCharacter {
    public static void main(String[] args) {
        String name = "Pollika";
        char ch = 'l';
        String name2 = "";

        for(int i = 0 ; i < name.length() ; i++){
            if(name.charAt(i) != ch){ //
                name2 += name.charAt(i);
            }
        }
        System.out.println(name2);
    }
}
