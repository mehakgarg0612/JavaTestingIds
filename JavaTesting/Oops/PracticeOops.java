package Oops;

public class PracticeOops {

    PracticeOops(){
        System.out.println("i am default constructor");
    }

    PracticeOops(int x){
        System.out.println("i am not a default  constructor " + x);
    }


    public static void main(String[] args) {
        PracticeOops obj = new PracticeOops(5);

    }
}
