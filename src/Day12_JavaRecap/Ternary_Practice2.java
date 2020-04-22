package Day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        /*
       Create a new switch statement using char instead of int.
        Create a new char variable
        Create a switch statement testing for A, B, C, D or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char cha = scan.next().charAt(0);

        ///////////    switch    /////////////


        String res1 = " ";

        switch (cha){
            case 'A':
                res1= "A is selected";
                break;
            case 'B':
                res1= "B is selected";
                break;
            case 'C':
                res1= "C is selected";
                break;
            case 'D':
                res1= "D is selected";
                break;

            default:
                res1= "Invalid character";
        }
        System.out.println(res1);


        ///////////////    Ternary    //////////////

        String res2=" ";

        res2 =(cha=='A')?"A":(cha=='B')?"B":(cha=='C')?"C":(cha=='D')?"D":"Invalid char character";

        System.out.println(res2);


    }
}
