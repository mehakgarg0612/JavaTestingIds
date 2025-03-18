package Collllections;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("ewew");
        s.push("dccwee");
        s.push(23);
        s.push(34);
        System.out.println(s.search(23));
        System.out.println(s.search(230));
        System.out.println(s.empty());
        System.out.println(s);

//        s.pop();
//        System.out.println(s.peek());
//        System.out.println(s);
    }
}
