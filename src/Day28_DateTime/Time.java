package Day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        DateTimeFormatter tmf = DateTimeFormatter.ofPattern("hh.mm.");
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime custom = LocalTime.of(14,45,50);
        System.out.println(custom);
    }
}
