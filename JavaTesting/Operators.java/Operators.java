
class Operators {
    public static void main(String[] args){
        //-----ARITHMETIC OPERATORS-----------

        // AddMulDivSub2Num();
        //EvenOdd();
        //SwapWithout_3Variable
        //AreaOfCircle();

        //-----------RELATIONAL OPERATORS-----------------------

        //Two_numbers_are_equal();
        //Larger_floating_point();
        //eligible_to_vote();
        // Compare_strings();


        //----------------------LOGICAL OPERATORS-------------------
        //range_10_50();
        //leap_year();
        //eligible_for_a_discount();
        //positive_and_even();
     
    }
    

// ---------------------  ARITHMETIC OPERATORS -------------------------------------

public static void AddMulDivSub2Num(){
    byte num1 = 9, num2 = 8;
    System.out.println("Result of Addition is :" + (num1 + num2));
    System.out.println("Result of Subtraction is :" + (num1 - num2));
    System.out.println("Result of Multtiplication is :" + (num1 / num2));
    System.out.println("Result of Division is :" + (num1 * num2));
    System.out.println("Result of Modulus is :" + (num1 % num2));
}


public static void EvenOdd() {

    byte num2 = 9;
    if (num2 % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }

}

/*public static void SwapWithout_3Variable(){

    byte num1 = 9, num2 = 3, num3 =num1;
    num1 = 0 + num2;


}*/

public static void AreaOfCircle(){

    byte radius = 3;
    float pie = 3.14f ;
    System.out.println("area of circle : " + (pie*(radius*radius)));

}

// -------------------- RELATIONAL OPERATORS --------------------------------------------

public static void Two_numbers_are_equal(){
    byte num1 = 9 , num2= 10;
    if(num1 == num2){
        System.out.println("Both numbers are equal");
    }
    else{
        System.out.println("Both numbers are not equal");
    }
}

public static void Larger_floating_point(){
    float num1 = 8.98f , num2 = 9.08f;
    if(num1>num2){
        System.out.println("num1 is greater: " + num1);
    }
    else{
        System.out.println("num2 is greater: "+ num2);
    }
}

public static void eligible_to_vote(){
    byte age = 15;
    if(age < 18){
        System.out.println("Not eligible to vote");
    }
    else{
        System.out.println("Eligible to vote");
    }

}

//Write a program to compare two strings using == and .equals().
public static void Compare_strings(){
    String name = "Monika" , name2 = "Monika";
    /*if(name == name2)*/ if(name.equals(name2)){
        System.out.println("Both strings are same");
    }
    else{
        System.out.println("none of the strings are same");
    }


}

//________________________ LOGICAL OPERATORS________________________________________


public static void range_10_50(){

    byte num = 67;
    if(num > 10 && num < 50){
        System.out.println("Number is between 10 to 50");
    }
    else{
        System.out.println("Number is not between 10 to 50");
    }

}

/*public static void leap_year{
    byte
}*/

//Determine if a person is eligible for a discount (age > 60 OR first-time customer).
/* 
public static void eligible_for_a_discount(){
    byte age = 60;
    if(age>60 && )

}*/

public static void positive_and_even(){
    byte num = 7;
    if(num>0 && num % 2 == 0){
        System.out.println("Number is both postive and even");
    }
    else if(num>0 && num % 2 != 0){
        System.out.println("Number is positive but not even");
    }
    else{
        System.out.println("Number is neither positive nor even");
    }

} 

public static void character_is_a_vowel(){
    char character = 'b';
    char[] character3 = {'a','e','i','o','u'};
    //if(character )

}












}