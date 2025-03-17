package Oops;

import Oops.Abstarction.Practice;


interface Car {
    void start();
}

interface Car2{
    void start2();
}

class Scooter implements Car , Car2{
   public void start(){
        System.out.println("Dcdcd");
    }

    public void start2(){
        System.out.println("Dcdcd");
    }

}
abstract class PracticeOops {
    public static void main(String[] args){

        Scooter onj = new Scooter();
        onj.start();
        onj.start2();


    }
}


