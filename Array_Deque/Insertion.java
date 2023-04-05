package Array_Deque;
import java.util.ArrayDeque;

public class Insertion {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(6);
        a1.add(56);
        a1.add(9);
        System.out.println(a1);
        a1.addFirst(5);
        a1.offerFirst(10);
        System.out.println(a1);

        a1.addLast(5);
        a1.offerLast(10);
        System.out.println(a1);
    }
}
