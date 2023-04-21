package LinkedList;
import java.util.*;

public class Peek_Method {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();

        a1.add("Priyanshu");
        a1.add("Baral");
        a1.add(0, "I'm");
        System.out.println(a1);
        System.out.println(a1.peek());
        System.out.println(a1.peekFirst());
        System.out.println(a1.peekLast());
    }
}
