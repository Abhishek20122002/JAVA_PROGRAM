package Calender_Class;
import java.util.*;
public class get_Maximum_Method {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("The maximum number of weeks in a year: "+c.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}
