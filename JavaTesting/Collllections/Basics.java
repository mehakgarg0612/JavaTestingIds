package Collllections;

//import java.util.Collection;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

        // collection methods

        ArrayList a1 = new ArrayList();
        a1.add(12); // 12 is object
        a1.add(100); // Addd
        System.out.println(a1);
        System.out.println(a1.add("xssas"));
        System.out.println(a1);
        System.out.println(a1.contains(14));
        System.out.println(a1.isEmpty());
        System.out.println(a1.size());
        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add("Dcdsc");
        a2.add("ccsc");
        System.out.println(a2);

        a1.addAll(a2); // AddALl
        System.out.println(a1);

    }
}
