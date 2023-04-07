package ArrayList;

import java.util.*;

public class Merging {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        a1.add("I'm");
        a1.add("Priyanshu");
        a1.add("Baral");

        a2.add("Welcome");
        a2.add("to");
        a2.add("this");
        a2.add("program");

        a1.addAll(a2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
