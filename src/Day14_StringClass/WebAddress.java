package Day14_StringClass;

import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String webAddress = "www.CyBertek.com";
        webAddress.toLowerCase(); // first we MUST convert it to lowercase coz the user may
                                    // enter it in uppercase

        boolean validWeb = webAddress.startsWith("www.");
        boolean validWe2 = webAddress.endsWith(".gov")||webAddress.endsWith(".com")||
                webAddress.endsWith(".edu")||webAddress.endsWith(".net")||
                webAddress.endsWith(".gov");

        if (validWeb && validWe2){
            System.out.println("Valid web address");
        }else {
            System.out.println("Invalid web address");
        }

    }
}
