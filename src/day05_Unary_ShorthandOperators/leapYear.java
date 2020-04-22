package day05_Unary_ShorthandOperators;

public class leapYear {
    /*
    . create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
     */

    public static void main(String[] args) {
        short year = 2020;
        // leapYear: year % 2 == 0
        // of returns true ==> leapYear,

        boolean leapYear = year % 2== 0; // if the year can be devided by 2 without remainder, then it's leap year
        // System.out.println(year+ " is leap year: "+ leapYear);

        String result = year + " is leap year: "+ leapYear;
        System.out.println(result);
}

}
