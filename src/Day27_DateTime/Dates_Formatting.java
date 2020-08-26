package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        //We can apply datetime formatter to format dates and time. Like this
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//Month MUST be in Uppercase

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));// we call the formatter we created above by calling format()


        /*
        create a date called birthday: month/Days/Year
         */
        //EEEE ==> writes full name of the day / EE ==> write the beginning letters
        //MMMM ==> writes full name of the month / MMM ==> writes three beginning letters of the month

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EE MMMM/dd/yy");

        LocalDate birhtday = LocalDate.of(2002,4,23);
        System.out.println(birhtday.format(dtf1));

        //today's date
        LocalDate now = LocalDate.now();
        System.out.println(now.format(dtf1));

    }
}
