package Day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dtNow = LocalDateTime.now();
        System.out.println(dtNow);

        LocalDate date = LocalDate.of(2020,3,24);
        LocalTime time  = LocalTime.of(11,50,30);

        //instead of this we can combine both date and time together like BELOW:
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println(dateTime);

        // OR we can do it directly this way
        LocalDateTime dateTime2 = LocalDateTime.of(2020,3,24,11,50,30);
        System.out.println(dateTime2);


        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }
}
