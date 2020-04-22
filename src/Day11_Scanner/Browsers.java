package Day11_Scanner;

public class Browsers {
    public static void main(String[] args) {
          /*
        write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
         */

      //  int numOfBrowser = 1;

        String browserName = "hi";

        switch (browserName){
            case "safari":/* this is life If statement. You tell compiler if the name is uppercase
                            or lowercase then still execute the statement. But we shouldn't have break
                            between the case of the same block. If we have break then nothing will
                            get executed
                            */
            case "Safari":
                System.out.println("Safari is opening...");
                break;

            case "firefox": // the same here
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case "chrome": // the same here
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;

            case "opera": // the same here
            case "Opera":
                System.out.println("Opera is opening...");
                break;

            default:
                System.out.println("Invalid");
                break;
        }


    }
}
