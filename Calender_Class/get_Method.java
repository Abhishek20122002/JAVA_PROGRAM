package Calender_Class;
import java.util.*;

public class get_Method {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is: "+c.get(Calendar.YEAR));
        System.out.println("Current month is: "+c.get(Calendar.MONTH));
        System.out.println("Current day is: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is: "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is: "+c.get(Calendar.MINUTE));
        System.out.println("Current second is: "+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
