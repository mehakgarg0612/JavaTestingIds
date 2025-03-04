public class Logical {
    public static void main(String[] args){
         //range_10_50();
        // leap_year();
         //positive_and_even();
         char_vowel_consonant();

}

public static void range_10_50(){
byte num = 67;
if(num>10 && num<50){
    System.out.println("Number is between 10 to 50");
}
else{
System.out.println("Number is not between 10 to 50");
}
}


public static void positive_and_even(){
byte num = 7;
if (num>0 && num % 2 == 0){
System.out.println( "Number is both postive and even");
}
else if (num>0  && num % 2 == 0){
System.out.println("Number is positive but not even");
}
else{
System.out.println( "Number is neither positive nor even");
}
}


public static void char_vowel_consonant(){
    char name = 'a';
    if(name == 'a' ||name == 'e' || name == 'i' || name == 'o' || name == 'u' || name == 'A' || name == 'E' || name == 'I' || name == 'O' || name == 'U'){
        System.out.println("character is vowel");
    } 
    else{
        System.out.println("Character is consonant");
    }
}

public static void leap_year(){
    
}























}