package Collllections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayyList {
    public static void main(String[] args) {

        ArrayList a12 = new ArrayList();

        a12.add(10);
        a12.add(20);
        a12.add(23.23);
        a12.add("Dcdsc");
        a12.add(20);

       /* System.out.println(a12);
        System.out.println(a12.contains(20));
        System.out.println(a12.size());
        System.out.println(a12.get(2));
        System.out.println(a12.set(1,22));
        System.out.println(a12);
        System.out.println(a12.indexOf(20));*/

             Iterator obj =a12.iterator();
             while(obj.hasNext()){
                 System.out.println(obj.next());
             }
//        a12.clear();
//        System.out.println(a12);

//        ArrayList a11 = new ArrayList();// AddAll
//        a11.addAll(a12);
//
//        System.out.println(a11);
    }
}
