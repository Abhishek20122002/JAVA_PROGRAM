package ArrayList;
import java.util.*;

public class IncreasingSize {
    public static void main(String[] args) throws Exception{
        try{
            ArrayList<String> s1 = new ArrayList<>();

            s1.add("Welcome");
            s1.add("to");
            s1.add("this");
            s1.add("program");
            System.out.println(s1);

            s1.ensureCapacity(50);
            System.out.println("ArrayList can store upto 50 elements");
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown"+e);
        }
    }
}
