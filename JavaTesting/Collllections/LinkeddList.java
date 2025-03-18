package Collllections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkeddList {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();
        l1.add("cwc");
        l1.add(23);
        l1.add("eewq");

        LinkedList ll = new LinkedList(l1);

        ll.add("xxwe");
        ll.add(23);
        ll.add("xewxde");
        ll.add(23.23);

        /* ll.addFirst("aaa");
        ll.addLast("aaaa");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.getFirst()); */



        System.out.println(ll);
    }
}
