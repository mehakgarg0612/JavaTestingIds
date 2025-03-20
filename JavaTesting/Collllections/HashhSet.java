package Collllections;

import java.util.HashSet;
import java.util.Iterator;

public class HashhSet {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add(10);
        hs.add("wede");
        hs.add("eew");
        hs.add(10);
        hs.add(null);
        hs.add(null);
        hs.add(null);
        hs.add(true);
        System.out.println(hs.size());

//       Iterator obj =  hs.iterator();
//
//       while(obj.hasNext()){
//           System.out.println(obj.next());
//       }
//
//
//        System.out.println(hs);
    }
}
