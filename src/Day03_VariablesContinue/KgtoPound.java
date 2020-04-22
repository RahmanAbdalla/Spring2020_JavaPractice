package Day03_VariablesContinue;

public class KgtoPound {
    public static void main(String[] args) {
        int HoursOfDay = 24;
        int DayofWeek = 7;
        int WeeksOfMonth = 4;
        int MonthofYear = 12;

        int TotalHoursPerWeek = HoursOfDay*DayofWeek;
        int TotalDayOfMonth = DayofWeek*WeeksOfMonth;
        int TotalDayOfYear = DayofWeek*WeeksOfMonth*MonthofYear;
        int TotalHoursofYear = HoursOfDay*DayofWeek*WeeksOfMonth*MonthofYear;

        System.out.println("The total hours in a year is: "+TotalHoursofYear);
        System.out.println("The total days in a month is: "+TotalDayOfMonth);
        System.out.println("The total hours in a week is: "+TotalHoursPerWeek);
        System.out.println("The total day in a year is: "+TotalDayOfYear);

    }
}
