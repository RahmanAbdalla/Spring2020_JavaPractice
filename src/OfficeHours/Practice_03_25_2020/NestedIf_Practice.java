package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {
    public static void main(String[] args) {

        int weekDays= 0;
        String days = " ";
        String days1= " "; // For Ternary

        if (weekDays>0 && weekDays<8){
            if (weekDays ==1){
                days = "Monday";
            }else if (weekDays==2){
                days = "Tuesday";
            }else if (weekDays==3){
                days = "Wednesday";
            }else if (weekDays==4){
                days = "Thursday";
            }else if (weekDays==5){
                days = "Friday";
            }else if (weekDays==6){
                days = "Saturday";
            }else {
                days = "Sunday";
            }
            System.out.println(days);

            // Ternary

            days1 = (weekDays ==1)?"Monday":(weekDays==2)?"Tuesday":(weekDays==3)?"Wednesday":
                    (weekDays==4)?"Thursday":(weekDays==5)?"Friday":(weekDays==6)?"Saturday":
                    (weekDays==7)?"Sunday":"Invalid";

            System.out.println(days1);
        }else {
            System.out.println("Invalid number");
        }
    }
}
