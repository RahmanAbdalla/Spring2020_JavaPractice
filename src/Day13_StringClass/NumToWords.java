package Day13_StringClass;

import java.util.Scanner;

public class NumToWords {
    public static void main(String[] args) {
        /*
        write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        String res = "";

            switch (num){
                case 1:
                 res= "One";
                 break;
                case 2:
                    res= "Two";
                    break;
                case 3:
                    res= "Three";
                    break;
                case 4:
                    res= "Four";
                    break;
                case 5:
                    res= "Five";
                    break;
                case 6:
                    res= "Six";
                    break;
                case 7:
                    res= "Seven";
                    break;
                 case 8:
                    res= "Eight";
                    break;
                case 9:
                    res= "Nine";
                    break;
                default:
                    res = "Invalid";
            }
            System.out.println(res);

            //// Ternary  /////
            String res2 = "";
            res2 = (num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":
                    (num==5)?"Five":(num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight":
                            (num==9)?"Nine":"Invalid";
        System.out.println(res2);

    }
}
