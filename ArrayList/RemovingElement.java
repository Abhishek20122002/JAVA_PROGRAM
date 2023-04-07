package ArrayList;

import java.util.*;

public class RemovingElement {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Priyanshu");
        a1.add("Baral");

        a1.add(0, "I'm");
        System.out.println(a1);

        a1.remove("I'm");
        a1.remove(1);
        System.out.println(a1);
    }
}
