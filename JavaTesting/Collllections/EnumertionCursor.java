package Collllections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumertionCursor {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Sdcsd");
        v.add("cdc");
        System.out.println(v);

        Enumeration e = v.elements();
       while(e.hasMoreElements()){
           System.out.println(e.nextElement());
       }

        Iterator e1  = v.iterator();
       while(e1.hasNext()){
           System.out.println(e1.next());
       }
    }
}
