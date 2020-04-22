package Day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {

        byte a =6;
        String days = "";

        switch (a){
            case 1: // case values should be unique. And we can place them anywhere
                days = "Monday";
                break; // this means that this case is Closed
            case 2:
                days = "Tuesday";
                break;// the same here
            case 3:
                days = "Wednesday";
                break;// the same here
            case 4:
                days = "Thursday";
                break;
            case 5:
                days = "Friday";
                break;
            case 6:
                days = "Saturday";
                break;
            case 7:
                days = "Sunday";
                break;
            default:
                days = "Invalid";
                break;
        }

        System.out.println(days);

    }
}
