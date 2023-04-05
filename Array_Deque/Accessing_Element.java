package Array_Deque;
import java.util.*;

public class Accessing_Element {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(6);
        a1.add(56);
        a1.add(9);
        a1.add(10);
        a1.add(91);
        a1.add(19);

        System.out.println(a1.getFirst());
        System.out.println(a1.peekFirst());

        System.out.println(a1.getLast());
        System.out.println(a1.peekLast());
    }
}
