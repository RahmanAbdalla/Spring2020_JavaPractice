package Day25_Methods_Recap;

import java.io.StringReader;
import java.util.Scanner;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge",
				 "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				the method should return "Invalid"
				APPLY SWITCH STATEMENTS

 */
public class Driver {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter browser's name:");
        String browserName=scan.next();

        //we can also use a WHILE LOOP to ask the user again after invalid entry. LIKE THIS:
        while (! (browserName .equalsIgnoreCase("firefox") || browserName .equalsIgnoreCase("chrome")
            || browserName.equalsIgnoreCase("ie")||browserName.equalsIgnoreCase("safari")||
           browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("opera"))){
            System.out.println("Invalid Browser name: Please try again");

            browserName=scan.next();
        }

        String res = getDriver1(browserName);
        System.out.println(res);

        String res1 = getDriver2(browserName);
        System.out.println(res1);

        String res2 = getDriver3(browserName);
        System.out.println(res2);

    }//End of Main Method


    public static String getDriver1 (String st1){

            String browser="";

            switch (st1.toLowerCase()){//to get rid of case sensitivity
                case "chrome": browser = "Chrome Driver"; break;
      // case "chrome": return  "Chrome Driver";    we can also use this for all other cases but we don't need the break
                case "firefox": browser = "Fireforx Driver";break;
                case "ie": browser = "IE Driver";break;
                case "safari": browser = "Safari Driver";break;
                case "edge": browser = "Edge Driver";break;
                case "opera": browser = "Opera Driver";break;
                default: browser = "Invalid Driver";
            }

        return browser;
    }

    public static String getDriver2 (String  st){

        st=st.toLowerCase();

            if (st.equalsIgnoreCase("friefox")){
                return  "Firefox Driver";
            }else if (st.equalsIgnoreCase("chrome")){
                return  "Chrome Driver";
            }else if (st.equalsIgnoreCase("ie")){
                return  "IE Driver";
            }else if (st.equalsIgnoreCase("safari")){
                return  "Safari Driver";
            }else if (st.equalsIgnoreCase("edge")){
                return  "Edge Driver";
            }else if (st.equals("opera")){
                return  "Opera Driver";
            }else {
                return  "Invalid Driver";
        }
    }

    public static String getDriver3 (String browserName){
        browserName= browserName.toLowerCase();
        String res = "";
        res = (browserName.equals("chrome"))?"Chrome Driver":(browserName.equals("firefox"))?"Firefox Driver":
           (browserName.equals("safari"))?"Safari Driver":(browserName.equals("edge"))?"Edge Driver":
           (browserName.equals("opera"))?"Opera Driver":(browserName.equals("ie"))?"IE Driver":"Invalid Driver";

        return res;
    }


}
