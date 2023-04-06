package ArrayList;

import java.util.ArrayList;

public class ChangingElement {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Priyanshu");
        a1.add("Baral");

        a1.add(0,"I'm");
        System.out.println(a1);

        a1.set(0,"Hi!");
        System.out.println(a1);
    }
}
