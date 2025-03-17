package StringPractice;

public class RemoveCharacterfromSpecialCharacter {

    public static void main(String[] args) {
        String name = "Me@#$h)u^l";

        String newName = "";
        for(int i = 0; i <name.length() ; i++){
            char ch = name.charAt(i);

           /* if((ch < 65 && ch > 90) || (ch < 97 && ch > 122))*/ if ((ch < 65 || (ch > 90 && ch < 97) || ch > 122)){
                newName += ch;
            }
        }
        System.out.println(newName);
    }
}
