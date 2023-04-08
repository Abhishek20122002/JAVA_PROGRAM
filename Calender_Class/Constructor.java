package Calender_Class;

import java.util.Calendar;
import java.util.TimeZone;

public class Constructor {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
    }
}
