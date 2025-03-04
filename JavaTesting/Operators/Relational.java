public class Relational {
    public static void main(String[] args){
   
    Two_numbers_are_equal();
    Larger_floating_point();
    eligible_to_vote();
    Compare_strings();


   }


public static void Two_numbers_are_equal(){
   byte num1=9;
   byte num2=10;
   if(num1==num2){
   
  System.out.println("Both numbers are equal");
}
  else{
         System.out.println( "Both numbers are not equal");
}
}
    

public static void Larger_floating_point(){
float num1 = 8.98f ;
float num2 = 9.08f;
if (num1>num2) {
System.out.println("num is greater: " + num1);
}
else{

System.out.println("num2 is greater: "+ num2);
}
}


public static void eligible_to_vote(){
byte age = 15;
if (age < 18){
System.out.println("Not eligible to vote");
}
else{

System.out.println("Eligible to vote");
}
}

// Write a program to compare two strings using == and •equals(). 
public static void Compare_strings(){
String name = "Monika" ;
 String name2="Monika";
 if(name==name2) // or  if(name.equals(name2)) 
 {
System.out.println("Both strings are same");
 }
else{
System.out.println("none of the strings are same");
}
}
































}
