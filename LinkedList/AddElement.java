package LinkedList;
import java.util.*;

public class AddElement {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();

        a1.add("Priyanshu");
        a1.add("Baral");
        a1.add(0, "I'm");
        System.out.println(a1);
        a1.addFirst("Nice");
        a1.addLast("Hello");
        System.out.println(a1);
    }
}
