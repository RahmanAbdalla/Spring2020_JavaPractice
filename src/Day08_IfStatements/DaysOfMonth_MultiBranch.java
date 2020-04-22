package Day08_IfStatements;

public class DaysOfMonth_MultiBranch {
    public static void main(String[] args) {

        int month = 4;
        String result = " ";
        byte days = 0;

        if (month==1){
            days = 31;
            result = "January has "+days+ " days";

        }
        else if (month==2){
            days = 31;
            result = "February has 28 or 29 days";
        }
        else if (month==3){
            days = 31;
            result = "March has 31 days";
        }
        else if (month==4){
            days = 30;
            result = "April has 30 days";
        }
        else if (month==5){
            days = 31;
            result = "May has 31 days";
        }
        else if (month==6){
            days = 30;
            result = "June has 30 days";
        }
        else if (month==7){
            days = 31;
            result = "July has 31 days";
        }
        else if (month==8){
            days = 31;
            result = "August has 31 days";
        }
        else if (month==9){
            days = 30;
            result = "November has 30 days";
        }
        else if (month==10){
            days = 31;
            result = "October has 31 days";
        }
        else if (month==11){
            days = 30;
            result = "November has 30 days";
        }
        else if (month==12){
            days = 31;
            result = "December has 31 days";
        }else {
            System.out.println("Invalid number");
        }

        System.out.println(result);


    }
}
