package Day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter the status code: ");
        int statusCode = scan.nextInt();
        String res1 = " ";
        String res2 = " ";


        // Multi-Branch If

        if (statusCode==200){
            res1="OK";
        }else if (statusCode==201){
            res1="Created";
        }else if (statusCode==202){
            res1="Accepted";
        }else {
            res1 = "Invalid status code";
        }
        System.out.println(res1);


        ////////     Ternary   ////////

        res2 =(statusCode==200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted":"Invalid";

        System.out.println(res2);
    }
}
