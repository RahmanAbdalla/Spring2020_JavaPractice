package Day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");//if hour is greater than 12 it still print PM
                                                                        // not AM EVEN if we write (a) in the formatter

        LocalTime time1 = LocalTime.of(12,0,50);// 12 hours :30 minutes PM
        System.out.println(time1.format(dtf));


    }
}
