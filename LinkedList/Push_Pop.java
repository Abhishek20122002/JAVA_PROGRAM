package LinkedList;
import java.util.*;

public class Push_Pop {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        stack.push("I'm");
        stack.push("Priyanshu");
        System.out.println(stack);
        System.out.println(stack.pop());

        stack.push("Baral");
        System.out.println(stack);
    }
}
