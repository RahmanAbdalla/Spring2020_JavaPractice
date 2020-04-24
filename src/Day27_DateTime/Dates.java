package Day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 4,23);

        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1990,4,25);
        System.out.println(birthday);

        // 1: isAfter(date);  Method
        boolean result = date1.isAfter(birthday); //true coz 2020 is after 1990
        System.out.println(result);//true

        // 2: isBefore(date); Method
        boolean result2 = date1.isBefore(birthday);//false coz 1990 is before 2020
        System.out.println(result2);// false

        // 3: isEqual(date);
        boolean result3 = date1.equals(birthday);//false
        System.out.println(result3);//false

        // 4: isLeapYear(); Method
        boolean result4 = date1.isLeapYear();
        System.out.println(result4);// true

        System.out.println("========================================");

        //This is to declare the current year. This one is useful
        LocalDate now = LocalDate.now();
        System.out.println("Today is :"+now);

        //we can apply string manipulation here and change dates to string
        String str = now.toString();
        System.out.println(str.replace("-", "/"));

    }
}
