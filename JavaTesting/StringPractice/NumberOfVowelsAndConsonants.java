package StringPractice;

public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String name = "polika";
        int vowels = 0;
        int cons = 0;

        for(int i = 0 ; i <name.length() ; i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e'||name.charAt(i) == 'i' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u' ){
                vowels += 1;
            }
            else{
                cons += 1;
            }
        }
        System.out.println("total number of vowels " + vowels);
        System.out.println("total number of consonnats " + cons);
    }
}
