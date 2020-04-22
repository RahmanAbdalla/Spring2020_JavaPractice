package Day10_Switch_Scanner;

public class Days {
    public static void main(String[] args) {
        /*
        write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
         */
        // Day of the week

        int num = 9;
        String days = "";
        String day2= "";

        if (num<=7 && num >=1){

            if (num==1)
                days="Monday";
            else if (num==2)
                days="Tuesday";
            else if (num==3)
                days="Wednesday";
            else if (num==4)
                days="Thursday";
            else if (num==5)
                days="Friday";
            else if (num==6)
                days="Saturday";
            else
                days = "Sunday";

            System.out.println(days);

        }else {
            System.out.println("Invalid number");
        }


               // *****  Using Ternary: *********

        day2 =(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":
                (num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday"
                        :"Invalid number";

        System.out.println(day2);


    }
}
