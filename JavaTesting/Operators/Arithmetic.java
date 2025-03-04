
public class Arithmetic{
    public static void main(String[] args){
        //AddMulDivSub2Num();
       // EvenOdd();
        //SwapWithout_3Variable();
        AreaOf_Circle();
    }


public static void AddMulDivSub2Num(){
    byte num1 = 9, num2 = 8;

System.out.println("Result of Addition is :"+(num1+num2));
System.out.println("Result of Subtraction is :" + (num1 - num2));
System.out.println("Result of Multiplication is :" + (num1 / num2));
System.out.println("Result of Division is :" + (num1 * num2)) ;
System.out.println("Result of Modulus is :" + (num1 % num2)) ;
}



public static void Evenodd() {
byte num2 = 9;
if (num2 % 2 == 0){
System.out.println( "Even");
}
else{}
System.out.println("Odd");
}


public static void SwapWithout_3Variable(){
    int a = 2;
    int b = 3;
    a = a + b ;
    b = a - b;
    a = a - b;

    System.out.println("Now the value of a : " + a);
    System.out.println("Now the value of b : " + b);

}

public static void AreaOf_Circle(){
byte radius = 3; 
float pie = 3.14f ;
System.out.println("area of circle: " + (pie*(radius*radius )));

}
}
