package ArrayList;

import java.util.*;
import java.lang.*;

public class Add {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Priyanshu");
        a1.add("Baral");
        //a1.remove(0);

        a1.add(0,"I'm");
        System.out.println(a1);
        for (int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+" ");
        }
        System.out.println();

        for (String s : a1) {
            System.out.print(s + " ");
        }
    }
}