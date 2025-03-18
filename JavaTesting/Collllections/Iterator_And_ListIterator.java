package Collllections;

import java.util.*;

public class Iterator_And_ListIterator {
    public static void main(String[] args) {

        //Iterator

      /*  List l = new ArrayList();
        l.add(10);
        l.add("deepak");
        l.add("komal");
        l.add("ascsac");
        System.out.println(l);

     Iterator itr = l.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }

     l.remove("ascsac");
        System.out.println(l); */


        //List Iterator

        List li2 = new ArrayList();
     li2.add(10);
     li2.add("cc");
     li2.add("caa");

      ListIterator it2 =li2.listIterator();

      while(it2.hasNext()){
          System.out.println(it2.next());
      }

        while(it2.hasPrevious()){
            System.out.println(it2.previous());
        }
        

//        li2.set(0,900);
//        System.out.println(li2);
    }
}
