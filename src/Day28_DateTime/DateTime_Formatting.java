package Day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        //Just like we did earlier we can also format dateTime method together

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:SS a, EEEE");

        // get this result:                          day/month/year  hour:minutes am
        LocalDateTime dateTime2 = LocalDateTime.of(2020,8,2,2,50,30);
        System.out.println(dateTime2.format(dateTimeFormatter));

        // we can apply String manipulation like this

        String st = dateTime2.format(dateTimeFormatter);
        System.out.println(st);

    }
}
