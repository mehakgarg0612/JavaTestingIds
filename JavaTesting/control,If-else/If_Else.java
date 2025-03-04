public class If_Else {
    public static void main(String[] args){
        //largest_three_numbers();
        //positive_negative_zero();
        //char_vowel_consonant();
        leap_year();



    }

public static void largest_three_numbers(){
    int num1 = 90; 
    int num2 = 20;
    int num3 = 100;
    if (num1>num2 && num1>num3){
        System.out.println("Num1 is greater: " + num1);
    }

    else if (num2>num1 && num2>num3){
        System.out.println("Num1 is greater: " + num2);
    }

    else {
        System.out.println("Num3 is greater: " + num3);
    }

}

public static void positive_negative_zero(){

    int num = 9;
    if (num < 0){
        System.out.println("negative number : " + num);
    }
    else if (num > 0){
        System.out.println("positive number : " + num);
    }
    else{
        System.out.println("number is zero: " + num);
    }


}


/*public static void char_vowel_consonant(){
    char[] alpha = {'a','e','i','o','u'};
    char alpha2 = 'e';
    if (alpha[0]==alpha2){
        System.out.println("char is vowel");
    }
    else{
        System.out.println("char is consonant");
    }
}*/

public static void char_vowel_consonant(){
    char alpha = 'a';
    if(alpha == 'a'||alpha == 'e'||alpha =='i'||alpha =='o'||alpha=='u'||alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
    {
       System.out.println("Character is vowel : " + alpha);


    }
    else{
        System.out.println("Character is consonant : "  + alpha);
    }
}


public static void leap_year(){
    int leap_year = 2001;
    if(leap_year %400 == 0 || leap_year% 100 == 0 && leap_year %4 == 0 ){
        System.out.println("It's a leap year");
    }
    else{
        System.out.println("It's not a leap year");
    }
    
}
}
