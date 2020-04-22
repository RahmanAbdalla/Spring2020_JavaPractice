package Day08_IfStatements;

public class DaysOfMonth {
    public static void main(String[] args) {
        /*
        2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
         */

        byte month = 4;

    boolean day28 = month == 2;

    boolean days30 =month ==4 || month==6 || month ==9 || month ==11;
    boolean days31 = !days30 && !day28;

        int day = 0;

        if (day28){
        //System.out.println("This month has 28 days");
        day = 28;
        }
        if (days30){
           // System.out.println("This month has 30 days");
            day = 30;
        }
        if (days31){
            //System.out.println("This month has 31 days");
            day = 31;
        }

        System.out.println("This month has "+day+" days");




    }
}
