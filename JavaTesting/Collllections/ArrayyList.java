package Collllections;

import java.util.ArrayList;

public class ArrayyList {
    public static void main(String[] args) {

        ArrayList a12 = new ArrayList();

        a12.add(10);
        a12.add(20);
        a12.add(23.23);
        a12.add("Dcdsc");
        a12.add(20);
        System.out.println(a12);
        a12.remove(2);
        System.out.println(a12);

        ArrayList a11 = new ArrayList();// AddAll
        a11.addAll(a12);
        
        System.out.println(a11);
    }
}
